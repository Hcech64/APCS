import java.util.Scanner;
public class MagicSquares {
    public static void main(String[] args) {
        Scanner k = new Scanner(System.in);
        Scanner l = new Scanner(System.in);

        System.out.println("What is the size of the square?");
        int girth = k.nextInt();
        int [][] jimmy = new int[girth][girth];

        System.out.println("do you want random numbers?");
        if(l.nextLine().equalsIgnoreCase("yes")){
            jimmy = Rando(jimmy, girth);
            System.out.println("Now generating digits for a magic square");
            System.out.println(".  .  .  (This may take a while)");
            while(CheckerSilent(jimmy) == false){
                jimmy = Rando(jimmy, girth);
            }
            Checker(jimmy);
        }
        else{     20
            for (int i = 0; i < jimmy[0].length; i++){
                for (int t = 0; t < jimmy[0].length; t++){
                    System.out.print("What is the value at "+ i + ", " + t + "\n");
                    jimmy[i][t] = k.nextInt();
                }
            }

            Checker(jimmy);
        }

        k.close();
        l.close();
        
    }

    public static int[][] Rando (int[][] jimmy, int girth){
        for(int x = 0; x < girth; x++){
            for(int y = 0; y < girth; y++){
                jimmy[x][y] = (int)(Math.random()*10);
            }
        }
        return jimmy;
    }
    
    public static boolean CheckerSilent(int[][] jimmy){
        int MagicCheck = 0;

        for(int i=0; i< jimmy.length; i++){
            MagicCheck += jimmy[0][i];
        }

        boolean check = true;

        for(int x = 0; x < jimmy.length; x++ ){
        int sum = 0;
        for(int y = 0; y < jimmy.length; y++ ){
            sum += jimmy[x][y];
        }
        if(sum != MagicCheck){
            check = false;
        }
        }

        int Diagonalsum = 0;
        for(int i =0; i < jimmy.length; i++){
            Diagonalsum += jimmy[i][i];
        }
        
        for (int i = 0; i < jimmy[0].length; i++){
            int sum = 0;

            for (int t = 0; t < jimmy[0].length; t++){
                sum += jimmy[t][i];
                }

            if(sum != MagicCheck || Diagonalsum != MagicCheck){
                check = false;
            }
        }

        return check;
    }
    public static boolean Checker(int[][] jimmy){
    
        int MagicCheck = 0;

        for(int i=0; i< jimmy.length; i++){
            MagicCheck += jimmy[0][i];
        }

        boolean check = true;

        for(int x = 0; x < jimmy.length; x++ ){
        int sum = 0;
        for(int y = 0; y < jimmy.length; y++ ){
            sum += jimmy[x][y];
        }
        if(sum != MagicCheck){
            check = false;
        }
        System.out.println(jimmy[x][0] +"  "+ jimmy[x][1] +"  "+ jimmy[x][2] + " = " + sum);
        }

        for(int i = 0; i < jimmy.length; i++){
            System.out.print("|  ");
        }


        int Diagonalsum = 0;
        for(int i =0; i < jimmy.length; i++){
            Diagonalsum += jimmy[i][i];
        }
        System.out.print(Diagonalsum);

        System.out.println();


        for (int i = 0; i < jimmy[0].length; i++){
            int sum = 0;
            for (int t = 0; t < jimmy[0].length; t++){
                sum += jimmy[t][i];
            }
            if(sum != MagicCheck){
                check = false;
            }
            System.out.print(sum + " ");
            }   
        System.out.println();
        System.out.println();
        System.out.println("Magic Square: " + check);
        return check;
    }  

}