import java.util.*;

public class ArrayTestAssignment {
    public static void main(String[] args) {
        int[] intarray = {10, 20, 30};
        intarray[2] = 40;

        for(int i = 0; i < intarray.length; i++){
            System.out.println(intarray[i]);
        }

        ArrayList<Integer> Arrayl = new ArrayList<Integer>();

        Arrayl.add(0, 10);
        Arrayl.add(1, 20);
        Arrayl.add(2, 30);

        Arrayl.set(1, 50);
        Arrayl.remove(0);

        System.out.println(Arrayl);

        
    }
}
