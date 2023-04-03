package review_programs;

import java.util.*;

public class celcius {
    public static void main(String[] args) {
        System.out.println("what is the tempurature in Fahrinehite that you wish to convert to celcius");
        Scanner keyboard = new Scanner(System.in);
        int tempurature = keyboard.nextInt();

        int NewTemp = 5 * (tempurature -32) /9;
        System.out.println("the temp in celcius is " + NewTemp);

        keyboard.close();
    }
}
