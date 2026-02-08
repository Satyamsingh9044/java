import java.awt.*;
import java.awt.event.*;

public class RegistrationForm {
    public static void main(String[] args) {
       
        Frame frame = new Frame("User Registration Form");

        Label userIdLabel = new Label("User ID:");
        userIdLabel.setBounds(50, 70, 100, 30);
        TextField userIdField = new TextField();
        userIdField.setBounds(180, 70, 200, 30);

        Label emailLabel = new Label("Email:");
        emailLabel.setBounds(50, 120, 100, 30);
        TextField emailField = new TextField();
        emailField.setBounds(180, 120, 200, 30);

        Label passwordLabel = new Label("Password:");
        passwordLabel.setBounds(50, 170, 100, 30);
        TextField passwordField = new TextField();
        passwordField.setEchoChar('*'); // hide password
        passwordField.setBounds(180, 170, 200, 30);

        Label confirmPasswordLabel = new Label("Confirm Password:");
        confirmPasswordLabel.setBounds(50, 220, 120, 30);
        TextField confirmPasswordField = new TextField();
        confirmPasswordField.setEchoChar('*');
        confirmPasswordField.setBounds(180, 220, 200, 30);

        Button registerButton = new Button("Register");
        registerButton.setBounds(150, 280, 100, 40);

        
        Label outputLabel = new Label("");
        outputLabel.setBounds(50, 340, 350, 30);

        registerButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String userId = userIdField.getText();
                String email = emailField.getText();
                String password = passwordField.getText();
                String confirmPassword = confirmPasswordField.getText();

                if (userId.isEmpty() || email.isEmpty() || password.isEmpty() || confirmPassword.isEmpty()) {
                    outputLabel.setText("Please fill all fields!");
                } else if (!password.equals(confirmPassword)) {
                    outputLabel.setText("Passwords do not match!");
                } else {
                    outputLabel.setText("Registration Successful! Welcome, " + userId);
                }
            }
        });

        frame.add(userIdLabel);
        frame.add(userIdField);
        frame.add(emailLabel);
        frame.add(emailField);
        frame.add(passwordLabel);
        frame.add(passwordField);
        frame.add(confirmPasswordLabel);
        frame.add(confirmPasswordField);
        frame.add(registerButton);
        frame.add(outputLabel);

        frame.setSize(450, 450);
        frame.setLayout(null);
        frame.setVisible(true);
    }
}
