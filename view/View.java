package TicTacToeGame.view;

import TicTacToeGame.controller.GameController;

public class View {
    private InputReader inputReader=new InputReader();
    private UserView view=new UserView();
       public void startGame()
       {
           System.out.println("========== Tic-Tac-Toe Game ==========");
           System.out.println("1.Start The Game");
           System.out.println("2.Exit");
           int option= inputReader.getInt();
           switch(option)
           {
               case 1:
                  view.start();
                   break;
               case 2:
                   System.out.println("Thank you for playing!!!");
                   break;


           }
       }
}
