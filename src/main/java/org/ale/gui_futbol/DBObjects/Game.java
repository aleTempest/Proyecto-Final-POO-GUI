package org.ale.gui_futbol.DBObjects;

public class Game {
    private Integer gameId;
    private String date;
    private String teamA;
    private String teamB;
    public Game(Integer gameId, String date, String teamA, String teamB) {
        this.gameId = gameId;
        this.date = date;
        this.teamA = teamA;
        this.teamB = teamB;
    }

    public Integer getGameId() {
        return gameId;
    }

    public void setGameId(Integer gameId) {
        this.gameId = gameId;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTeamA() {
        return teamA;
    }

    public void setTeamA(String teamA) {
        this.teamA = teamA;
    }

    public String getTeamB() {
        return teamB;
    }

    public void setTeamB(String teamB) {
        this.teamB = teamB;
    }
}
