import java.util.Scanner;

public class OOP {

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




    public static void main(String [] args){
        Scanner fx = new Scanner(System.in);


    System.out.println("what is the X value for f(X)");
    int X = fx.nextInt();
    fx fX = new fx(X);
    System.out.println(fX);
    }
}
