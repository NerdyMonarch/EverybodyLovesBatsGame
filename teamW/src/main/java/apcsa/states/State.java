package apcsa.states;

import java.awt.Graphics;

public abstract class State {
    private static State current;

    public State() {
        // NULL
    }

    public static void setState(State state) {
        current = state;
    }

    public static State getState() {
        return current;
    }

    public abstract void tick();
    public abstract void render(Graphics g);
}