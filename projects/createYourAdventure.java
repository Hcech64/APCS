package projects;

import java.util.Scanner;



public class createYourAdventure {
    static Scanner keyboard = new Scanner(System.in);


    public static void main (String []args){
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
            answer = checkValid(answer);

            //accept consequences
            if (answer.equals("a")){
                System.out.println("you pack your bags, and leave to find a place to sleep for the night. You run into another homeless man. He has a knife and tells you to give him your stuff, or die. Type \'a\' to accept the threat and give him your stuff, or type \'b\' to run.");

                answer = keyboard.nextLine();
                answer = checkValid(answer);
                //accept consequences
                if (answer.equals("a")){
                    System.out.println("you give him all your stuff, and run away into the cold night. you still need a place to sleep. Type \'a\' to sleep under a bridge, or type \'b\' to run into the forest.");

                    answer = keyboard.nextLine();
                    answer = checkValid(answer);

                    //bridge
                    if (answer.equals("a")){
                        System.out.println("you go to sleep under a bridge, but in the middle of the night a semi truck breaks the weight limit, and the bridge come crashing down on you. You die.");
                    }
                    //forest
                    else if (answer.equals("b")){
                        System.out.println("You run into the forest and find a nice cave to sleep in. you cubble up against a soft shrub in the cave and fall asleep. In the middle of the night you come to the realization that the shrub was actully a bear when it rips your face off. You die.");
                    }

                }
                // run from homeless
                if (answer.equals("b")){
                    System.out.println("you rin and duck for cover as the other homeless man throws his knife at you. You see it fly by you, and and on the side walk ahead of you. You run over and pick it up. Type \'a\' to take the knife and run, type \'b\' to use the knife and rob the other homeless man.");

                    answer = keyboard.nextLine();
                    checkValid(answer);

                    //run with knife
                    if (answer.equals("a")){
                        System.out.println("You run away. You look back and see the homeless man chasing after you. You dont see a crack in the sidewalk and you trip and fall, landing on the blade of your knife. You die.");
                    }
                    //*rob homeless*
                    else if (answer.equals("b")){
                        System.out.println("you run back towards and homeless man and while holding him at knife point, you take his bags. You run to a nearby library and in the bathroom you look in the homeless mans bags. when you open them up you see that they are full of $100 bills. you realize that this will help you get back on your feet, so you take the money, buy a suit, car and a nice house. You live happily ever after.");
                        
                    }
                }

            }
            //stab landlord
            else if (answer.equals("b")){
                System.out.println("You pull out your large knife and stab your land lord in the gut. He collapses on the ground and writhes in pain. You say \'This house is mine now.\'. You then take him into his room, put him in the bathtub, and lock the door. Type \'a\' to transfer the deed to you and hide his body, or type \'b\' to call the ambulance to save his life.");

                answer = keyboard.nextLine();
                checkValid(answer);

                //steal house
                if (answer.equals("a")){
                    System.out.println("You use his fingerprint to open his safe. You transfer the deed into your name and burry his body under the garden in the back. Now that you own the house, you put up a listing to rent out the your old room, and you move into the owner's bigger room. You get an offer for your appartment that would pay for all the utilities. The offer is from an ex seal team 6 badass, do you accept? type \'a\' to accpet type \'b\' to decline");
                }
                else if (answer.equals("b")){
                    System.out.println("You call teh ambulance and they arrive in 20 minutes. As the parametics are taking him away, a police officer arrives on the sceen and askes you what happened. type \'a\' to admit to stabbing him, or type \'b\' to lie to the cops and say he sliped and fell.");

                    answer = keyboard.nextLine();
                    answer = checkValid(answer);

                    if (answer.equals("a")){
                            System.out.println("you admit to stabbing him, and are sent to prison, you then are brutally murdered by a large felon who didnt like the way u ate your broccli");
                    }
                    else if (answer.equals("b")){
                        System.out.println("");
                    }
                }

                

            }
           




        }
        //need money
        else if (answer.equals("b")){
           


        }
        else if (answer.equals("c")){
           


        }
        
    }

    public static String checkValid(String ans) {
        
        while(!ans.equals("a") && !ans.equals("b")){
            System.out.println("please enter a vaid answer: ");
            ans = keyboard.nextLine();
        }
        return ans;
    }
}
