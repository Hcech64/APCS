import java.util.Scanner;


class Computer{
    private String processor;
    private int memory;
    private int storage;

    public Computer(String proc, int mem,  int stor){
        processor = proc;
        memory = mem;
        storage = stor;
    }

    public String toString(){

        return processor + ", " + memory + "GB memory, " +storage +  "ZB storage.";
    }
}


class pets{
    private int number;
    private String size;
    private String type;
    private String color;

    public pets(int num, String siz, String ty, String col){
     number = num;
        size = siz;
        type = ty;
        color = col;
        }

        public String toString(){
        return "you have " + number + " " + size + " " + color + " " + type + " in your house";
        }
}

class boxy{
    private int height;
    private int width;
    private int depth;

    public boxy(int h, int w, int d){
        height =h;
        width = w;
        depth = d;
        }

    public String toString(){
        return "the volume of the box is " + height*width*depth;
    }


}

public class IntroToOOP {
    public static void main(String [] args){

        Scanner h = new Scanner(System.in);
        Scanner w = new Scanner(System.in);
        Scanner d = new Scanner(System.in);

        //System.out.println("this will give you an intro to object oriended program");
        Computer comp1 = new Computer("I9-13900k", 128, 69 );
        System.out.println(comp1);

        pets pet = new pets(3, "fat", "cats", "pink");
        System.out.println(pet);
        


        System.out.println("please ender the hight of the box");
        int height = h.nextInt();

        System.out.println("please ender the width of the box");
        int width = w.nextInt();

        System.out.println("please ender the depth of the box");
        int depth = d.nextInt();


        boxy box = new boxy(height, width, depth);
        System.out.println(box);

        h.close();
        w.close();
        d.close();
    }
}