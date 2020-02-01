package com.modul_326.bomberman_server;

import com.modul_326.bomberman_server.game.Player;


// PlayerFactory class singleton
public final class PlayerFactory {

    //private int playerCount = 0;

    private static PlayerFactory myInstance = new PlayerFactory();


    private PlayerFactory() {
    }

    public static PlayerFactory getPlayerFactory() {
        return myInstance;
    }


    public Player createPlayer(int id, String name, String ipAdress) {

        return new Player(id, name, ipAdress);
    }
}