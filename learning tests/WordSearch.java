public class WordSearch {
    public WordSearch(){

        //creqte grid with random letters
        String[][] grid = new String [10] [10];
        for(int x = 0; x <10; x++){
            for(int y = 0; y< 10; y++){
                grid[x][y] = WordSearch.random();
            }
        }

        
    // set the words we want
        grid[2][2] = "F";
        grid[2][3] = "L";
        grid[2][4] = "U";
        grid[2][5] = "B";
        grid[2][6] = "B";
        grid[2][7] = "E";
        grid[2][8] = "R";

        grid[3][5] = "P";
        grid[4][5] = "O";
        grid[5][5] = "O";
        grid[6][5] = "P";
        grid[7][5] = "I";
        grid[8][5] = "E";
        grid[9][5] = "S";


        //print
        for(int l = 0 ; l < 10; l++){
                    for(int b = 0; b < 10; b++ ){
                        System.out.print(grid[l][b] + "  ");
                    }
                    System.out.println(grid[l][0]);
                }
    }


    public static String random(){
        double num = Math.random()*25;
        
        String[] Key = {"A", "B", "C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z",};

       return Key[(int) num];
    }
}
