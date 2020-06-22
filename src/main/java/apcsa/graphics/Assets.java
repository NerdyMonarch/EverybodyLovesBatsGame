package apcsa.graphics;

import java.awt.image.BufferedImage;

public class Assets {
    private static BufferedImage[] menuAssets = {
        ImageLoader.loadImage("src/main/resources/textures/menu/background.jpg"),
        ImageLoader.loadImage("src/main/resources/textures/menu/title.png")
    };

    public static BufferedImage getMenu(int i) {
        return menuAssets[i];
    }

    private static BufferedImage[] floors = {
        ImageLoader.loadImage("src/main/resources/textures/tiles/floors/floor_0.png"),
        ImageLoader.loadImage("src/main/resources/textures/tiles/floors/floor_1.png"),
        ImageLoader.loadImage("src/main/resources/textures/tiles/floors/floor_2.png"),
        ImageLoader.loadImage("src/main/resources/textures/tiles/floors/floor_3.png"),
        ImageLoader.loadImage("src/main/resources/textures/tiles/floors/floor_4.png"),
        ImageLoader.loadImage("src/main/resources/textures/tiles/floors/floor_5.png"),
        ImageLoader.loadImage("src/main/resources/textures/tiles/floors/floor_6.png"),
        ImageLoader.loadImage("src/main/resources/textures/tiles/floors/floor_7.png")
    };

    public static BufferedImage[] getFloors() {
        return floors;
    }

    private static BufferedImage[] walls = {
        ImageLoader.loadImage("src/main/resources/textures/tiles/walls/wall_bottom_0.png"),
        ImageLoader.loadImage("src/main/resources/textures/tiles/walls/wall_bottom_1.png"),
        ImageLoader.loadImage("src/main/resources/textures/tiles/walls/wall_left_0.png"),
        ImageLoader.loadImage("src/main/resources/textures/tiles/walls/wall_left_1.png"),
        ImageLoader.loadImage("src/main/resources/textures/tiles/walls/wall_left_corner.png"),
        ImageLoader.loadImage("src/main/resources/textures/tiles/walls/wall_right_0.png"),
        ImageLoader.loadImage("src/main/resources/textures/tiles/walls/wall_right_1.png"),
        ImageLoader.loadImage("src/main/resources/textures/tiles/walls/wall_right_corner.png"),
        ImageLoader.loadImage("src/main/resources/textures/tiles/walls/wall_top_0.png"),
        ImageLoader.loadImage("src/main/resources/textures/tiles/walls/wall_top_1.png"),
        ImageLoader.loadImage("src/main/resources/textures/tiles/walls/wall_top_2.png")
    };

    public static BufferedImage[] getWalls() {
        return walls;
    }

    public static String getWorldPath() {
        return "src/main/resources/world/DefaultRoom.txt";
    }

    public static BufferedImage getHealthBar() {
        return ImageLoader.loadImage("src/main/resources/textures/health/health_bar.png");
    }

    public static BufferedImage getGameOver() {
        return ImageLoader.loadImage("src/main/resources/textures/end/gameover.jpg");
    }

    private static BufferedImage[] batAnimation = {
        ImageLoader.loadImage("src/main/resources/textures/bat/bat_0.png"),
        ImageLoader.loadImage("src/main/resources/textures/bat/bat_1.png"),
        ImageLoader.loadImage("src/main/resources/textures/bat/bat_2.png")
    };

    public static BufferedImage[] getBatAnimation() {
        return batAnimation;
    }

    private static BufferedImage[] playerAttackLeft = {
        ImageLoader.loadImage("src/main/resources/textures/player/attackLeft/0.png"),
        ImageLoader.loadImage("src/main/resources/textures/player/attackLeft/1.png"),
        ImageLoader.loadImage("src/main/resources/textures/player/attackLeft/2.png"),
        ImageLoader.loadImage("src/main/resources/textures/player/attackLeft/3.png"),
        ImageLoader.loadImage("src/main/resources/textures/player/attackLeft/4.png"),
        ImageLoader.loadImage("src/main/resources/textures/player/attackLeft/5.png"),
        ImageLoader.loadImage("src/main/resources/textures/player/attackLeft/6.png"),
        ImageLoader.loadImage("src/main/resources/textures/player/attackLeft/7.png"),
        ImageLoader.loadImage("src/main/resources/textures/player/attackLeft/8.png"),
        ImageLoader.loadImage("src/main/resources/textures/player/attackLeft/9.png")
    };

    public static BufferedImage[] getPlayerAttackLeft() {
        return playerAttackLeft;
    }

