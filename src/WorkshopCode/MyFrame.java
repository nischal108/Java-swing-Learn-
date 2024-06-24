package WorkshopCode;

import LearnOnOwn.LabelForFrame;

import javax.swing.*;

class FrameBuilder extends JFrame{



    FrameBuilder(String name){
        //set the name that comes with the call
        this.setTitle(name);
        this.setSize(400,300);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setIconImage(new ImageIcon("logo.png").getImage());
        this.setVisible(true);
    }
}



public class MyFrame {
    public static void main(String[] args) {
        //creating a frame using the constructor above
        //passing the name of the frame
        FrameBuilder myFrame = new FrameBuilder("Nischal Ko Frame");
    }
}
