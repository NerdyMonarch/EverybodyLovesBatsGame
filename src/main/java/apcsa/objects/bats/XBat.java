package apcsa.objects.bats;

import apcsa.Config;

public class XBat extends Bat {
        
    public XBat(int x, int y) {
        super(x, y, 0);
    }
    
    public void move() {
        x += velX * 1.5;
        y += velY;

        if(x < Config.TILE_WIDTH || x > ((Config.WIDTH - (Config.TILE_WIDTH * 4)) + (Config.DEFAULT_BAT_WIDTH / 2))) {
            velX *= -1;
        }
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