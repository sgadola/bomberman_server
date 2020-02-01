package com.modul_326.bomberman_server.managers;

import com.modul_326.bomberman_server.PlayerFactory;
import com.modul_326.bomberman_server.game.Player;

import java.util.ArrayList;


public class PlayerManager {

    // Singleton stuff
    private static PlayerManager myInstance = new PlayerManager();

    public static PlayerManager getPlayerManager() {
        return myInstance;
    }


    private static PlayerFactory factory = PlayerFactory.getPlayerFactory();
    private static ArrayList<Player> players = new ArrayList<>();
    private static int playerCount = 0;


    public static int addPlayer(String name, String ipAdress) {

        // We already have 4 players, therefore we've reached the limit and can't take more players
        if (playerCount == 4)
            return -1;

        Player newPlayer = factory.createPlayer(playerCount, name, ipAdress);
        players.add(newPlayer);

        playerCount++;

        return newPlayer.getId();
    }


    Player getPlayer(int id) {
        return players.get(id);
    }


    void removePlayer(int id) {
        players.remove(id);
    }

    public static int getPlayerCount() {
        return playerCount;
    }
}