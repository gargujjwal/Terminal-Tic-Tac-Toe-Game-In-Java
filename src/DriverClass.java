import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DriverClass {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        try {
            System.out.print("Name of Player 1: ");
            String player1 = br.readLine();
            System.out.print("Name of Player 2: ");
            String player2 = br.readLine();

            TicTacToe ticTacToe = new TicTacToe(player1, player2);
            int i = 1;
            while (!ticTacToe.isOver()) {
                System.out.printf("\nIt's Player %d: %s turn:--\n\n", i, i == 1 ? player1 : player2);
                ticTacToe.printBoard();

                System.out.print("Coordinate: (row,column) ");
                String[] coordinates = br.readLine().split(",");
                try {
                    ticTacToe.setBoard(i == 1 ? 'X' : 'O', Integer.parseInt(coordinates[0]),
                            Integer.parseInt(coordinates[1]));
                } catch (ArrayIndexOutOfBoundsException e) {
                    System.out.println(":( Wrong row and index num!You lost your turn :(");
                }
                // changing the value of i
                i = i == 1 ? 2 : 1;
            }
            ticTacToe.printBoard();
            System.out.println("******************Game is Over******************");
            System.out.printf("\nPlayer Won: %s%n", ticTacToe.whoWon());
        } catch (IOException e) {
            System.out.println("Error: ".concat(e.getMessage()));
        }

    }
}
