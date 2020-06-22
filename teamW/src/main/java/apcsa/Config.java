package apcsa;

import java.awt.Color;

public final class Config {
        public static final int WIDTH = 720;
        public static final int HEIGHT = WIDTH / 12 * 9;
        public static final int NUMBER_OF_BUFFERS = 3;
        public static final int DEFAULT_PLAYER_WIDTH = 64;
        public static final int DEFAULT_PLAYER_HEIGHT = 64;
        public static final int DEFAULT_BAT_WIDTH = 32;
        public static final int DEFAULT_BAT_HEIGHT = 32;
        public static final int TILE_WIDTH = 32;
        public static final int TILE_HEIGHT = 32;
        public static final int ROOM_WIDTH = 21;
        public static final int ROOM_HEIGHT = 15;
        public static final double DEFAULT_PLAYER_SPEED = 1.75;
        public static final double DEFAULT_BAT_SPEED = 1.5;
        public static final int DEFAULT_PLAYER_HEALTH = 115;
        public static final int DEFAULT_BAT_HEALTH = 50;
        public static final int DEFAULT_BAT_DAMAGE = 2;
        public static final int DEFAULT_PLAYER_DAMAGE = 4;
        public static final Color BACKGROUND = new Color(37, 19, 26);
        public static final int ATTACK_SIZE = 32;
        public static final int SPAWN_X = (WIDTH - (TILE_WIDTH * 3)) / 2;
        public static final int SPAWN_Y = (HEIGHT - (TILE_HEIGHT * 3)) / 2;
}