package apcsa.objects.bats;

import apcsa.Config;

public class HorizontalBat extends Bat {
        
    public HorizontalBat(int x, int y) {
        super(x, y, 0);
    }
    
    public void move() {
        x += velX * 2;

        if(x < Config.TILE_WIDTH || x > ((Config.WIDTH - (Config.TILE_WIDTH * 4)) + (Config.DEFAULT_BAT_WIDTH / 2))) {
            velX *= -1;
        }
    }

    @Override
    public void tick() {
        super.tick();
        move();
    }
}