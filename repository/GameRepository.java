package TicTacToeGame.repository;

import TicTacToeGame.model.Board;

public class GameRepository {
    private Board currentGame;
    private static GameRepository instance;

    private GameRepository() {
        currentGame = new Board();  // ← YOU NEED THIS LINE!
        char[][] cell = currentGame.getBoard();  // Get the board from currentGame
        for(int i = 0; i < cell.length; i++) {
            for(int j = 0; j < cell.length; j++) {
                cell[i][j] = ' ';
            }
        }
    }

    public void setCurrentGame(char[][] cell) {
        currentGame.setBoard(cell);
    }

    public char[][] getCurrentGame() {
        return currentGame.getBoard();
    }

    public void resetCurrentGame() {
        currentGame = new Board();
        char[][] cell = currentGame.getBoard();
        for(int i = 0; i < cell.length; i++) {
            for(int j = 0; j < cell.length; j++) {
                cell[i][j] = ' ';
            }
        }
    }

    public static GameRepository getInstance() {
        if(instance == null) {
            instance = new GameRepository();
        }
        return instance;
    }
}