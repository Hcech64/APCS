import java.util.*;

public class TicTacToe {

  public static void main(String[] args) {

    int[][] grid = new int[3][3];
    Scanner kb = new Scanner(System.in);

    int player = 1;
    int round = 1;
    int winner = 0;

    while (winner == 0 && round <= 9) {
      String playerSymbol = "X";
      if (player == -1) playerSymbol = "O";

      System.out.println(playerSymbol + "'s turn\n");
     
      int row = 4;
      int col = 4;



      while(col > 3){
        System.out.print("What col (1-3): ");
        col = Integer.parseInt(kb.nextLine()) - 1;
      }
      while(row > 3){
        System.out.print("What row (1-3): ");
        row = Integer.parseInt(kb.nextLine()) - 1;
      }

      grid[row][col] = player;

      winner = checkWinner(grid);

      if (winner != 0) {
        System.out.println(playerSymbol + " wins!!!");
        break;
      }

      for(int l = 0 ; l < 3; l++){
        for(int b = 0; b < 3; b++ ){
            System.out.print(grid[l][b] + "  ");
        }
        System.out.println();
    }
    

      player *= -1;     // change players at the end of the turn.
    }

    kb.close();
  }


  /* Complete this method

   It should search the grid for a winner in the vertical, horizontal,
   and diagonal directions.

   if player 1 wins, it should return 1
   if player -1 wins, it should return -1
   if there isn't a winner, it should return 0
  */
  public static int checkWinner(int[][] grid) {
    int win = 0;
    for(int x = 0; x < 3; x++){
      if(grid[x][0] == grid[x][1] && grid[x][1] == grid[x][2] && grid[x][2] != 0){
        win = grid[x][0];
      }
    }
    for(int x =0; x < 3; x++){
      if(grid[0][x] == grid[1][x] && grid[1][x] == grid[2][x] && grid[2][x] != 0){
        win = grid[x][0];
      }
    }

    if(grid[0][0] == grid[1][1] && grid[1][1] == grid[2][2]){
      win = grid[0][0];
    }

    if(grid[2][0] == grid[1][1] && grid[1][1] == grid[2][0]){
      win = grid[2][0];
    }
    return win;
  }


}
