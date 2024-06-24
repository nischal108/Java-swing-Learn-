package LearnOnOwn;

import javax.swing.*;
import java.awt.*;

public class LabelForFrame {
    JLabel label;

    LabelForFrame(String receivedLabel){
        label = new JLabel();  //creating label
        label.setText(receivedLabel); //set text for label
        label.setOpaque(true); // set opaque to true to show background color
        label.setBackground(Color.GREEN); //set background color
        label.setForeground(Color.BLACK); //set text color
        label.setHorizontalAlignment(SwingConstants.CENTER); // align text to the center
        label.setVerticalAlignment(SwingConstants.CENTER); // align text to the center
    }
}
