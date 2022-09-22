import java.util.Scanner;

public class control{
    public static void main(String args[]){
    
        System.out.println("what is your name? ");
        Scanner keyboard1 = new Scanner(System.in);
        String name = keyboard1.nextLine();

        System.out.println("how old are you? ");
        Scanner keyboard2 = new Scanner(System.in);
        String age = keyboard2.nextLine();


        System.out.println("where do you live? ");
        Scanner keyboard3 = new Scanner(System.in);
        String live = keyboard3.nextLine();


        System.out.println("what is your social security number? ");
        Scanner keyboard4 = new Scanner(System.in);
        String ssn = keyboard4.nextLine();

        System.out.println("I now am you, I know everything about you " + name);
        System.out.println(age);
        System.out.println(live);
        System.out.println(ssn);

        keyboard1.close();
        keyboard2.close();
        keyboard3.close();
        keyboard4.close();

    }
}