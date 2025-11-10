package TicTacToeGame.view;

import TicTacToeGame.controller.GameController;

public class UserView {
    private InputReader inputReader=new InputReader();
    private GameController gameController=new GameController();
    public void start()
    {
        boolean isXsTurn=true;
        while(true) {
            gameController.displayBoard();
            if(gameController.checkWinner())
            {
                System.out.println(isXsTurn==true?"O Wins!!!":"X Wins!!!");
                break;
            }
            if (gameController.isSpaceAvailable()) {
                if (isXsTurn) {
                    System.out.println("It is X's Turn !!!!");
                    System.out.println("Please Enter the row and Column ");
                    int row = inputReader.getInt();
                    int column = inputReader.getInt();
                    try {
                        if (gameController.isAvailableRowAndColumn(row, column)) {
                            gameController.update(isXsTurn, row, column);
                            isXsTurn = !isXsTurn;
                        } else {
                            System.out.println("Please enter the valid row and the column number");
                        }
                    }
                    catch (Exception e)
                    {
                        System.out.println("Enter a valid row and column!!");
                    }

                } else {
                    System.out.println("It is O's Turn !!!!");
                    System.out.println("Please Enter the row and Column ");
                    int row = inputReader.getInt();
                    int column = inputReader.getInt();
                    try {
                        if (gameController.isAvailableRowAndColumn(row, column)) {
                            gameController.update(isXsTurn, row, column);
                            isXsTurn = !isXsTurn;
                        } else {
                            System.out.println("Please enter the valid row and the column number");
                        }
                    }
                    catch (Exception e)
                    {
                        System.out.println("Enter a valid row and column number");
                    }
                }
            }
            else {
                System.out.println("It is a Draw!!");
                break;
            }
        }
    }
}
