import java.util.Scanner;
public class point {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner (System.in);
        
        System.out.println("what is the x value?");
        int x = keyboard.nextInt();

        System.out.println("what is teh y value?");
        int y = keyboard.nextInt();

        System.out.println("what is the slope?");
        int slope = keyboard.nextInt();


        System.out.println(pointLineMath.pointFromXY(x, y));

        System.out.println(pointLineMath.Line(x, y, slope));

        keyboard.close();
    }

    
}
