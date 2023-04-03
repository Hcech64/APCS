package review_programs;
import java.util.*;

public class CharacterOrganizer {
    public static void main(String[] args) {
        Scanner k = new Scanner(System.in);
    
        System.out.println("what is the character to be sorted");
        String Char = k.nextLine();

        int ASCII = (int)(Char.charAt(0));

        //System.out.println(ASCII);

        String type =  "";

        if(ASCII > 127){
            type = "extended ASCII character";
        }
        else if(ASCII > 122){
            type = "special character";
        }
        else if(ASCII > 96){
            type = "lowercase letter";
        }
        else if(ASCII > 91){
            type = "special character";
        }
        else if(ASCII > 64){
            type = "uppercase letter";
        }
        else if(ASCII > 57){
            type = "special character";
        }
        else if(ASCII > 47){
            type = "number";
        }
        else if(ASCII > 31){
            type = "special character";
        }
        else if(ASCII == 31){
            type = "space";
        }
        else if(ASCII < 32){
            type = "obscure character";
        }
        
        System.out.println("the type of character is a " + type);

        k.close();
   }
}
