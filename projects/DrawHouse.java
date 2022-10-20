package projects;
//import java.util.Scanner;
import java.awt.*;
import javax.swing.*;



public class DrawHouse extends JPanel {
    private static final long serialVersionUID = 7148504528835036003L;
    
    
    public void paintComponent(Graphics g) {
             
        //DRAWING
        // drawLine(start X, start Y, end X, End Y);
        // setColor(Color."COLOR")
        //draw.String("what you want to say", start X, start Y.)
        //drawRect(start X, start Y, Width, Height)
        //drawOval(start X, start Y, Width, Height)
        //drawArc(start x, start y, width, height, startAngle, ArcAngle)

       
        g.setColor(Color.BLACK.darker());

        int x = 0;
        String num = Integer.toString(x);
        while(x <= 800) {
            g.drawString(num, 10, x );
            g.drawLine(x, 0 , x ,800);
            x= x + 25;
            num = Integer.toString(x);
        }

        int y = 0;
        String numy = Integer.toString(y);
        while(y <= 800) {
            g.drawString(numy, y, 10 );
            g.drawLine(0, y, 800, y);
            y= y + 25;
            numy = Integer.toString(y);
            }
    
            //house
            g.setColor(Color.GREEN.darker().darker());
            g.fillRect(150, 325, 225, 125);


            //roof
            g.setColor(Color.BLACK.darker().darker());
            g.fillRect(125, 300, 275, 25);
            g.fillRect(150, 275, 225, 25);
            g.fillRect(175, 250, 175, 25);
            g.fillRect(200, 225, 125, 25);
            
            //windows
            g.setColor(Color.CYAN);
            g.fillRect(375, 400, 275, 25);


            
    }
    
    public static void main(String[] args) {
    
        var panel = new DrawHouse();
        var frame = new JFrame("A simple graphics program");
        frame.setSize(800, 800);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add(panel, BorderLayout.CENTER);
        frame.setVisible(true);
    
    }
} 

