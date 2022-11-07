import java.util.Scanner;

public class Twiangles {
    public static void main(String [] args){

        Scanner keyboard = new Scanner(System.in);
        
        
        int x = 0;
        int y = 0;
    

        System.out.println("what shape do you want to see? square, rectangle, right triangle, or isosceles triangle?");
        String input = keyboard.nextLine();

        while(!input.equalsIgnoreCase("square") && !input.equalsIgnoreCase("rectangle") && !input.equalsIgnoreCase("right triangle") && !input.equalsIgnoreCase("isosceles triangle")){
            System.out.println("please enter one of the options: square, rectangle, right triangle, or isosceles triangle");
            input = keyboard.nextLine();
        }

        System.out.println("how any pixels tall do you want the shape to be?");
        int tall = keyboard.nextInt();

        


        if(input.equalsIgnoreCase("square")){
            for(x = 0; x <tall; x++){
                for(y= 0; y <tall; y++){
                    System.out.print("*  ");
                }
                System.out.println();
            }
        }
        if(input.equalsIgnoreCase("rectangle")){
            for(x = 0; x <tall; x++){
                    
                for(y= 0; y <= tall + 2; y++){
                    System.out.print("* ");
                }
                System.out.println();
            }
        }

        if(input.equalsIgnoreCase("right triangle")){
            for(x = 0; x <tall; x++){
                for(y = 0; y <= x; y++){
                    System.out.print("* ");

                }
                System.out.println();
            }
        }

        if(input.equalsIgnoreCase("isosceles triangle")){
            for(x = 0; x <= tall/2; x++){
                for(y=0; y <= x; y++){
                    System.out.print("*  ");
                }
                System.out.println();
            }
            for(x = tall/2; x >= 0; x--){
                for(y=0; y <= x; y++){
                    System.out.print("*  ");
                }
                System.out.println();
            }

        }
        
    }
}
