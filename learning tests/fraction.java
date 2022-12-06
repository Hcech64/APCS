import java.util.Scanner;
public class fraction {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("what is the first number?");
        int first = keyboard.nextInt();
        System.out.println("what is the second number?");
        int second = keyboard.nextInt();
        System.out.println("what is the third number?");
        int third = keyboard.nextInt();
        System.out.println("what is the fourth number?");
        int fourth = keyboard.nextInt();
    
        System.out.println("these fractions added are:");
        FixedFraction.frac1(first, second, third, fourth);

        System.out.println("these numbers multiplied are:");
        FixedFraction.mult(first, second, third, fourth);


        keyboard.close();
    }
}
