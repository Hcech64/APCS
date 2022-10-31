//import java.util.Scanner;
import java.awt.*;
import javax.swing.*;




public class GraphingLines extends JPanel {
    private static final long serialVersionUID = 7148504528835036003L;
    
    
    public void paintComponent(Graphics g) {

        super.paintComponent(g);

        int x = -400;
        int y = 800;
        int prevY = 0;
        int prevX = 0;

        int xx = 0;
        int yy = 0;

        g.setColor(Color.BLACK.darker().darker());

        while(xx <= 800){
            g.drawLine(xx, 0, xx, 800);
            xx += 25;
        }

        while(yy <= 800){
            g.drawLine(0, yy, 800, yy);
            yy += 25;
        }


        g.setColor(Color.RED);
        //g.setFont(Font ("Times New Roman", 1, 30));
        while(x <= 400){
            
            x++;
            y = x*x/10;
            g.fillOval(x + 400, 800 - y, 8, 8);
            g.drawLine(prevX+400, 800-prevY, x+400, 800-y);
            prevY = y;
            prevX = x;
        }
    
    }

    public static void main(String[] args) {
    
        var panel = new GraphingLines();
        var frame = new JFrame("Graph");
        frame.setSize(800, 800);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add(panel, BorderLayout.CENTER);
        frame.setVisible(true);
    
    }
}
