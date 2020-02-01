package com.modul_326.bomberman_server.controller;

import com.modul_326.bomberman_server.Vector2D;
import com.modul_326.bomberman_server.managers.GameManager;
import com.modul_326.bomberman_server.managers.PlayerManager;
import com.modul_326.bomberman_server.game.Player;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;


@RestController
public class BombermanController {

    // Post requests

    /**
     * Endpoint for new player login
     *
     * @param username name player has chosen
     * @param request  Client information to provide IP
     * @return Id of newly registered player
     */
    @PostMapping("/login")
    int loginPlayer(@RequestBody String username, HttpServletRequest request) {
        int createdPlayerId = PlayerManager.addPlayer(username, request.getRemoteAddr());

        GameManager.getGameManager().Update();

        return createdPlayerId;
    }

    /**
     * Endpoint for moving a player
     *
     * @param hash    Hash value which identifies the player (serves as kind of ID)
     * @param request Client information to provide IP
     * @return Object containing the curent state of the game field / playground
     */
    @PostMapping("/move-player")
    ResponseBody movePlayer(@RequestBody String hash, Vector2D direction, HttpServletRequest request) {
        ResponseBody response = new ResponseBody();

        GameManager.getGameManager().movePlayer(hash, direction);

        return response;
    }

    /**
     * Endpoint for planting a bomb
     *
     * @param hash    Hash value which identifies the player (serves as kind of ID)
     * @param request Client information to provide IP
     * @return Object containing the curent state of the game field / playground
     */
    @PostMapping("/plant-bomb")
    ResponseBody plantBomb(@RequestBody String hash, HttpServletRequest request) {
        ResponseBody response = new ResponseBody();

        return response;
    }


    // Get requests

    /**
     * Endpoint for client to request a game field / playground update
     *
     * @return Object containing the curent state of the game field / playground
     */
    @GetMapping("/get-game-field")
    ResponseBody getGameField(/*@RequestBody String username, HttpServletRequest request*/) {
        ResponseBody response = new ResponseBody();

        return response;
    }
}