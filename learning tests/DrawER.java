//import java.util.Scanner;
import java.awt.*;
import javax.swing.*;



public class DrawER extends JPanel {
    private static final long serialVersionUID = 7148504528835036003L;
    
    
    public void paintComponent(Graphics g) {
             
        super.paintComponent(g);
        g.setColor(Color.MAGENTA);
        g.fillOval(50, 50, 70, 50);

        //DRAWING
        // drawLine(start X, start Y, end X, End Y);
        // setColor(Color."COLOR")
        //draw.String("what you want to say", start X, start Y.)
        //drawRect(start X, start Y, Width, Height)
        //drawOval(start X, start Y, Width, Height)
        //drawArc(start x, start y, width, height, startAngle, ArcAngle)

        g.setColor(Color. ORANGE);
        g.drawLine(50, 50, 150, 400);  
        g.setColor(Color.BLACK.darker());
        g.setFont(getFont().deriveFont(200));
        g.drawString("Hello World" , 50, 350);

        g.drawRect(200, 200 , 50, 50);

  

        g.setColor(Color.BLACK.darker());

        int x = 0;
        String num = Integer.toString(x);
        while(x <= 400) {
            g.drawString(num, 10, x );
            g.drawLine(x, 0 , x ,400);
            x= x + 25;
            num = Integer.toString(x);

        }
    
        int y = 0;
        String numy = Integer.toString(y);
        while(y <= 400) {
            g.drawString(numy, y, 10 );
            g.drawLine(0, y, 400, y);
            y= y + 25;
            numy = Integer.toString(y);
            
        }
    
    }
    
    public static void main(String[] args) {
    
        var panel = new DrawER();
        var frame = new JFrame("A simple graphics program");
        frame.setSize(400, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add(panel, BorderLayout.CENTER);
        frame.setVisible(true);
    
    }
} 

