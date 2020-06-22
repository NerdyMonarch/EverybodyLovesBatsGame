package apcsa.world;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.awt.Graphics;

import apcsa.Config;
import apcsa.tiles.TileHandler;

public class Room {
    private Scanner file;
    private int[][] room;

    public Room(String path) {
        try {
            this.file = new Scanner(new File(path));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        this.room = new int[Config.ROOM_WIDTH][Config.ROOM_HEIGHT];
        loadRoom();
    }

    public void loadRoom() {
        for(int y = 0; y < Config.ROOM_HEIGHT; y++) {
            for(int x = 0; x < Config.ROOM_WIDTH; x++) {
                if(file.hasNextInt()) {
                    room[x][y] = file.nextInt();
                }
            }
        }
    }

    public void render(Graphics g) {
        for(int y = 0; y < Config.ROOM_HEIGHT; y++) {
            for(int x = 0; x < Config.ROOM_WIDTH; x++) {
                TileHandler.getTile(room[x][y]).render(g, x * Config.TILE_WIDTH, y * Config.TILE_HEIGHT);
            }
        }
    }
}