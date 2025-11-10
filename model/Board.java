package TicTacToeGame.model;

public class Board {
    private char[][]board=new char[3][3];
    public char[][] getBoard() {
        return board;
    }

    public void setBoard(char[][] board) {
        this.board = board;
    }

}
