import java.util.*;

public class Initial{
        public static void main(String[] args) {
            Scanner keyboard = new Scanner (System.in);

            System.out.println("what is your first name");
            String first = keyboard.nextLine();
            System.out.println("what is your last name");
            String last = keyboard.nextLine();
            Initial init = new Initial(first, last);
            System.out.println(init);
    
            System.out.println("please enter a number for f(x):");
            int input = Integer.parseInt(keyboard.nextLine());
            Function func = new Function(input);
            System.out.println(func);
    
            System.out.println("what is your name?");
            String Name = keyboard.nextLine();
    
            System.out.println("Yes or no, Is you a " + Function.sexy + " ?");
            String sexy = keyboard.nextLine();
    
            IfTyler tyler = new IfTyler(Name, sexy);
            System.out.println(tyler);
    
            keyboard.close();
        }


    private String first;
    private String last;

    public Initial(String First, String Last){
        last = Last;
        first = First;
    }
    public String toString(){
        return first.toUpperCase().substring(0,1) + " " + last.toUpperCase().substring(0,1);
    }
}