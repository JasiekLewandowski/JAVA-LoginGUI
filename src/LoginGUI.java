import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginGUI implements ActionListener {
    private final String userName = "admin";
    private final String password = "admin";

    private static JFrame frame;
    private static JPanel panel;
    private static JPanel messagePanel;
    private static JLabel userLabel;
    private static JLabel passwordLabel;
    private static JTextField userText;
    private static JPasswordField passwordText;
    private static JButton button;

    public static void main(String[] args) {
        frame = new JFrame("Login");
        frame.setSize(300,150);

        panel = new JPanel();
        frame.add(panel, BorderLayout.CENTER);

        panel.setLayout(null);

        userLabel = new JLabel("User:");
        userLabel.setBounds(10,20,80,25);
        panel.add(userLabel);

        userText = new JTextField(20);
        userText.setBounds(100,20,165,25);
        panel.add(userText);

        passwordLabel = new JLabel("Password:");
        passwordLabel.setBounds(10,50,80,25);
        panel.add(passwordLabel);

        passwordText = new JPasswordField(20);
        passwordText.setBounds(100,50,165,25);
        panel.add(passwordText);

        button = new JButton("Login");
        button.setBounds(10,80,80,25);
        button.addActionListener(new LoginGUI());
        panel.add(button);
        
        //frame.pack();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
            String userName = userText.getText();
            String password = passwordText.getText();

            messagePanel = new JPanel();
            frame.add(messagePanel);
            JLabel messageLabel = new JLabel("");
            messagePanel.add(messageLabel);
            panel.setVisible(false);
            messagePanel.setVisible(true);
            if (userName.equals(this.userName) && password.equals(this.password)){
                messageLabel.setText("Login succesfull!");
            } else {
                messageLabel.setText("Login failed");
            }
    }
}
