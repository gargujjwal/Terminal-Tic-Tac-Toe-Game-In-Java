public class TicTacToe {
    private final char[][] board;
    private final String player1;
    private final String player2;
    private String winner = "No one\n Because It's Draw";


    // Constructor for TicTacToe
    TicTacToe(String player1, String player2) {
        this.player1 = player1;
        this.player2 = player2;
        board = new char[][]{
                {'0', '0', 'o'},
                {'0', '0', 'o'},
                {'o', 'o', '0'}
        };
    }

    // Game is over when one player wins, or it is drawn
    public boolean isOver() {
        // check if row is made up of single char
        for (char[] chars : board) {
            if ((chars[0] == chars[1] && chars[1] == chars[2])) {
                winner = chars[0] == 'X' ? player1 : player2;
                return true;
            }

        }

        // check if column is made up of single char
        for (int i = 0; i < 3; i++) {
            if (board[0][i] == board[1][i] && board[1][i] == board[2][i]) {
                winner = board[0][i] == 'X' ? player1 : player2;
                return true;
            }

            // if there is at least on 0 or o, then game is not over
            for (int j = 0; j < 3; j++) {
                if (board[i][j] == 'o' || board[i][j] == '0') {
                    return false;
                }
            }
        }

        return true;
    }

    // pretty-prints the board
    public void printBoard() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                // if we encounter default values (that we initialised board with) then print space
                System.out.printf(" %c ", board[i][j] == '0' || board[i][j] == 'o' ? ' ' : board[i][j]);
                if (j == 1 || j == 0)
                    System.out.print('|');
            }
            if (i == 0 || i == 1)
                System.out.println("\n--- --- ---");
        }
        System.out.println('\n');
    }

    void setBoard(char value, int row, int col) throws ArrayIndexOutOfBoundsException {
        if (isValidMove(row, col))
            board[row][col] = value;
        else
            System.out.println("Position already played :( You lost your turn!!");
    }

    private boolean isValidMove(int row, int col) {
        // only gives true if it isn't X or O
        return board[row][col] != 'X' && board[row][col] != 'O';
    }

    String whoWon() {
        return winner;
    }


}
