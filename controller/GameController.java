package TicTacToeGame.controller;

import TicTacToeGame.service.GameService;

public class GameController {
//    public boolean isSpaceAvailable;
    private GameService gameService=new GameService();
//   public void start()
//   {
//       gameService.start();
//   }
   public void displayBoard()
   {
       gameService.displayBoard();
   }
   public boolean isSpaceAvailable()
   {
      return gameService.isSpaceAvailable();
   }
   public boolean isAvailableRowAndColumn(int row,int col)
   {
       return gameService.isAvailableRowAndColumn(row,col);
   }
   public void update(boolean isXTurn,int row,int col)
   {
       gameService.update(isXTurn,row,col);
   }
   public boolean checkWinner()
   {
        return gameService.checkWinner();
   }
}
