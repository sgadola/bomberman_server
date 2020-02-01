package com.modul_326.bomberman_server.controller;

import com.modul_326.bomberman_server.game.Field;
import com.modul_326.bomberman_server.game.Player;
import com.modul_326.bomberman_server.game.Settings;

import java.util.ArrayList;


public class ResponseBody {


    ArrayList<ArrayList<Field>> fields;
    Field[][] _fields;
    ArrayList<ResponsePlayer> players;
    ResponsePlayer[] _players;
    String log;


    public ResponseBody(ArrayList<ArrayList<Field>> fields, ArrayList<Player> players, String log) {
        this._fields = buildFields();
        this._players = initPlayers();
        this.log = "test_string";
    }


    public ResponseBody() {
        this._fields = buildFields();
        this._players = initPlayers();
        this.log = "test_string";
    }

    Field[][] buildFields() {
//        ArrayList<ArrayList<Field>> field = new ArrayList<ArrayList<Field>>();

        Field[][] _field = new Field[Settings.PLAYGROUND_ROWS][Settings.PLAYGROUND_COLUMNS];


        for (int x = 0; x < Settings.PLAYGROUND_ROWS; x++) {
            for (int y = 0; y < Settings.PLAYGROUND_COLUMNS; y++) {
                _field[x][y] = new Field();

                if (x != 0 && y != 0) {
                    // Skip indices 0
                    if (x % 3 == 0 && y % 3 == 0) {
                        _field[x - 1][y - 1].setPosition(x, y);
                        _field[x - 1][y - 1].setType("SoftWall");

                    } else if (x % 2 == 0 && y % 2 == 0) {
                        _field[x - 1][y - 1].setPosition(x, y);
                        _field[x - 1][y - 1].setType("SoftWall");
                    }
                }
            }
        }

        return _field;
    }

    ResponsePlayer[] initPlayers() {
        ResponsePlayer[] players = new ResponsePlayer[4];

        for (int i = 0; i < 4; i++) {
            Player player = new Player(123, "felix", "asdasdasdasdasd");
            // player = PlayerManager.getPlayer(i);
            player.setPosition(12, 34);

            players[i] = new ResponsePlayer("asdadasdasd", player.getUsername(), "green", player.getPosition().x, player.getPosition().y);

//            players[i].hash = "asdadasdasd";
//            players[i].color = "green";
//            players[i].username = player.getUsername();
//            players[i].x = player.getPosition().x;
//            players[i].y = player.getPosition().y;
        }

        return players;
    }


    // Getters
    public Field[][] get_fields() {
        return _fields;
    }

    public ResponsePlayer[] get_players() {
        return _players;
    }

    public String getLog() {
        return log;
    }
}
