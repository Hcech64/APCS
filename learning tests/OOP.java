import java.util.Scanner;

public class OOP {
    public static void main(String [] args){
        Scanner keyboard = new Scanner(System.in);
        Scanner board = new Scanner(System.in);

        System.out.println("what is the X value for f(X)");
        int X = keyboard.nextInt();
        fx func = new fx(X);
        System.out.println(func);
        
        System.out.println("what is the X value for g(X)");
        X = keyboard.nextInt();
        gx gFunc = new gx(X);
        System.out.println(gFunc);

        System.out.println("what is the word you want 1 letter shorter?");
        String String = board.nextLine();
        removeLastCharacter string = new removeLastCharacter(String);
        System.out.println(string);

        System.out.println("what word do you want to repeat?");
        String word = board.nextLine();
        System.out.println("How many times would you like it repeated");
        int num = keyboard.nextInt();
        repeat wepeat = new repeat(word, num);
        System.out.println(wepeat);

        keyboard.close();
        board.close();

    }
}

class fx{
    private int y;
    private int x;

    public fx(int xval){
        x = xval;
        y = 3*x + 5;
    }

    public String toString(){
        return "f(" + x + ") = " + y;
    }
}

class gx{
    private int y;
    private int x;

    public gx(int gxval){
        x = gxval;
        y = 4*x - 8;
    }

    public String toString(){
        return "g(" + x + ") = " + y;
    }
}

class removeLastCharacter{
    private String string;
    private int length;
    

    public removeLastCharacter(String input){
        string = input;
        length = input.length();
    }

    public String toString(){
        return string.substring(0, length-1);
    }
}

class repeat{
    private String input;
    private int num;
    public int x =0;
    private String repeats = "";

    public repeat(String word, int number){
        input = word;
        num = number;
    }

    public String toString(){
        
        for(x = 0; x < num; x++){
            repeats = repeats + " " + input;
        }
        return repeats;
    }
}
