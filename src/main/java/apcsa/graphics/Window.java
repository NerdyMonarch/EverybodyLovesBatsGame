package apcsa.graphics;

import javax.swing.JFrame;
import java.awt.Dimension;
import java.awt.Canvas;

import apcsa.Config;

public class Window {
    
    private JFrame frame;
    private Dimension dimension;
    private Canvas canvas;

    public Window(String title) {
        this.frame = new JFrame(title);
        this.dimension = new Dimension(Config.WIDTH, Config.HEIGHT);
        this.canvas = new Canvas();
        startDisplay();
    }

    private void startDisplay() {
        frame.setPreferredSize(dimension);
        frame.setMinimumSize(dimension);
        frame.setMaximumSize(dimension);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setResizable(false);
        frame.setVisible(true);

        addCanvas();
    }

    private void addCanvas() {
        canvas.setPreferredSize(dimension);
        canvas.setMinimumSize(dimension);
        canvas.setMaximumSize(dimension);

        canvas.setFocusable(false);

        frame.add(canvas);
        frame.pack();
    }
    
    public JFrame getFrame() {
        return frame;
    }

    public Canvas getCanvas() {
        return canvas;
    }

    public void updateTitle(String s) {
        frame.setTitle(s);
    }
}