    private static BufferedImage[] playerAttackLeftDown = {
        ImageLoader.loadImage("src/main/resources/textures/player/attackLeftDown/0.png"),
        ImageLoader.loadImage("src/main/resources/textures/player/attackLeftDown/1.png"),
        ImageLoader.loadImage("src/main/resources/textures/player/attackLeftDown/2.png"),
        ImageLoader.loadImage("src/main/resources/textures/player/attackLeftDown/3.png"),
        ImageLoader.loadImage("src/main/resources/textures/player/attackLeftDown/4.png"),
        ImageLoader.loadImage("src/main/resources/textures/player/attackLeftDown/5.png"),
        ImageLoader.loadImage("src/main/resources/textures/player/attackLeftDown/6.png"),
        ImageLoader.loadImage("src/main/resources/textures/player/attackLeftDown/7.png"),
        ImageLoader.loadImage("src/main/resources/textures/player/attackLeftDown/8.png"),
        ImageLoader.loadImage("src/main/resources/textures/player/attackLeftDown/9.png")
    };

    public static BufferedImage[] getPlayerAttackLeftDown() {
        return playerAttackLeftDown;
    }

    private static BufferedImage[] playerAttackLeftUp = {
        ImageLoader.loadImage("src/main/resources/textures/player/attackLeftUp/0.png"),
        ImageLoader.loadImage("src/main/resources/textures/player/attackLeftDown/1.png"),
        ImageLoader.loadImage("src/main/resources/textures/player/attackLeftDown/2.png"),
        ImageLoader.loadImage("src/main/resources/textures/player/attackLeftDown/3.png"),
        ImageLoader.loadImage("src/main/resources/textures/player/attackLeftDown/4.png"),
        ImageLoader.loadImage("src/main/resources/textures/player/attackLeftDown/5.png"),
        ImageLoader.loadImage("src/main/resources/textures/player/attackLeftDown/6.png"),
        ImageLoader.loadImage("src/main/resources/textures/player/attackLeftDown/7.png"),
        ImageLoader.loadImage("src/main/resources/textures/player/attackLeftDown/8.png"),
        ImageLoader.loadImage("src/main/resources/textures/player/attackLeftDown/9.png")
    };

    public static BufferedImage[] getPlayerAttackLeftUp() {
        return playerAttackLeftUp;
    }

    private static BufferedImage[] playerAttackRight = {
        ImageLoader.loadImage("src/main/resources/textures/player/attackRight/0.png"),
        ImageLoader.loadImage("src/main/resources/textures/player/attackRight/1.png"),
        ImageLoader.loadImage("src/main/resources/textures/player/attackRight/2.png"),
        ImageLoader.loadImage("src/main/resources/textures/player/attackRight/3.png"),
        ImageLoader.loadImage("src/main/resources/textures/player/attackRight/4.png"),
        ImageLoader.loadImage("src/main/resources/textures/player/attackRight/5.png"),
        ImageLoader.loadImage("src/main/resources/textures/player/attackRight/6.png"),
        ImageLoader.loadImage("src/main/resources/textures/player/attackRight/7.png"),
        ImageLoader.loadImage("src/main/resources/textures/player/attackRight/8.png"),
        ImageLoader.loadImage("src/main/resources/textures/player/attackRight/9.png")
    };

    public static BufferedImage[] getPlayerAttackRight() {
        return playerAttackRight;
    }

    private static BufferedImage[] playerAttackRightDown = {
        ImageLoader.loadImage("src/main/resources/textures/player/attackRightDown/0.png"),
        ImageLoader.loadImage("src/main/resources/textures/player/attackRightDown/1.png"),
        ImageLoader.loadImage("src/main/resources/textures/player/attackRightDown/2.png"),
        ImageLoader.loadImage("src/main/resources/textures/player/attackRightDown/3.png"),
        ImageLoader.loadImage("src/main/resources/textures/player/attackRightDown/4.png"),
        ImageLoader.loadImage("src/main/resources/textures/player/attackRightDown/5.png"),
        ImageLoader.loadImage("src/main/resources/textures/player/attackRightDown/6.png"),
        ImageLoader.loadImage("src/main/resources/textures/player/attackRightDown/7.png"),
        ImageLoader.loadImage("src/main/resources/textures/player/attackRightDown/8.png"),
        ImageLoader.loadImage("src/main/resources/textures/player/attackRightDown/9.png")
    };

    public static BufferedImage[] getPlayerAttackRightDown() {
        return playerAttackRightDown;
    }

    private static BufferedImage[] playerAttackRightUp = {
        ImageLoader.loadImage("src/main/resources/textures/player/attackRightUp/0.png"),
        ImageLoader.loadImage("src/main/resources/textures/player/attackRightUp/1.png"),
        ImageLoader.loadImage("src/main/resources/textures/player/attackRightUp/2.png"),
        ImageLoader.loadImage("src/main/resources/textures/player/attackRightUp/3.png"),
        ImageLoader.loadImage("src/main/resources/textures/player/attackRightUp/4.png"),
        ImageLoader.loadImage("src/main/resources/textures/player/attackRightUp/5.png"),
        ImageLoader.loadImage("src/main/resources/textures/player/attackRightUp/6.png"),
        ImageLoader.loadImage("src/main/resources/textures/player/attackRightUp/7.png"),
        ImageLoader.loadImage("src/main/resources/textures/player/attackRightUp/8.png"),
        ImageLoader.loadImage("src/main/resources/textures/player/attackRightUp/9.png")
    };

