package LoginSystem;

import javax.swing.*;
import java.awt.*;

class LoginPanel extends JPanel {
    JTextField usernameField;
    JPasswordField passwordField;
    JButton loginButton;

    LoginPanel() {
        // Set the layout of the panel to FlowLayout
        setLayout(new FlowLayout());

        // Create components
        JLabel usernameLabel = new JLabel("Username:");
        JLabel passwordLabel = new JLabel("Password:");
        usernameField = new JTextField(15);
        passwordField = new JPasswordField(15);


        loginButton = new JButton("Login");
        loginButton.setBackground(new Color(59, 89, 182));
        loginButton.setForeground(Color.WHITE);

        // Add components to the panel
        add(usernameLabel);
        add(usernameField);
        add(passwordLabel);
        add(passwordField);
        add(loginButton);
    }
}
