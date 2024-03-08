import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setTitle("Tutorial of java swing");
        frame.setResizable(false);
        frame.setSize(430,430);
        frame.setVisible(true);
        ImageIcon image = new ImageIcon("logo.jpg");
        frame.setIconImage(image.getImage());
//        frame.getContentPane().setBackground(Color.blue);
//        frame.getContentPane().setBackground(new Color(123,50,250));
        frame.getContentPane().setBackground(new Color(0x123456));
    }

}