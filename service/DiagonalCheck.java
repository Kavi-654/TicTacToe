package TicTacToeGame.service;

import TicTacToeGame.model.Board;
import TicTacToeGame.repository.GameRepository;

public class DiagonalCheck implements Check{
    private GameRepository gameRepository=GameRepository.getInstance();
    public boolean isValid()
    {
        char[][] cell=gameRepository.getCurrentGame();
            if(cell[0][0]!=' ' && cell[0][0]==cell[1][1] && cell[1][1]==cell[2][2])
            {
                return true;
            }

        if(cell[0][2]!=' ' && cell[0][2]==cell[1][1] && cell[2][0]==cell[1][1])
        {
            return true;
        }
        return false;
    }
}
