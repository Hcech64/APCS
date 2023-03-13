public class Rectangle{

    int width;
    int height;

    public Rectangle(){
        this.width = 1;
        this.height = 1;
    }

    public Rectangle(int h, int w){
        this.width = w;
        this.height = h;
    }

    public String toString(){
            return "the height is " + height + " and the width is " + width;
        }

    public int area(){
        return height * width;
    }

    public int perimeter(){
        return height + height + width + width;
    }
    
    

    public void scale(int factor){
        this.width = width * factor;
        this.height = height * factor;
    }
    
}
