import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        char[][] board = new char[3][3];
        // drawBoard(board);
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter row");
        int row = sc.nextInt();
        System.out.println("Enter Column");
        int column = sc.nextInt();
        board[row][column] = 'x';
        drawBoard(board);
        sc.close();
    }

    public static void drawBoard(char[][] chessboard) {
        for (int i = 0; i < chessboard.length; i++) {
            for (int j = 0; j < chessboard[i].length; j++) {
                System.out.print(chessboard[i][j] + " | ");
            }
            System.out.println();
        }
    }

}
