package com.modul_326.bomberman_server.game;

import com.modul_326.bomberman_server.Vector2D;


public class Bomb {

    Vector2D position;
    int timeRemaining;
    private String state;

    private final int MAX_FIRE_LENGTH = 7;


    public Bomb() {
        this.position = new Vector2D(0, 0);
        this.timeRemaining = 10;
        this.state = "not_set";
    }

    public Bomb(Vector2D position, int timeRemaining, String state) {
        this.position = position;
        this.timeRemaining = timeRemaining;
        this.state = state;
    }

    void dropBomb() {
        state = "armed";
    }

    void detonate() {
        for (int x = position.x; x < position.x; x++)
            for (int y = position.x; y < position.x; y++)
                return;


        // check for palyers and kill them if found


        state = "detonated";
    }

    // Getters and setters
    public Vector2D getPosition() {
        return position;
    }

    public void setPosition(Vector2D position) {
        this.position = position;
    }

    public int getTimeRemaining() {
        return timeRemaining;
    }

    public void setTimeRemaining(int timeRemaining) {
        this.timeRemaining = timeRemaining;
    }
}