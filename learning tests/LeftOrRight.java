import java.util.Scanner;public class LeftOrRight {
    public static void main(String [] args){
        Scanner keyboard = new Scanner(System.in);

        // 0 is left hand
        // 1 is right hand
        int hand = (int)(Math.random()*2);

        int guess = -2;
        
        while (guess !=hand){
            System.out.println("Which hand am I holding the candy? PLease type left or right: ");

            String input = keyboard.nextLine();
            if (input.equals("right")){
                guess = 0;
            }
            else if (input.equals("left")){
                guess = 1;
            }
            else{
                System.out.println("please type right of left");
            }

            }
        }
        keyboard.close();
    }

