package com.modul_326.bomberman_server.game;


public class Field {

    final double PLAYGROUND_ROWS = 19;
    final double PLAYGROUND_COLUMNS = 19;

    int x;
    int y;

    String type;


    public Field() {
        this.type = "Ground";
    }

    public Field(int x, int y, String type) {
        this.x = x;
        this.y = y;

        if (type == null)
            this.type = "Ground";
        else
            this.type = type;
    }


    // Getters
    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setPosition(int x, int y) {
        this.x = x;
        this.y = y;
    }
}