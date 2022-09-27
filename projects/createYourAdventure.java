package projects;

import java.util.Scanner;



public class createYourAdventure {
    public static String checkValid(String a) {
        Scanner keyboard = new Scanner(System.in);
        
        while(!a.equals("a") && !a.equals("b")){
            System.out.println("please enter a vaid answer: ");
            a = keyboard.nextLine();
        }

        keyboard.close();
        return a;
    }


    public static void main (String []args){
        Scanner keyboard = new Scanner(System.in);

        //4 choices per path. must have a while loop to check that the user is inputing correct answers

        System.out.println("You are walking down the street in the big city. You are a little low on money, and your rent was due yesterday. Type \'a\' if you want to accept the consequences of not paying your rent, or type \'b\' if  you want to make a little extra money, or \'c\' if you want to escape to ecuador.");
        String answer = keyboard.nextLine();
        
        while(!answer.equals("a") && !answer.equals("b") && !answer.equals("c")){
            System.out.println("please enter a vaid answer: ");
            answer = keyboard.nextLine();
        }

        //accept consequence
        if (answer.equals("a")){
            System.out.println("when you return home, your land lord is very angry. He tells you to pack your bags, cuase \'YOUR OUTA HERE!\' Type \'a\' to accept the consequences, or type \'b\' if you want to stab your landlord and claim his house as your own");

            answer = keyboard.nextLine();
            checkValid(answer);

            //accept consequences
            if (answer.equals("a")){
                System.out.println("you pack your bags, and leave to find a place to sleep for the night. You run into another homeless man. He has a knife and tells you to give him your stuff, or die. Type \'a\' to accept the threat and give him your stuff, or type \'b\' to run.");

                answer = keyboard.nextLine();
                checkValid(answer);

                //accept consequences
                if (answer.equals("a")){
                    System.out.println("you give him all your stuff, and run away into the cold night. you still need a place to sleep. Type \'a\' to sleep under a bridge, or type \'b\' to run into the forest.");

                    answer = keyboard.nextLine();
                    checkValid(answer);

                    if (answer.equals("a")){
                        System.out.println("you go to sleep under a bridge, but in the middle of the night a semi truck breaks the weight limit, and the bridge come crashing down on you. you die.");
                    }

                }

                if (answer.equals("b")){}

            }

            if (answer.equals("b")){

            }
           




        }
        //need money
        if (answer.equals("b")){
           


        }
        if (answer.equals("c")){
           


        }
        
        keyboard.close();
    }
}
