package LoginSystem;

import javax.swing.*;

class FrameCreator extends JFrame {
    FrameCreator() {
        // Set the title of the frame
        setTitle("Login System");

        // Set the size of the frame
        setSize(300, 200);

        // Set the default close operation
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Center the frame on the screen
        setLocationRelativeTo(null);

        //don't allow user to resize
        setResizable(true);

        // Create an instance of the LoginPanel and add it to the frame
        add(new LoginPanel(this));


    }
}

public class Frame {
    public static void main(String[] args) {
        FrameCreator frame = new FrameCreator();
        frame.setVisible(true);
    }
}
