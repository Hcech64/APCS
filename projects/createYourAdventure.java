package projects;

import java.util.Scanner;



public class createYourAdventure {
    static Scanner keyboard = new Scanner(System.in);


    public static void main (String []args){
        //4 choices per path. must have a while loop to check that the user is inputing correct answers

        System.out.println("You are walking down the street in the big city. You are a little low on money, and your rent was due yesterday. Type \'1\' if you want to accept the consequences of not paying your rent, or type \'2\' if  you want to make a little extra money, or \'3\' if you want to escape to ecuador.");
        String answer = keyboard.nextLine();
        
        while(!answer.equals("1") && !answer.equals("2") && !answer.equals("3")){
            System.out.println("please enter a vaid answer: ");
            answer = keyboard.nextLine();
        }

        //accept consequence
        if (answer.equals("1")){
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
                    
                    answer = keyboard.nextLine();
                    answer = checkValid(answer);

                    if (answer.equals("a")){
                        System.out.println("you accept the offer, but your new tennant finds your seacret and mmurders you in your sleep");
                    }
                    if (answer.equals("b")){
                        System.out.println("you decline the offer, but he finds you secret and murders you in your sleep.");
                    }
                }
                //call help
                else if (answer.equals("b")){
                    System.out.println("You call the ambulance and they arrive in 20 minutes. As the parametics are taking him away, a police officer arrives on the sceen and askes you what happened. type \'a\' to admit to stabbing him, or type \'b\' to lie to the cops and say he sliped and fell.");

                    answer = keyboard.nextLine();
                    answer = checkValid(answer);

                    if (answer.equals("a")){
                            System.out.println("you admit to stabbing him, and are sent to prison, you then are brutally murdered by a large felon who didnt like the way u ate your broccli");
                    }
                    else if (answer.equals("b")){
                        System.out.println("you lie to the cops and they find out. You are sent to prison, where you are brutally murdered by a large felon who didnt like the way u ate your broccli");
                    }
                }
            }
        }
        //need money
        else if (answer.equals("2")){
            System.out.println("You decide to make a little extra money. You only know of two ways to get money: type \'a\' to choose McDonalds, or type \'b\' to chooseAssasination");
            
            answer = keyboard.nextLine();
            answer = checkValid(answer);
            //Mcdonalds
            if (answer.equals("a")){
                System.out.println("You go to McDonalds and get a second job, you get a little extra money which allows you to pay your rent. One day, a dud comes into your store with a shotgun and demands all the money in the register. type \'a\' to give him money, or \'b\' to pull out your bigger shotgun.");
            
                answer = keyboard.nextLine();
                answer = checkValid(answer);

                if (answer.equals("a")){
                    System.out.println("you give him all the money, and he leaves. Your manager scolds you and you get fired. You are now looking for another job, so you go to Taco Bell. The same robber comes into the taco bell a week later, asking for all the money in the register. Type \'a\' to give him the money, or type \'to pull out your gun.\'");
                
                    answer = keyboard.nextLine();
                    answer = checkValid(answer);

                    if (answer.equals("a")){
                            System.out.println("You give him all the money, but he thinks that you will report him to the cops so he shoots you. You die on the floor of the Taco Bell.");
                    }
                    else if (answer.equals("b")){
                        System.out.println("You pull out your gun and shoot him in the chest. You think he is dead to you come out from behind the counter. He is still alive and shoots you before he dies. You die on the floor of the Taco Bell.");
                    }
                }
                else if (answer.equals("b")){
                    System.out.println("You pull out your gun and shoot him in the face. He dies. the cops come to see what happened. Type \'a\' to tell them what happened or type \'b\' lie and say you didnt shoot him.");
                
                    answer = keyboard.nextLine();
                    answer = checkValid(answer);

                    if (answer.equals("a")){
                            System.out.println("you tell them what happened but are still arrested for manslaughter. you are found guilty by a very currupt jury and sentenced to life in prison. You are shived 5 years into your sentece by a routy cell mate.");
                    }
                    else if (answer.equals("b")){
                        System.out.println("you lie to the cops but they know you are lying. You are being lead out of the store when a sniper accross the street kills you for killing their friend.");
                    }
                }
            }
            //assasination
            else if (answer.equals("b")){
                System.out.println("You get hired as an assasin and are givin your first asignment. You and your parter Tyler are assigned to kill the president of charmin ultrasoft. You feel bad becuase he has done nothing wrong. Type \'a\' to kill him, or type \'b\' to refuse");
                
                answer = keyboard.nextLine();
                answer = checkValid(answer);

                //kill him
                if (answer.equals("a")){
                    System.out.println("You sneak into his hous and find him asleep in his bead. Now is the moment, type \'a\' to kill him, or type \'b\' to chicken out.");
                
                    answer = keyboard.nextLine();
                    answer = checkValid(answer);

                    if (answer.equals("a")){
                            System.out.println("you shoot him in the head, and then are shot from behind as Tyler describes about maximizing profit.");
                    }
                    else if (answer.equals("b")){
                            System.out.println("you chicken out. Tyler finishes the job, then kills you for being \'too weak\'");
                    }
                }
                //refuse
                else if (answer.equals("b")){
                    System.out.println("You refuse to kill the president and are punished by your assasination group. You have to \'a\' kill his family, or \'b\' get killed");
                
                    answer = keyboard.nextLine();
                    answer = checkValid(answer);

                    if (answer.equals("a")){
                        System.out.println("you kill his entire family, but are then murded by the groups becuase you were weak.");
                    }
                    else if (answer.equals("b")){
                         System.out.println("you refuse to kill him and are brutally murded.");
                    }
                }

            } 
        }
        //ecuador
        else if (answer.equals("3")){
            System.out.println("You buy a ticket to ecuador, but on the way to the airpot a recall in announced for the plane you are about to board. Type \'a\' to board, or \'b\' to wait for another plane.");
            
            answer = keyboard.nextLine();
            answer = checkValid(answer);

            if (answer.equals("a")){
                System.out.println("you continue on your journey, and the plane takes off. mid flight, the plane starts to go down,the cabin depreasurizes and the masks drop down. Yours does not, but the kid's next to you does. Type \'a\' to try to find another mask, or type \'to take the childs mask.\'");
            
                answer = keyboard.nextLine();
                answer = checkValid(answer);

                if (answer.equals("a")){
                    System.out.println("You try to find a mask but to no avail. You know you are going to die. Type \'a\' to jump out the open door, or type \'b\'' to sit down and give up.");
                
                    answer = keyboard.nextLine();
                    answer = checkValid(answer);

                    if (answer.equals("a")){
                        System.out.println("you jump out of the plane and the last thing that goes through your mind is that you could have taken that kid's mask.");
                    }
                    else if (answer.equals("b")){
                        System.out.println("you sit down in your chair and slowly fall into a deep sleep. Your body was never found in the crash.");
                    }
                }
                else if (answer.equals("b")){
                    System.out.println("You take the child's mask and he passes out quickly. The plane is still plumiting, whith no chanch of survival. You know you are going to die. Type \'a\'' to jump out the open door, or type \'b\' to sit down and give up.");
                
                    answer = keyboard.nextLine();
                    answer = checkValid(answer);

                    if (answer.equals("a")){
                        System.out.println("you jump out the door, and you are super lucky, landing in a cushy tree and only breaking a leg and arm. You think that you can make it, but you are mauled by a hungry bear. You don't last two minutes in its jaws.");
                    }
                    else if (answer.equals("b")){
                        System.out.println("You sit down and think of how side your life is as your vision fades to darkness.");
                    }
                }
            }
            else if (answer.equals("b")){
                System.out.println("You wait for a new plane to arrive. When it does it is the same kind of plane. Type \'a\' to wait for yet another plane, or type \'b\' to board the plane.");
                
                answer = keyboard.nextLine();
                answer = checkValid(answer);

                if (answer.equals("a")){
                    System.out.println("you wait for a third plane but when it comes, the pilot says it can't take all the passengers that bought a ticket. Type \'a\' to get a refund and give up on Ecuador, or type \'b\' to let someone else take the bump.");
                
                    answer = keyboard.nextLine();
                    answer = checkValid(answer);

                    if (answer.equals("a")){
                        System.out.println("You give up on going to ecuador. You are sad and hopeless and not paying attention to the road as you drive home. Your car runs out of gas as rolled to a stop on some traintracks. You didnt see the train.");
                    }
                    else if (answer.equals("b")){
                        System.out.println("You let someone else take the bump, but as you the plane takes off, it hits a bird in one of the jets, sending it into a tailspin. there were no survivors.");
                    }
                }
                else if (answer.equals("b")){
                    System.out.println("you board the plane, and can immediatly tell that it was a bad discision. The plane ride is super rought and you get sick to your stomach. Type \'a\' to go to the bathroom, or type \'b\' to stay seated.");
                
                    answer = keyboard.nextLine();
                    answer = checkValid(answer);

                    if (answer.equals("a")){
                        System.out.println(" you go the the bathroom, but the cabin looses preasure and you pass out. Your body was never found in the crash.");
                    }
                    else if (answer.equals("b")){
                        System.out.println("you stay seated and the plane ride smooths out. Just before you land, one of the passengers pulls our a gun and shooths the pilots through the cabin door. He then jumps out the door with a parashoot. No one survived the crash.");
                    }
                }

            } 
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


