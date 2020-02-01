package com.modul_326.bomberman_server.managers;

import com.modul_326.bomberman_server.Vector2D;

public class GameManager {

    // Singleton stuff
    private static GameManager myInstance = new GameManager();

    public static GameManager getGameManager() {
        return myInstance;
    }


    boolean running;


    public GameManager() {
    }

    boolean isGameRunning() {
        return running;
    }

    void startGame() {
        setState(true);
    }

    void setState(boolean running) {
        this.running = running;
    }

    public void Update() {
        PlayerManager playerManager = PlayerManager.getPlayerManager();
        int numPlayers = playerManager.getPlayerCount();

        if (numPlayers == 4)
            startGame();
    }

    public void movePlayer(String id, Vector2D direction) {
        // abcd
    }
}
