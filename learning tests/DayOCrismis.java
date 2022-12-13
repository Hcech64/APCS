public class DayOCrismis {
    
    public static void main(String[] args) {


        String [] dayOfChristmas = new String[13];
        dayOfChristmas[1] = "A Partridge in a Pear Tree";
        dayOfChristmas[2] = "Two Turtle Doves";
        dayOfChristmas[3] = "Three French Hens";
        dayOfChristmas[4] = "Four Calling Birds";
        dayOfChristmas[5] = "Five Gold Rings";
        dayOfChristmas[6] = "Six Geese A-laying";
        dayOfChristmas[7] = "Seven Swans A-swimming";
        dayOfChristmas[8] = "Eight Maids A-milking";
        dayOfChristmas[9] = "Nine Ladies Dancing";
        dayOfChristmas[10] = "Ten Lords A-leaping";
        dayOfChristmas[11] = "Eleven Pipers Piping";
        dayOfChristmas[12] = "Twelve Drummers Drumming";

        String [] num = new String [13];
        num[1] = "first";
        num[2] = "second";
        num[3] = "third";
        num[4] = "fourth";
        num[5] = "fifth";
        num[6] = "sixth";
        num[7] = "seventh";
        num[8] = "eighth";
        num[9] = "nineth";
        num[10] = "tenth";
        num[11] = "eleventh";
        num[12] = "twelveth";


        for(int x = 1; x <= 12; x++){

            System.out.println("On the " + num[x] + " of Christmas, my true love gave to me:");
           
            for(int y = 1; y <= x; y++){
                 System.out.println(dayOfChristmas[y]);
            }
            System.out.println("");
        }
    }
}
