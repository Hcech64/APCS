import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;




public class Picture extends JPanel {
    private static final long serialVersionUID = 7148504528835036003L;

    public void paintComponent(Graphics g) {
        BufferedImage Cotter = null;
  
        try{
            Cotter = ImageIO.read(new File("Cotter.JPG"));
        }
        catch(IOException e){}
        g.drawImage(Cotter, 0, 0, 1000, 1000, getBackground(), getFocusCycleRootAncestor());

        g.setColor(Color.BLACK);
        g.fillOval(390, 370, 100, 50);
        g.fillOval(490, 370, 100, 50);
        g.drawLine(370, 350, 390, 400);
        g.drawLine(590, 400, 600, 350);

        
    }

    public static void main(String[] args) {

       var panel = new Picture();

       var frame = new JFrame("A Chad if I've every seen one");
       frame.setSize(1000, 1000);
       frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       frame.getContentPane().add(panel, BorderLayout.CENTER);
       frame.setVisible(true);

    }
}