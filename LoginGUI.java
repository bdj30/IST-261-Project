import javax.swing.*;
import java.awt.*;
import java.util.HashMap;

public class LoginGUI {
    private HashMap<String,String> users = new HashMap<>();
    public LoginGUI(){
        JFrame frame = new JFrame("Login");
        frame.setLayout(new GridLayout(3,1));

        //panels
        JPanel pan1 = new JPanel();
        JPanel pan2 = new JPanel();
        JPanel pan3 = new JPanel();


        // label and textfields
        //for login
        JLabel but = new JLabel("Username");
        JLabel but2 = new JLabel("Password");
        JTextField tUser = new JTextField(10);
        JTextField tPass = new JTextField(10);
        //for other buttons
        JButton loginBut = new JButton("Login");
        JButton resetPw = new JButton("cant Login");
        JButton creatAcc = new JButton("Create User");

        //adding
        pan1.add(but);
        pan1.add(tUser);
        pan1.add(but2);
        pan1.add(tPass);

        pan2.add(loginBut);

        pan3.add(resetPw);
        pan3.add(creatAcc);

        frame.add(pan1);
        frame.add(pan2);
        frame.add(pan3);



        //events
        loginBut.addActionListener(e ->{
            if (e.getSource() == loginBut && !tUser.getText().equals("")&& !tPass.getText().equals("")){
                new MainGUI();
                frame.setVisible(false);
            }
        });

        frame.setSize(200,250);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}