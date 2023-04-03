package review_programs;
import java.util.*;

public class NameSwitch {
    public static void main(String[] args) {
        System.out.println("What is Name");

        Scanner k = new Scanner(System.in);
        String name = k.nextLine();

        String NewName = "";
        for(int i = name.length(); i > 0; i--){
            NewName += name.charAt(i-1);
        }

        System.out.println("your name backwards is " + NewName);

        k.close();
    }
    

}
