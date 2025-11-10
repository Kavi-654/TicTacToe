package TicTacToeGame.service;

import TicTacToeGame.model.Board;
import TicTacToeGame.repository.GameRepository;

public class GameService {
    private GameRepository gameRepository=GameRepository.getInstance();
    public void displayBoard()
    {
        char[][]cell=gameRepository.getCurrentGame();
      for(int i=0;i<cell.length;i++)
      {

          for(int j=0;j<cell.length;j++)
          {
              System.out.print(cell[i][j]+"|");

          }
          System.out.println();
//          System.out.print("----------");


      }

    }
    public boolean isSpaceAvailable()
    {
        char[][]cell=gameRepository.getCurrentGame();
        for(int i=0;i<cell.length;i++)
        {
            for(int j=0;j<cell.length;j++)
            {
                if(cell[i][j]==' ')
                {
                    return true;
                }
            }
        }
        return false;
    }
    public boolean isAvailableRowAndColumn(int row,int col)
    {
        char[][]cell=gameRepository.getCurrentGame();
        return cell[row][col]==' ';
    }
    public void update(boolean isXTurn,int row,int col)
    {
        char[][]cell=gameRepository.getCurrentGame();
        if(isXTurn)
        {
            cell[row][col]='X';
        }
        else {
            cell[row][col]='O';
        }
        gameRepository.setCurrentGame(cell);
    }
    public boolean checkWinner()
    {
        RowCheck rowCheck=new RowCheck();
        ColumnCheck columnCheck=new ColumnCheck();
        DiagonalCheck diagonalCheck=new DiagonalCheck();
        return  rowCheck.isValid() || columnCheck.isValid() || diagonalCheck.isValid();
    }
}
