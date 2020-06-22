package apcsa.objects.bats;

import java.awt.Graphics;
import java.awt.Rectangle;

import apcsa.Config;
import apcsa.graphics.Animation;
import apcsa.graphics.Assets;
import apcsa.objects.Entity;

public abstract class Bat extends Entity {
    protected double velX;
    protected double velY;
    private int health;
    private boolean dead;
    private final int id;
    private Animation batAnimation;

    public Bat(int x, int y, int id) {
        super(x, y);
        this.velX = Config.DEFAULT_BAT_SPEED;
        this.velY = Config.DEFAULT_BAT_SPEED;
        this.health = Config.DEFAULT_BAT_HEALTH;
        this.dead = false;
        this.id = id;
        batAnimation = new Animation(200, Assets.getBatAnimation());
    }

    public void move() {
        x += velX;
        y += velY;

        if(x < Config.TILE_WIDTH || x > ((Config.WIDTH - (Config.TILE_WIDTH * 4)) + (Config.DEFAULT_BAT_WIDTH / 2))) {
            velX *= -1;
        }
        if(y < Config.TILE_HEIGHT || y > (Config.HEIGHT - (Config.TILE_HEIGHT * 4))) {
            velY *= -1;
        }
    }

    public Rectangle getBounds() {
        return new Rectangle((int) x, (int) y, Config.DEFAULT_BAT_WIDTH, Config.DEFAULT_BAT_HEIGHT);
    }

    public void hurt() {
        health -= Config.DEFAULT_PLAYER_DAMAGE;
    }

    public void checkDeath() {
        if(health <= 0) {
            dead = true;
        }
    }

    public boolean isDead() {
        return dead;
    }

    public int getId() {
        return id;
    }

    @Override
    public void tick() {
        checkDeath();
        batAnimation.tick();
    }

    @Override
    public void render(Graphics g) {
        g.drawImage(batAnimation.getCurrentFrame(), (int) x, (int) y, Config.DEFAULT_BAT_WIDTH, Config.DEFAULT_BAT_HEIGHT, null);
    }
}