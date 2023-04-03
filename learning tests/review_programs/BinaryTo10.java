package review_programs;

import java.util.*;

public class BinaryTo10 {
    public static void main(String[] args) {
        Scanner k = new Scanner(System.in);

        System.out.println("what is the number in binary?");
        String bin = k.nextLine();

        System.out.println("The number in base 10 is " + Integer.parseInt(bin, 2));

        k.close();

    }
}