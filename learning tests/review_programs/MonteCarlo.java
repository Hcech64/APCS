package review_programs;
import java.util.Scanner;


public class MonteCarlo {
    public static void main(String[] args) {
        Scanner k = new Scanner(System.in);

        System.out.println("what is the side length of the square in?");
        int side = k.nextInt();

        System.out.println("the side length is " + side);
        System.out.println("the coords of the center is (" + side/2 + ", " + side/2 + ")");

        System.out.println("how many random coordinates do you want?");
        int coords = k.nextInt();

        int [][] coordinates = new int[coords][2]; 

        for(int i = 0; i < coords; i++){
            coordinates[i][0] = (int)(Math.random()*side);
            coordinates[i][1] = (int)(Math.random()*side);
        }

        for(int i = 0; i < coords; i++){
            System.out.println("Corrrdinate " + (i+1) + " is (" + coordinates[i][0] +", " +  coordinates[i][1] + ")");
        }
        
        int count = 0;
        for(int i =0; i < coordinates.length-1; i++){
            if(Math.sqrt(coordinates[i][0]*coordinates[i][0] + coordinates[i][1]*coordinates[i][1]) > side/2){
                System.out.println("Coordinate " + (i+1) + " is not in the circle");
                count++;
            }
        }

        System.out.println("the ratio of coordinate that are inside the circle and outside is" + (coords-count) + ":" + (count));

        k.close();

    }
}
