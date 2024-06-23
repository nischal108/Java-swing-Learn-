package LoginSystem;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

class LoginPanel extends JPanel {
    JTextField usernameField;
    JPasswordField passwordField;
    JButton loginButton;

    Connection c = DatabaseConnection.connect();
    Statement st = null;

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

        // Add action listener to the login button
        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                loginPerformed(e);
            }
        });
    }

    private void loginPerformed(ActionEvent e) {
        try {
            st = c.createStatement();
            String name = usernameField.getText();
            String password = new String(passwordField.getPassword());  // Correct way to get the password
            String query = "SELECT * FROM login WHERE user_name='" + name + "' AND password='" + password + "'";
            ResultSet rs = st.executeQuery(query);

            if (rs.next()) {
                JOptionPane.showMessageDialog(this, "Login successful!");
            } else {
                JOptionPane.showMessageDialog(this, "Invalid username or password.");
            }

            rs.close();
            st.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "Database error: " + ex.getMessage());
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Error: " + ex.getMessage());
        }
    }
}
