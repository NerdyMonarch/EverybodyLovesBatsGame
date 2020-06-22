package apcsa.tiles;

import java.awt.Color;
import java.awt.Graphics;

import apcsa.Config;

public class Default extends Tile {

    public Default(int id) {
        super(id);
    }

    @Override
    public void tick() {

    }

    @Override
    public void render(Graphics g, int x, int y) {
        g.setColor(Color.WHITE);
        g.fillRect(x, y, Config.TILE_WIDTH, Config.TILE_HEIGHT);

    }

    @Override
    public void setIndex(int i) {
        this.index = i;
    }
    
}