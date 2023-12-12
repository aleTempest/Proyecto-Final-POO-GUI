package org.ale.gui_futbol.Factories;

import org.ale.gui_futbol.DBObjects.Game;

public class GameFactory {
    public static Game create(Integer gameId, String date, String teamA, String teamB) {
        return new Game(gameId, date, teamA, teamB);
    }
}
