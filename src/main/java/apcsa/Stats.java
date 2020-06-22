package apcsa;

public class Stats {
    private static int level = 0;
    private static int batsKilled = 0;

    public static void tick() {
        Handler.getWindow().updateTitle("Everybody Loves Bats!  Level: " + level + "    Bats Killed: " + batsKilled);
    }

    public static void batKilled() {
        batsKilled++;
    }

    public static void newLevel() {
        level++;
    }

    public static void reset() {
        level = 0;
        batsKilled = 0;
    }
}