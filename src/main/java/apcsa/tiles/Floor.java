package apcsa.tiles;

import java.awt.Graphics;

import apcsa.Config;
import apcsa.graphics.Assets;

public class Floor extends Tile {

    public Floor(int id) {
        super(id);
    }

    @Override
    public void tick() {
        // NULL
    }

    @Override
    public void render(Graphics g, int x, int y) {
        g.drawImage(Assets.getFloors()[index], x, y, Config.TILE_WIDTH, Config.TILE_HEIGHT, null);
    }

    @Override
    public void setIndex(int i) {
        if(i > Assets.getFloors().length) {
            index = 0;
        }
        else {
            index = i;
        }
    }
    
}