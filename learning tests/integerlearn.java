import java.util.*;


public class integerlearn{
	public static void main(String args[]){
		
        Random random= new Random();
        int upperbound = 25;
        int random_int = random.nextInt(upperbound);
        
        int guess = 0;       
        System.out.println ("please enter a number between 1 and 100. ");
        Scanner keyboard = new Scanner(System.in);
        guess = keyboard.nextInt();

        // + add
        // - minus
        // * times
        // / deivde
        // % mod - returns the remainder of dividing the numbers
        

        // conditional operators - compare two var to see if they meet criteria
        // == does this equal _ condition - if int == 3...
        // != does this not equal _ condition
        // < less than
        // > grater than
        // >= grater than or equal
        // <= lees than or equal to

        guess = guess * random_int;
        System.out.println("your number has been transformed, try to guess the new number");
        int newguess = keyboard.nextInt();
        
        while(newguess != guess){
            if (newguess > guess){
                System.out.println("Too high. guess again");
                newguess = keyboard.nextInt();
            }
            
            if (newguess < guess){
                System.out.println("Too low. guess again");
                newguess = keyboard.nextInt();
            }
        }

        if (newguess == guess){
            System.out.println("Congratulations! You guessed the new number!");
        }

        keyboard.close();
    }
}