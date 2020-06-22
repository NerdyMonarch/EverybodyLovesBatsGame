package apcsa.states;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;

import apcsa.Config;
import apcsa.Handler;
import apcsa.graphics.Assets;
import apcsa.sounds.Sound;

public class MenuState extends State {
    private Sound song;
    
    public MenuState() {
        super();
        song = new Sound(Assets.getSongPath());
        song.loop();
        song.play();
    }
    
    @Override
    public void tick() {
        if(Handler.getMouseInput().isLeftPressed()) {
            State.setState(Handler.getHelpState());
        }
    }

    @Override
    public void render(Graphics g) {
        g.drawImage(Assets.getMenu(0), 0, 0, Config.WIDTH, Config.HEIGHT, null);
        g.drawImage(Assets.getMenu(1), 0, 32, Config.WIDTH, 80, null);
        g.setColor(Config.BACKGROUND);
        g.fillRect(185, Config.HEIGHT - 115, 340, 50);
        g.setColor(Color.WHITE);
        g.setFont(new Font("TimesRoman", Font.PLAIN, 30));
        g.drawString("Click Anywhere to Start", Config.WIDTH / 2 - 160, Config.HEIGHT - 75);
    }
    
}