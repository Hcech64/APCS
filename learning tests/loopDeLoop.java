import java.util.Scanner;

public class loopDeLoop {
    public static void main(String [] args){
        Scanner keyboard = new Scanner(System.in);
    
        //in a loop there are 4 elements
        // 1 initialization expression
        // 2 test expression
        // 3 update expression
        // 4 body

        // Notes
        // ++ increment 1 up
        // -- increment 1 down

        // FOR LOOP
        // for(initialization expression ; test epression ; update){
        // body tells computer what to do with variable if the test variable is not met
        // }

        // the goal of today os to get the computer to write 1 2 3 4 5 6 7 8 9 10 9 8 7 6 5 4 3 2 1 

        // int x = 0;
        // for(x = 0 ; x <= 10; x++){
        //    System.out.print(x + " ");
        //}

        // for(x = 9; x >= 0; x--){
        //      System.out.print(x + " ");
        // }
    

        //While Loops
        // while(test expression){
        //       loop body , tells the computer what to do if the test expression is met
        // }
    
            
        // create a factorial function of a user ourput ex. input = 5 output = 5! = 120

        System.out.println("what number do you want to be factorialized? ");
        int input = keyboard.nextInt();
        int y = input;
        int ans = 1;

        while(y > 1){
            ans = y * ans;
            y--;
        }
         System.out.println(input + "! = " + ans);
        
        
        // DO while loops
        // do
        // {
            // statements, tell computer what to do
        //} while(test expression);

        int n = 0;
        do
        {
            System.out.print(n+ " ");
            n++;
        }while(n <= 10);

        int m = 10;
        do
        {
            System.out.print(m+ " ");
            m--;
        }while(m >= 1);
        
        
        
        
        
        keyboard.close();
    }
}