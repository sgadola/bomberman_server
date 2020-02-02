package com.modul_326.bomberman_server.controller;

import com.modul_326.bomberman_server.Vector2D;

public class ResponsePlayer {
    String hash;
    String username;
    String color;

    int x;
    int y;


    public ResponsePlayer(String hash, String username, String color, Vector2D position) {
        this.hash = hash;
        this.username = username;
        this.color = color;
        this.x = position.x;
        this.y = position.y;
    }


    public String getHash() {
        return hash;
    }

    public String getUsername() {
        return username;
    }

    public String getColor() {
        return color;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
}
