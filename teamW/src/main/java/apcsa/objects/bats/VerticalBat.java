package apcsa.objects.bats;

import apcsa.Config;

public class VerticalBat extends Bat {
        
    public VerticalBat(int x, int y) {
        super(x, y, 0);
    }
    
    public void move() {
        y += velY * 2;

        if(y < Config.TILE_HEIGHT || y > (Config.HEIGHT - (Config.TILE_HEIGHT * 4))) {
            velY *= -1;
        }
    }

    @Override
    public void tick() {
        super.tick();
        move();
    }
}