package projects;
import java.util.Scanner;

public class madLib {
    public static void main(String[] args){
        
        Scanner keyboard = new Scanner(System.in);

        System.out.println("This is a MadLib program. Your Madlib should have at least 16 imputs");
        System.out.println("These could be pronouns, places, peoples, things,");
        
        // variable 1 - name
        System.out.println("please enter a name");
        String name = keyboard.nextLine();
        System.out.println(name);


        // variable 2 - job
        System.out.println("please enter a profession");
        String job = keyboard.nextLine();
        System.out.println(job);

         // variable 3 - adjective 1
         System.out.println("please enter an adjective: ");
         String adjective1 = keyboard.nextLine();


          // variable 4 - boss
        System.out.println("please enter a name");
        String boss = keyboard.nextLine();


         // variable 5 - product
         System.out.println("please enter a noun");
         String product = keyboard.nextLine();


          // variable 6 - place
        System.out.println("please enter a place");
        String place = keyboard.nextLine();



         // variable 7 - object
         System.out.println("please enter a noun");
         String object = keyboard.nextLine();


          // variable 8 - verb
        System.out.println("please enter a verb");
        String verb = keyboard.nextLine();


         // variable 9 - past verb
         System.out.println("please enter a verb in past tense");
         String pastverb = keyboard.nextLine();



          // variable 10 - cop verb
        System.out.println("please enter a verb");
        String copverb = keyboard.nextLine();


         // variable 11 - speech
         System.out.println("please enter a part of speech pluraled");
         String speech = keyboard.nextLine();


          // variable 12 - hide
        System.out.println("please enter an noun");
        String hide = keyboard.nextLine();


         // variable 13 - number
         System.out.println("please enter a number");
         String num = keyboard.nextLine();


          // variable 14 - home verb
        System.out.println("please enter a verb in past tense");
        String homeverb = keyboard.nextLine();


         // variable 15 - sleep
         System.out.println("please enter a noun");
         String sleep = keyboard.nextLine();


         // variable 16 - job
         System.out.println("please enter a verb in past tense");
         String sleepverb = keyboard.nextLine();




        // story time
        System.out.println(name + " was a very good " + job + ". They had to fight many angry customers in their line of work. Throught out their day, " + name + " is forced to work in many locations by their " + adjective1 + " boss named " + boss + ". One day, " + name + " was selling " + product + " at their favorite location: the " + place + ". They were approached by a centient " + object + " who wanted to " + verb + " with them. " + name + " said that they had better thing to do, and " + pastverb + " away. As they " + pastverb + " away, the cops saw them and started to " + copverb + " them, yelling " + speech + ". Finnally " + name + " got away and hid in a " + hide + ". After " + num + " hours, " + name + " came out of hiding and " + homeverb + " all the way home. Once home, they laid down on thier " + sleep + " and " + sleepverb + ". ");

        keyboard.close();
    }
    
}
