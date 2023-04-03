package review_programs;

import java.util.*;

public class DecToBinary {
    public static void main(String[] args) {
        Scanner k = new Scanner(System.in);

        System.out.println("what is the number in base 10 ?");
        int bin = k.nextInt();

        System.out.println("The number in binary is " + Integer.toBinaryString(bin));

        k.close();

    }
}
