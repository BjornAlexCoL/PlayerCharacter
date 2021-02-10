package se.lexicon.g34.bl.model;

import java.io.Serializable;

public class PlayerCharacter implements Serializable {
    private int id;
    private String game;
    private String player;
    private String character;

    public PlayerCharacter() {
    }

    public PlayerCharacter(int id, String game, String player, String character) {
        this.id = id;
        this.game = game;
        this.player = player;
        this.character = character;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getGame() {
        return game;
    }

    public void setGame(String game) {
        this.game = game;
    }

    public String getPlayer() {
        return player;
    }

    public void setPlayer(String player) {
        this.player = player;
    }

    public String getCharacter() {
        return character;
    }

    public void setCharacter(String character) {
        this.character = character;
    }

    @Override
    public String toString() {
        return "PlayerCharacter{" + id + game + player +  character + '}';
    }
}
