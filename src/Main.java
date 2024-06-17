import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        // a GUI windows to add components to
        JFrame frame = new JFrame(); //creating an instance of frame

        //make frame visible
        frame.setVisible(true);

        //setting size of frame
        frame.setSize(420,420);  //sets x dimension adn y dimension

        //sets title of frame
        frame.setTitle("Practicing JFrame ");


        //close program and exit if the cross button is pressed
        //if done this user can never close the tab which is annoying
//        frame.setDefaultCloseOperation(frame.DO_NOTHING_ON_CLOSE);
        frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);

        //preventing resizable frame
//        frame.setResizable(false);

        //setting image icon like logo in the frame
        ImageIcon image = new ImageIcon("logo.png");

        //setting image icon of frame
        frame.setIconImage(image.getImage());
    }
}