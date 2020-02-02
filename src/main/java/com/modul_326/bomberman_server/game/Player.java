package com.modul_326.bomberman_server.game;

import com.modul_326.bomberman_server.Vector2D;


public class Player {

    int id;
    String username;
    String color;

    boolean alive;

    int score;
    int numBombs;

    Vector2D position = new Vector2D(0, 0);

    String ipAdress;


    public Player() {
        setInitialPosition();
    }

    /**
     * Initialize player with default and provided values
     *
     * @param id       Assigned id from PlayerManager
     * @param username Username player has chosen
     * @param ipAdress IP-adresss retrieved from request info
     */
    public Player(int id, String username, String ipAdress) {
        this.id = id;
        this.username = username;
        this.ipAdress = ipAdress;

        alive = true;
        score = 0;
        numBombs = 10;

        setInitialPosition();
    }


    // Getters and setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public boolean isAlive() {
        return alive;
    }

    public void setAlive(boolean alive) {
        this.alive = alive;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public int getNumBombs() {
        return numBombs;
    }

    public void setNumBombs(int numBombs) {
        this.numBombs = numBombs;
    }

    public Vector2D getPosition() {
        return position;
    }

    public void setPosition(int x, int y) {
        this.position.set(x, y);
    }

    /**
     * Sets the initial postion for each player, they start in the corners of the game field / playground
     */
    void setInitialPosition() {
        switch (id) {
            case 0:
                this.position.set(0, 0);
                break;
            case 1:
                this.position.set(Settings.PLAYGROUND_ROWS, 0);
                break;
            case 2:
                this.position.set(0, Settings.PLAYGROUND_COLUMNS);
                break;
            case 3:
                this.position.set(Settings.PLAYGROUND_ROWS, Settings.PLAYGROUND_COLUMNS);
                break;
        }
    }

    void plantBomb() {
        // Tick tack, boom
    }


    public String getIpAdress() {
        return ipAdress;
    }


    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    void kill() {
        alive = false;
    }
}