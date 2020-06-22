package apcsa.tiles;

public class TileHandler {
    private static Tile[] tiles = {
        new Floor(0),
        new Wall(1),
        new Default(2)
    };

    public static Tile getTile(int i) {
        int j = i / 10;
        int k = i % 10;

        if(j < tiles.length) {
            tiles[j].setIndex(k);
            return tiles[j];
        }
        return tiles[2];
    }
}