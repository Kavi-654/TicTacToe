package TicTacToeGame.service;

import TicTacToeGame.model.Board;
import TicTacToeGame.repository.GameRepository;

public class ColumnCheck implements Check{
    private GameRepository gameRepository=GameRepository.getInstance();
    public boolean isValid()
    {
        char[][] cell=gameRepository.getCurrentGame();
        for(int i=0;i<cell.length;i++)
        {

            if(cell[0][i]!=' ' && cell[0][i]==cell[1][i] && cell[1][i]==cell[2][i])
            {
                return true;
            }

        }
        return false;
    }
}
