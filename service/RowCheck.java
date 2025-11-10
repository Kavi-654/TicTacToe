package TicTacToeGame.service;

import TicTacToeGame.model.Board;
import TicTacToeGame.repository.GameRepository;

public class RowCheck implements Check{
    private GameRepository gameRepository=GameRepository.getInstance();
    public boolean isValid()
    {
        char[][] cell=gameRepository.getCurrentGame();
         for(int i=0;i<cell.length;i++)
         {

                 if(cell[i][0]!=' ' && cell[i][0]==cell[i][1] && cell[i][1]==cell[i][2])
                 {
                     return true;
                 }

         }
         return false;
    }
}