    public static BufferedImage[] getPlayerAttackRightUp() {
        return playerAttackRightUp;
    }

    private static BufferedImage[] playerIdleLeft = {
        ImageLoader.loadImage("src/main/resources/textures/player/idleLeft/0.png"),
        ImageLoader.loadImage("src/main/resources/textures/player/idleLeft/1.png"),
        ImageLoader.loadImage("src/main/resources/textures/player/idleLeft/2.png"),
        ImageLoader.loadImage("src/main/resources/textures/player/idleLeft/3.png"),
        ImageLoader.loadImage("src/main/resources/textures/player/idleLeft/4.png"),
        ImageLoader.loadImage("src/main/resources/textures/player/idleLeft/5.png"),
        ImageLoader.loadImage("src/main/resources/textures/player/idleLeft/6.png"),
        ImageLoader.loadImage("src/main/resources/textures/player/idleLeft/7.png"),
        ImageLoader.loadImage("src/main/resources/textures/player/idleLeft/8.png"),
        ImageLoader.loadImage("src/main/resources/textures/player/idleLeft/9.png"),
        ImageLoader.loadImage("src/main/resources/textures/player/idleLeft/10.png"),
        ImageLoader.loadImage("src/main/resources/textures/player/idleLeft/11.png"),
        ImageLoader.loadImage("src/main/resources/textures/player/idleLeft/12.png")
    };

    public static BufferedImage[] getPlayerIdleLeft() {
        return playerIdleLeft;
    }

    private static BufferedImage[] playerIdleRight = {
        ImageLoader.loadImage("src/main/resources/textures/player/idleRight/0.png"),
        ImageLoader.loadImage("src/main/resources/textures/player/idleRight/1.png"),
        ImageLoader.loadImage("src/main/resources/textures/player/idleRight/2.png"),
        ImageLoader.loadImage("src/main/resources/textures/player/idleRight/3.png"),
        ImageLoader.loadImage("src/main/resources/textures/player/idleRight/4.png"),
        ImageLoader.loadImage("src/main/resources/textures/player/idleRight/5.png"),
        ImageLoader.loadImage("src/main/resources/textures/player/idleRight/6.png"),
        ImageLoader.loadImage("src/main/resources/textures/player/idleRight/7.png"),
        ImageLoader.loadImage("src/main/resources/textures/player/idleRight/8.png"),
        ImageLoader.loadImage("src/main/resources/textures/player/idleRight/9.png"),
        ImageLoader.loadImage("src/main/resources/textures/player/idleRight/10.png"),
        ImageLoader.loadImage("src/main/resources/textures/player/idleRight/11.png"),
        ImageLoader.loadImage("src/main/resources/textures/player/idleRight/12.png")
    };

    public static BufferedImage[] getPlayerIdleRight() {
        return playerIdleRight;
    }

    private static BufferedImage[] playerRunLeft = {
        ImageLoader.loadImage("src/main/resources/textures/player/runLeft/0.png"),
        ImageLoader.loadImage("src/main/resources/textures/player/runLeft/1.png"),
        ImageLoader.loadImage("src/main/resources/textures/player/runLeft/2.png"),
        ImageLoader.loadImage("src/main/resources/textures/player/runLeft/3.png"),
        ImageLoader.loadImage("src/main/resources/textures/player/runLeft/4.png"),
        ImageLoader.loadImage("src/main/resources/textures/player/runLeft/5.png"),
        ImageLoader.loadImage("src/main/resources/textures/player/runLeft/6.png"),
        ImageLoader.loadImage("src/main/resources/textures/player/runLeft/7.png")
    };

    public static BufferedImage[] getPlayerRunLeft() {
        return playerRunLeft;
    }

    private static BufferedImage[] playerRunRight = {
        ImageLoader.loadImage("src/main/resources/textures/player/runRight/0.png"),
        ImageLoader.loadImage("src/main/resources/textures/player/runRight/1.png"),
        ImageLoader.loadImage("src/main/resources/textures/player/runRight/2.png"),
        ImageLoader.loadImage("src/main/resources/textures/player/runRight/3.png"),
        ImageLoader.loadImage("src/main/resources/textures/player/runRight/4.png"),
        ImageLoader.loadImage("src/main/resources/textures/player/runRight/5.png"),
        ImageLoader.loadImage("src/main/resources/textures/player/runRight/6.png"),
        ImageLoader.loadImage("src/main/resources/textures/player/runRight/7.png")
    };

    public static BufferedImage[] getPlayerRunRight() {
        return playerRunRight;
    }

    public static String getSongPath() {
        return "src/main/resources/sounds/Song0.wav";
    }
}