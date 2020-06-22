package apcsa.inputs;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class KeyInput extends KeyAdapter {
    private boolean[] keys;

    public KeyInput() {
        keys = new boolean[256];
    }

    public boolean keyEnter() {
        return keys[KeyEvent.VK_ENTER];
    }

    public boolean keyW() {
        return keys[KeyEvent.VK_W];
    }

    public boolean keyA() {
        return keys[KeyEvent.VK_A];
    }

    public boolean keyS() {
        return keys[KeyEvent.VK_S];
    }

    public boolean keyD() {
        return keys[KeyEvent.VK_D];
    }

    public boolean keyI() {
        return keys[KeyEvent.VK_I];
    }

    public boolean keyJ() {
        return keys[KeyEvent.VK_J];
    }

    public boolean keyK() {
        return keys[KeyEvent.VK_K];
    }

    public boolean keyL() {
        return keys[KeyEvent.VK_L];
    }

    @Override
    public void keyPressed(KeyEvent e) {
        keys[e.getKeyCode()] = true;
    }

    @Override
    public void keyReleased(KeyEvent e) {
        keys[e.getKeyCode()] = false;
    }
}