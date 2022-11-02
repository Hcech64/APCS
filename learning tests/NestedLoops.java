
public class NestedLoops {
    
public static void main (String [] args){

    int x = 0;
    int y = 0;

    for(y=0; y < 5; y++){
        for(x=0; x<=y; x++);
        System.out.print("*");
        }
        System.out.println("*");
    }
}
