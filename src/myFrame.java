import javax.swing.*;
import java.awt.*;

public class myFrame extends JFrame {
    myFrame(){
        this.setTitle("Tutorial of java swing");//set title
        this.setResizable(false);//prevent frame from being resized
        this.setSize(430,430);//set x-dimension and y-dimension
        this.setVisible(true);//make frame visible
        ImageIcon image = new ImageIcon("logo.jpg");//create image icon
        this.setIconImage(image.getImage());//change icon of frame
//        frame.getContentPane().setBackground(Color.blue);
//        frame.getContentPane().setBackground(new Color(123,50,250));
        this.getContentPane().setBackground(new Color(0x123456));//custom color
    }
}
