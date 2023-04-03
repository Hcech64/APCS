package review_programs;

import java.util.*;

public class SphereVolume {
    public static void main(String[] args) {
        System.out.println("what is the radius of the sphere");
        Scanner keyboard = new Scanner(System.in);
        int rad = keyboard.nextInt();

        Double pi = 3.1415925535;

        Double Volume = (rad*rad*rad) * pi * 4 /3;
        System.out.println("the volume of the sphere is " + Volume);

        keyboard.close();
    }
}
