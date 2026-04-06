import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        char[][] board = {
                {' ', ' ', ' '},
                {' ', ' ', ' '},
                {' ', ' ', ' '},
        };
        Scanner scanner = new Scanner(System.in);

        Util.printBoard(board);

        while (true) {
            Util.playerMove(board, scanner);
            if (Util.isGameEnd(board)) {
                break;
            }

            Util.printBoard(board);

            Util.computerMove(board);
            if (Util.isGameEnd(board)) {
                break;
            }
            Util.printBoard(board);
        }
        scanner.close();
    }
}