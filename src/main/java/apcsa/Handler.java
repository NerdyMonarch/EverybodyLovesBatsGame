package apcsa;

import java.awt.Canvas;
import javax.swing.JFrame;

import apcsa.graphics.Window;
import apcsa.inputs.*;
import apcsa.objects.Player;
import apcsa.objects.Spawner;
import apcsa.states.*;
import apcsa.world.Room;

public class Handler {
    private static Game game;

    public static void setGame(Game game) {
        Handler.game = game;
    }

    public static Window getWindow() {
        return game.getWindow();
    }

    public static Canvas getCanvas() {
        return game.getWindow().getCanvas();
    }

    public static JFrame getFrame() {
        return game.getWindow().getFrame();
    }

    public static KeyInput getKeyInput() {
        return game.getKeyInput();
    }

    public static MouseInput getMouseInput() {
        return game.getMouseInput();
    }

    public static GameState getGameState() {
        return game.getGameState();
    }

    public static HelpState getHelpState() {
        return game.getHelpState();
    }

    public static MenuState getMenuState() {
        return game.getMenuState();
    }

    public static OverState getOverState() {
        return game.getOverState();
    }

    public static void resetGame() {
        game.resetGame();
    }

    public static Room getRoom() {
        return getGameState().getRoom();
    }

    public static Spawner getSpawner() {
        return getGameState().getSpawner();
    }

    public static Player getPlayer() {
        return getGameState().getPlayer();
    }
}