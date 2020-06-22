package apcsa.objects;


import java.awt.Graphics;
import java.awt.Rectangle;

public abstract class Entity {
    protected double x;
    protected double y;

    public Entity(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public abstract Rectangle getBounds();
    public abstract void tick();
    public abstract void render(Graphics g);
}