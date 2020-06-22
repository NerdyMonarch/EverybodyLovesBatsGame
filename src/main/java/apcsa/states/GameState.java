package apcsa.states;

import java.awt.Graphics;

import apcsa.Config;
import apcsa.Stats;
import apcsa.graphics.Assets;
import apcsa.objects.Player;
import apcsa.objects.Spawner;
import apcsa.world.Room;

public class GameState extends State {

    private Room room;
    private Player player;
    private Spawner spawner;

    public GameState() {
        super();
        this.room = new Room(Assets.getWorldPath());
        this.player = new Player(Config.SPAWN_X, Config.SPAWN_Y);
        Stats.reset();
        this.spawner = new Spawner();
    }

    public Room getRoom() {
        return room;
    }

    public Spawner getSpawner() {
        return spawner;
    }

    public Player getPlayer() {
        return player;
    }
    
    @Override
    public void tick() {
        player.tick();
        spawner.tick();
        Stats.tick();
    }

    @Override
    public void render(Graphics g) {
        room.render(g);
        player.render(g);
        spawner.render(g);
    }
}