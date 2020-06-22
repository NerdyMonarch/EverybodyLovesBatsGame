package apcsa.states;

import java.awt.Graphics;
import java.awt.Color;
import java.awt.Font;

import apcsa.Config;
import apcsa.Handler;
import apcsa.graphics.Assets;

public class OverState extends State {

    public OverState() {
        super();
    }
    
    @Override
    public void tick() {
        if(Handler.getMouseInput().isLeftPressed()) {
            Handler.resetGame();
            State.setState(Handler.getGameState());
        }
    }

    @Override
    public void render(Graphics g) {
        g.drawImage(Assets.getGameOver(), 0, 0, Config.WIDTH, Config.HEIGHT, null);
        g.setColor(Config.BACKGROUND);
        g.fillRect(160, Config.HEIGHT - 115, 390, 50);
        g.setColor(Color.WHITE);
        g.setFont(new Font("TimesRoman", Font.PLAIN, 30));
        g.drawString("Click Anywhere to Play Again", Config.WIDTH / 2 - 200, Config.HEIGHT - 75);
    }
    
}