import java.util.Scanner;
import java.lang.Math;

public class RPS {
    public static void main(String [] args){
        Scanner keyboard = new Scanner(System.in);
        float botChoice = (float)((Math.random())*3);
        String bot = "A";

        System.out.println("This is a Rock_Paper_Scissors simulator, Please enter \'Rock\', \'Paper\', or \'Scissors\'");
        String choice = keyboard.nextLine();

        if(botChoice >= 0 && botChoice < 1){
            bot = "Rock";
        }

        else if(botChoice >= 1 && botChoice < 2 ){
            bot = "Paper";
        }

        else if (botChoice >= 2 && botChoice < 3 ){
            bot = "Scissors";
        }

        
        while(!choice.equals("Rock") && !choice.equals("Paper") && !choice.equals("Scissors")){
            System.out.println("Please enter Rock, Paper, or Scissors.");
            choice = keyboard.nextLine();
        }


        while(choice.equals(bot)){
            System.out.println("You both chose " +choice + ". You tied. Pleas enter \'Rock\', \'Paper\', or \'Scissors\'");
            choice = keyboard.nextLine();
            botChoice = (float)((Math.random())*3);
            if(botChoice >= 0 && botChoice < 1){
                bot = "Rock";
            }
    
            else if(botChoice >= 1 && botChoice < 2 ){
                bot = "Paper";
            }
    
            else if (botChoice >= 2 && botChoice < 3 ){
                bot = "Scissors";
            }
            while(!choice.equals("Rock") && !choice.equals("Paper") && !choice.equals("Scissors")){
                System.out.println("Please enter Rock, Paper, or Scissors.");
                choice = keyboard.nextLine();
            }
        }

        if(choice.equals("Rock")&& bot.equals("Paper")){
            System.out.println("The bot chose paper. You Lose.");
        }
        if(choice.equals("Rock")&& bot.equals("Scissors")){
            System.out.println("The bot chose Scissors. You win.");
        }
        if(choice.equals("Paper")&& bot.equals("Rock")){
            System.out.println("The bot chose Rock. You win.");
        }
        if(choice.equals("Paper")&& bot.equals("Scissors")){
            System.out.println("The bot chose Scissors. You Lose.");
        }
        if(choice.equals("Scissors")&& bot.equals("Paper")){
            System.out.println("The bot chose Paper. You Lose.");
        }
        if(choice.equals("Scissors")&& bot.equals("Rock")){
            System.out.println("The bot chose Rock. You Lose.");
        }
        



       
    keyboard.close();
    }
    
}
