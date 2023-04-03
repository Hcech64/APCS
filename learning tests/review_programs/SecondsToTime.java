package review_programs;

import java.util.*;

public class SecondsToTime {
    public static void main(String[] args) {
        Scanner k = new Scanner(System.in);

        System.out.println("what is the duration in seconds");
        int seconds = k.nextInt();


        int min = 0;
        int hr = 0;


        while(seconds > 3600){
            seconds -= 3600;
            hr++;
        }

        while(seconds > 60){
            seconds -= 60;
            min++;
        }

        System.out.println("the duration is " + hr + " hours, " + min + " minutes, and " + seconds + " seconds");

        k.close();
    }



}
