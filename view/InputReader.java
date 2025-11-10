package TicTacToeGame.view;

import java.util.Scanner;

public class InputReader {
    Scanner in=new Scanner(System.in);
    public int getInt()
    {
        while(true) {
            String num = in.nextLine().trim();
            try {
                int number = Integer.parseInt(num);
                return number;
            } catch (NumberFormatException e) {
                System.out.println("Enter the valid Input!!");
            }
        }
    }
}
