package com.modul_326.bomberman_server.controller;

public class ResponsePlayer {
    String hash;
    String username;
    String color;

    int x;
    int y;


    public ResponsePlayer(String hash, String username, String color, int x, int y) {
        this.hash = hash;
        this.username = username;
        this.color = color;
        this.x = x;
        this.y = y;
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
