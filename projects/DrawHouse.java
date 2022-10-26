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

       //background
            //sky
            g.setColor(Color.cyan.brighter());
            g.fillRect(0, 0, 800, 800);
            //grass
            g.setColor(Color.GREEN.darker().darker());
            g.fillOval(0, 425, 800, 50);
            g.fillRect(0, 450, 800, 350);

        //grid and coordinates
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
            g.setColor(Color.LIGHT_GRAY);
            g.fillRect(150, 325, 225, 125);

            //Chimney
            //smoke
            g.setColor(Color.GRAY.darker().darker());
            g.fillOval(280, 150, 50, 25);
            g.fillOval(300, 160, 50, 25);
            g.fillOval(280, 170, 50, 25);
            g.fillOval(300, 180, 50, 25);
            //back ground
            g.setColor(Color.GRAY.darker());
            g.fillRect(300, 200, 50, 50);
            //bricks
            g.setColor(Color.red.darker());
            g.fillRect(300, 200, 20, 10);
            g.fillRect(321, 200, 20, 10);
            g.fillRect(341, 200, 9, 10);
            //layer 2
            g.fillRect(300, 211, 11, 10);
            g.fillRect(312, 211, 20, 10);
            g.fillRect(333, 211, 17, 10);
            //layer 3
            g.fillRect(300, 222, 20, 10);
            g.fillRect(321, 222, 20, 10);
            g.fillRect(341, 222, 9, 10);
            //layer 4
            g.fillRect(300, 233, 11, 10);
            g.fillRect(312, 233, 20, 10);
            g.fillRect(333, 233, 17, 10);
            //layer 5
            g.fillRect(300, 244, 20, 5);
            g.fillRect(321, 244, 20, 5);
            g.fillRect(341, 244, 9, 5);

            //roof
            g.setColor(Color.GRAY.darker());
            g.fillRect(125, 300, 275, 25);
            g.fillRect(150, 275, 225, 25);
            g.fillRect(175, 250, 175, 25);
            g.fillRect(200, 225, 125, 25);
            
            //door
            g.setColor(Color.ORANGE.darker().darker().darker());
            g.fillRect(275, 350, 60, 100);
            //handle
            g.setColor(Color.black);
            g.fillOval(325,400,7,7);

            //address
            g.setColor(Color.BLACK.darker());
            g.drawString("1600", 285, 345);

            //windows
            g.setColor(Color.CYAN.darker());
            g.fillRect(175, 350, 24, 24);
            g.fillRect(175, 375, 24, 24);
            g.fillRect(200, 350, 24, 24);
            g.fillRect(200, 375, 24, 24);

            // upper window
            g.fillRect(238, 250, 24, 24);
            g.fillRect(238, 275, 24, 24);
            g.fillRect(263, 250, 24, 24);
            g.fillRect(263, 275, 24, 24);

            //bushes
            g.setColor(Color.green.darker());
            g.fillOval(227, 403, 20, 30);
            g.fillOval(213, 402, 25, 28);
            g.fillOval(202, 397, 20, 32);
            g.fillOval(195, 400, 35, 30);
            g.fillOval(189, 403, 20, 30);
            g.fillOval(180, 403, 25, 28);
            g.fillOval(173, 398, 20, 32);
            g.fillOval(169, 3960, 35, 30);

            //planter box
            g.setColor(Color.ORANGE.darker().darker());
            g.fillRect(173, 420, 75, 30);

            //planter boards
            int board = 180;
            g.setColor(Color.GRAY.darker().darker());
            while(board > 173 && board < 245){
                g.drawLine(board, 420, board, 450);
                board += 15;
            }

            // UFO
            

            g.setColor(Color.GRAY.darker());
            g.fillOval(495, 295, 160, 110);

            g.setColor(Color.CYAN.darker());
            g.fillOval(500, 300, 150, 100);

            g.setColor(Color.GRAY.darker());
            g.fillOval(450, 355, 250, 60);

            g.setColor(Color.green.darker());
            g.fillOval(x, y, y, board);


            g.setColor(Color.green);
            g.drawArc(450, 400, 225, 25, -45, -45);




            
    }
    
    public static void main(String[] args) {
    
        var panel = new DrawHouse();
        var frame = new JFrame("House");
        frame.setSize(800, 800);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add(panel, BorderLayout.CENTER);
        frame.setVisible(true);
    
    }
} 

