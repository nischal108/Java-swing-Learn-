package LearnOnOwn;

import javax.swing.*;
import java.awt.*;

 class MyFrame extends JFrame {
   MyFrame(String title){
       this.setTitle(title); // title

       // Set image icon for the frame
       ImageIcon image = new ImageIcon("logo.png");
       this.setIconImage(image.getImage());

       // Set background color of content pane
       this.getContentPane().setBackground(Color.WHITE);


       // Pack the components and set frame properties
       this.pack(); // Size frame to fit components
       this.setSize(420, 420); // Set frame size explicitly
       this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Exit on close
       this.setLocationRelativeTo(null); // Center frame on screen

       this.setVisible(true);
    }
}

public class Main {
    public static void main(String[] args) {
        // Create an instance of MyFrame
        MyFrame frame = new MyFrame("Practicing JFrame");

        // Add the label to the content pane
        LabelForFrame labelMade = new LabelForFrame("Hey bro what's up ?");
        frame.getContentPane().add(labelMade.label);
    }
}

