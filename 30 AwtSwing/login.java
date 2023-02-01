import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;

public class login {

    public static void main(String[] args) {

        IDandPasswords idandPasswords = new IDandPasswords();

        LoginPage loginPage = new LoginPage(idandPasswords.getLoginInfo());
    }
}

class IDandPasswords {

    HashMap<String, String> logininfo = new HashMap<String, String>();

    IDandPasswords() {

        logininfo.put("Bro", "pizza");

        logininfo.put("Brometheus", "PASSWORD");

        logininfo.put("BroCode", "abc123");

    }

    public HashMap getLoginInfo() {

        return logininfo;

    }

}
// **************************************************

class LoginPage implements ActionListener {

    JFrame frame = new JFrame();

    JButton loginButton = new JButton("Login");

    JButton resetButton = new JButton("Reset");

    JTextField userIDField = new JTextField();

    JPasswordField userPasswordField = new JPasswordField();

    JLabel userIDLabel = new JLabel("userID:");

    JLabel userPasswordLabel = new JLabel("password:");

    JLabel messageLabel = new JLabel();

    HashMap<String, String> logininfo = new HashMap<String, String>();

    LoginPage(HashMap<String, String> loginInfoOriginal) {

        logininfo = loginInfoOriginal;

        userIDLabel.setBounds(50, 100, 75, 25);

        userPasswordLabel.setBounds(50, 150, 75, 25);

        messageLabel.setBounds(125, 250, 250, 35);

        messageLabel.setFont(new Font(null, Font.ITALIC, 25));

        userIDField.setBounds(125, 100, 200, 25);

        userPasswordField.setBounds(125, 150, 200, 25);

        loginButton.setBounds(125, 200, 100, 25);

        loginButton.setFocusable(false);

        loginButton.addActionListener(this);

        resetButton.setBounds(225, 200, 100, 25);

        resetButton.setFocusable(false);

        resetButton.addActionListener(this);

        frame.add(userIDLabel);

        frame.add(userPasswordLabel);

        frame.add(messageLabel);

        frame.add(userIDField);

        frame.add(userPasswordField);

        frame.add(loginButton);

        frame.add(resetButton);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.setSize(420, 420);

        frame.setLayout(null);

        frame.setVisible(true);

    }

    @Override

    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == resetButton) {

            userIDField.setText("");

            userPasswordField.setText("");

        }

        if (e.getSource() == loginButton) {

            String userID = userIDField.getText();

            String password = String.valueOf(userPasswordField.getPassword());

            if (logininfo.containsKey(userID)) {

                if (logininfo.get(userID).equals(password)) {

                    messageLabel.setForeground(Color.green);

                    messageLabel.setText("Login successful");

                    frame.dispose();

                    WelcomePage welcomePage = new WelcomePage(userID);

                }

                else {

                    messageLabel.setForeground(Color.red);

                    messageLabel.setText("Wrong password");

                }

            }

            else {

                messageLabel.setForeground(Color.red);

                messageLabel.setText("username not found");

            }

        }

    }

}
// **************************************************

class WelcomePage {

    JFrame frame = new JFrame();

    JLabel welcomeLabel = new JLabel("Hello!");

    WelcomePage(String userID) {

        welcomeLabel.setBounds(0, 0, 200, 35);

        welcomeLabel.setFont(new Font(null, Font.PLAIN, 25));

        welcomeLabel.setText("Hello " + userID);

        frame.add(welcomeLabel);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.setSize(420, 420);

        frame.setLayout(null);

        frame.setVisible(true);

    }

}