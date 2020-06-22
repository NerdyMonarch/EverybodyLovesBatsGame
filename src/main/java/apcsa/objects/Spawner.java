package apcsa.objects;

import java.util.ArrayList;
import java.util.Random;

import apcsa.Config;
import apcsa.Handler;
import apcsa.Stats;
import apcsa.objects.bats.*;

import java.awt.Graphics;

public class Spawner {
    private ArrayList<Bat> bats;
    private Random r;
    private int level;

    public Spawner() {
        bats = new ArrayList<Bat>();
        r = new Random();
        level = 0;
        levelSpawn();
    }

    public ArrayList<Bat> getBats() {
        return bats;
    }

    public void tick() {
        if(levelComplete()) {
            levelSpawn();
        }
        removeDead();
        for(int i = 0; i < bats.size(); i++) {
            bats.get(i).tick();
        }
    }

    public void render(Graphics g) {
        for(int i = 0; i < bats.size(); i++) {
            bats.get(i).render(g);
        }
    }

    public void removeDead() {
        int i = 0;
        while(i < bats.size()) {
            if(bats.get(i).isDead()) {
                bats.remove(i);
                Stats.batKilled();
            }
            else {
                i++;
            }
        }
    }

    public int spawnX() {
        if(r.nextBoolean()) {
            return (2 * Config.TILE_WIDTH) + r.nextInt(Config.TILE_WIDTH);
        }
        else {
            return Config.WIDTH - (5 * Config.TILE_WIDTH) - r.nextInt(Config.TILE_WIDTH);
        }
    }

    public int spawnY() {
        return (2 * Config.TILE_HEIGHT) + r.nextInt(Config.HEIGHT - (7 * Config.TILE_HEIGHT));
    }

    public int getLevel() {
        return level;
    }

    public boolean levelComplete() {
        return bats.size() <= 0;
    }

    public void levelSpawn() {
        int total = 0;
        if(level > 1) {
            Handler.getPlayer().heal();
        }
        if(level <= 15) {
            total = (int) (5 * Math.sqrt(0.25 * level)) + r.nextInt(3);
        }
        else {
            total = (int) (0.5 * (level + 7)) + r.nextInt(3);
        }
        for(int i = 0; i < total; i++) {
            int batId = r.nextInt(19);
            if(batId < 5) {
                bats.add(new BasicBat(spawnX(), spawnY()));
            }
            else if(batId < 10) {
                bats.add(new XBat(spawnX(), spawnY()));
            }
            else if(batId < 15) {
                bats.add(new YBat(spawnX(), spawnY()));
            }
            else if(batId < 17) {
                bats.add(new HorizontalBat(spawnX(), spawnY()));
            }
            else if(batId < 19) {
                bats.add(new VerticalBat(spawnX(), spawnY()));
            }
        }
        level++;
        Stats.newLevel();
    }
}