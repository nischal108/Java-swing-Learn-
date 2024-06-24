package LoginSystem;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class RegisterForm extends JPanel {
    private JTextField rollNoField, nameField, addressField, phoneField, emailField;
    private JRadioButton maleRadio, femaleRadio;
    private JButton submitButton;

    private Connection connection;

    public RegisterForm() {
        this.connection = DatabaseConnection.connect(); // Assign database connection to instance variable

        // Initialize components
        rollNoField = new JTextField(20);
        nameField = new JTextField(20);
        addressField = new JTextField(20);
        phoneField = new JTextField(20);
        emailField = new JTextField(20);

        maleRadio = new JRadioButton("Male");
        femaleRadio = new JRadioButton("Female");
        ButtonGroup genderGroup = new ButtonGroup();
        genderGroup.add(maleRadio);
        genderGroup.add(femaleRadio);

        submitButton = new JButton("Submit");

        // Configure layout
        setLayout(new GridLayout(7, 2, 10, 10)); // 7 rows, 2 columns, gaps of 10

        // Add components to the panel
        add(new JLabel("Roll No:"));
        add(rollNoField);
        add(new JLabel("Name:"));
        add(nameField);
        add(new JLabel("Address:"));
        add(addressField);
        add(new JLabel("Gender:"));
        JPanel genderPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        genderPanel.add(maleRadio);
        genderPanel.add(femaleRadio);
        add(genderPanel);
        add(new JLabel("Phone No:"));
        add(phoneField);
        add(new JLabel("Email:"));
        add(emailField);
        add(new JPanel()); // Placeholder for layout purposes
        add(submitButton);

        // Add action listener to the submit button
        submitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                submitPerformed();
            }
        });
    }

    private void submitPerformed() {
        String rollNo = rollNoField.getText();
        String name = nameField.getText();
        String address = addressField.getText();
        String gender = maleRadio.isSelected() ? "Male" : "Female";
        String phone = phoneField.getText();
        String email = emailField.getText();

        try {
            // Insert data into the database
            String query = "INSERT INTO students (roll_no, name, address, gender, phone, email) VALUES (?, ?, ?, ?, ?, ?)";
            PreparedStatement ps = connection.prepareStatement(query);
            ps.setString(1, rollNo);
            ps.setString(2, name);
            ps.setString(3, address);
            ps.setString(4, gender);
            ps.setString(5, phone);
            ps.setString(6, email);
            clearFields();

            int rowsInserted = ps.executeUpdate();
            if (rowsInserted > 0) {
                JOptionPane.showMessageDialog(this, "Student registered successfully!");
            } else {
                JOptionPane.showMessageDialog(this, "Failed to register the student.");
            }

            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, "Database error: " + ex.getMessage());
        }
    }

    public void clearFields() {
        rollNoField.setText("");
        nameField.setText("");
        addressField.setText("");
        maleRadio.setSelected(false);
        femaleRadio.setSelected(false);
        phoneField.setText("");
        emailField.setText("");
    }
}
