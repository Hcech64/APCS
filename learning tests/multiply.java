
import java.awt.*;
import javax.swing.*;




public class multiply extends JPanel {
    private static final long serialVersionUID = 7148504528835036003L;
    
    
    public void paintComponent(Graphics g) {

        super.paintComponent(g);

        int x = 1;
        int y = 1;

        while(x<= 801){
            g.drawLine(x, 0 , x, 800);
            x+= 25;
        }

        while(y<= 801){
            g.drawLine(0, y , 800, y);
            y+= 25;
        }

        for (x = 1; x <= 32; x++){
            for (y = 1; y<= 32; y++){
                g.drawString(Integer.toString(x*y), x*25-22, y*25-5);
            }
        }
        



    
    }

    public static void main(String[] args) {
    
        var panel = new multiply();
        var frame = new JFrame("Graph");
        frame.setSize(800, 800);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add(panel, BorderLayout.CENTER);
        frame.setVisible(true);
    
    }
}