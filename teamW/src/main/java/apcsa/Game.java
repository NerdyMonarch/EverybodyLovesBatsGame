package apcsa;

import java.awt.Canvas;
import java.awt.Graphics;
import java.awt.image.BufferStrategy;

import apcsa.graphics.Window;
import apcsa.inputs.KeyInput;
import apcsa.inputs.MouseInput;
import apcsa.states.*;

public class Game implements Runnable {
    private String title;
    private boolean running;
    private Window window;
    private Thread thread;
    private GameState gameState;
    private MenuState menuState;
    private OverState overState;
    private HelpState helpState;
    private KeyInput keyInput;
    private MouseInput mouseInput;

    public Game(String title) {
        this.title = title;
        this.running = false;
        this.window = new Window(this.title);
        Handler.setGame(this);
        stateInit();
        inputInit();
    }

    public Window getWindow() {
        return window;
    }

    public KeyInput getKeyInput() {
        return keyInput;
    }

    public MouseInput getMouseInput() {
        return mouseInput;
    }

    public GameState getGameState() {
        return gameState;
    }

    public HelpState getHelpState() {
        return helpState;
    }

    public MenuState getMenuState() {
        return menuState;
    }

    public OverState getOverState() {
        return overState;
    }

    public void resetGame() {
        gameState = new GameState();
    }
    
    public void stateInit() {
        this.gameState = new GameState();
        this.menuState = new MenuState();
        this.overState = new OverState();
        this.helpState = new HelpState();
        State.setState(menuState);
    }

    public void inputInit() {
        this.keyInput = new KeyInput();
        Handler.getFrame().addKeyListener(keyInput);

        this.mouseInput = new MouseInput();
        Handler.getFrame().addMouseListener(mouseInput);
        Handler.getFrame().addMouseMotionListener(mouseInput);
        Handler.getCanvas().addMouseListener(mouseInput);
        Handler.getCanvas().addMouseMotionListener(mouseInput);
    }

    public synchronized void start() {
        thread = new Thread(this);
        thread.start();
        running = true;
    }

    public void run() {
        long lastTime = System.nanoTime();
        double ticksPerSecond = 60;
        double nanoPerTick = 1000000000 / ticksPerSecond;
        double delta = 0;
        long timer = System.currentTimeMillis();
        int frames = 0;
        while (running) {
            long now = System.nanoTime();
            delta += (now - lastTime) / nanoPerTick;
            lastTime = now;
            while (delta >= 1) {
                tick();
                delta--;
            }
            if (running) {
                render();
            }
            frames++;

            if (System.currentTimeMillis() - timer > 1000) {
                timer += 1000;
                System.out.println("FPS: " + frames);
                frames = 0;
            }
        }

        stop();
    }

    public synchronized void stop() {
        try {
            thread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        running = false;
    }

    private void render() {
        Canvas canvas = Handler.getCanvas();
        BufferStrategy buffer = canvas.getBufferStrategy();
        if(buffer == null) {
            canvas.createBufferStrategy(Config.NUMBER_OF_BUFFERS);
            return;
        }

        Graphics g = buffer.getDrawGraphics();
        g.clearRect(0, 0, Config.WIDTH, Config.HEIGHT);
        g.setColor(Config.BACKGROUND);
        g.fillRect(0, 0, Config.WIDTH, Config.HEIGHT);

        if(State.getState() != null) {
            State.getState().render(g);
        }

        buffer.show();
        g.dispose();
    }

    private void tick() {
        if(State.getState() != null) {
            State.getState().tick();
        }
    }
}