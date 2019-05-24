package labyrinth.Core;

import labyrinth.TileEngine.TETile;

public class Player extends Role {

    int health;

    public Player(TETile[][] world, int x, int y, int health, TETile image) {
        super(world, x, y, image);
        this.health = health;
    }

}
