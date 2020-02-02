package com.modul_326.bomberman_server.controller;

import com.modul_326.bomberman_server.Vector2D;
import com.modul_326.bomberman_server.game.Field;
import com.modul_326.bomberman_server.game.Player;
import com.modul_326.bomberman_server.game.Settings;


/**
 * ResponseBody class which is used to update the clients with requested informations.
 */
public class ResponseBody {

    Field[][] fields;
    ResponsePlayer[] players;
    String log;


    public ResponseBody() {
        this.fields = initFields();
        this.players = initPlayers();
        this.log = "test_string";
    }

    Field[][] initFields() {
        Field[][] field = new Field[Settings.PLAYGROUND_ROWS][Settings.PLAYGROUND_COLUMNS];

        for (int x = 0; x < Settings.PLAYGROUND_ROWS; x++) {
            for (int y = 0; y < Settings.PLAYGROUND_COLUMNS; y++) {
                field[x][y] = new Field();

                if (x != 0 && y != 0) {
                    // Skip indices 0
                    if (x % 3 == 0 && y % 3 == 0) {
                        field[x - 1][y - 1].setPosition(x, y);
                        field[x - 1][y - 1].setType("Wall");

                    } else if (x % 2 == 0 && y % 2 == 0) {
                        field[x - 1][y - 1].setPosition(x, y);
                        field[x - 1][y - 1].setType("SoftWall");
                    }
                }
            }
        }

        return field;
    }

    ResponsePlayer[] initPlayers() {
        ResponsePlayer[] players = new ResponsePlayer[4];

        for (int i = 0; i < 4; i++) {
            Player player = new Player(123, "felix", "asdasdasdasdasd");
            // player = PlayerManager.getPlayer(i);
            player.setPosition(12, 34);

            players[i] = new ResponsePlayer("dummy_hash", player.getUsername(), "green", new Vector2D(player.getPosition().x, player.getPosition().y));
        }

        return players;
    }


    // Getters
    public Field[][] getFields() {
        return fields;
    }

    public ResponsePlayer[] getPlayers() {
        return players;
    }

    public String getLog() {
        return log;
    }
}
