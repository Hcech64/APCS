import java.util.*;

public class IfTyler {
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
    private String Name;
    private String Sexy;
    private String string = "";

    public IfTyler(String name, String sexy){
        Name = name;
        Sexy = sexy;
    }

    public String toString(){
        if(Name.equalsIgnoreCase("tyler") && (Sexy.equalsIgnoreCase("Yes"))){
            return "heyyy bebe. Ur a sexy " + Name;
        }

        else if(Name.equalsIgnoreCase("tyler") && (!Sexy.equalsIgnoreCase("Yes"))){
            return "False all tylers are sexy";
        }

        if(!Name.equalsIgnoreCase("tyler") && (Sexy.equalsIgnoreCase("Yes"))){
            return "damn boi i seeee youuuu!";
        }

        if(!Name.equalsIgnoreCase("tyler") && (!Sexy.equalsIgnoreCase("Yes"))){
            return "thats a big oof " + Name;
        }
        return string;
        
    }

}

