public class pointLineMath{

    public static String pointFromXY(int x, int y){

        return "the place on the xy plane is ( " + x + " , " + y + ")";
    }

    public static String Line(int x, int y, int slope){

        int endX = x + 1;
        int endY = y + slope;

        int startX = x -1;
        int startY = y - slope;

        double length = Math.sqrt((endX - startX) * (endX - startX) + (endY - startY) * (endY - startY));

    

        return " the line starts at ( " + startX + " , " + startY + ") and ends at ( " + endX + " , " + endY + " ) and the segmant length is" + length;


    }
}