package apcsa.states;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;

import apcsa.Config;
import apcsa.Handler;

public class HelpState extends State {

    public HelpState() {
        super();
    }
    
    @Override
    public void tick() {
        if(Handler.getKeyInput().keyEnter()) {
            State.setState(Handler.getGameState());
        }
    }

    @Override
    public void render(Graphics g) {
        g.setColor(Color.WHITE);
        g.setFont(new Font("TimesRoman", Font.PLAIN, 20));
        g.drawString("Controls: ", 10, 25);
        g.drawString("W - WALK UP", 10, 75);
        g.drawString("A - WALK LEFT", 10, 100);
        g.drawString("S - WALK RIGHT", 10, 125);
        g.drawString("D - WALK DOWN", 10, 150);
        g.drawString("I - ATTACK UP", 10, 200);
        g.drawString("J - ATTACK LEFT", 10, 225);
        g.drawString("L - ATTACK RIGHT", 10, 250);
        g.drawString("K - ATTACK DOWN", 10, 275);
        g.drawString("Press Enter to Start", 10, Config.HEIGHT - 75);
    }

}