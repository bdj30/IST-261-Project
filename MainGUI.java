import javax.swing.*;
import java.awt.*;

public class MainGUI {
    public MainGUI(){
        JFrame frame = new JFrame("BMI Frame");
        frame.setLayout(new GridLayout(3,1,10,10));

        JPanel pan = new JPanel();
        pan.setLayout(new FlowLayout());
        JButton but = new JButton("hi");
        JButton but2 = new JButton("Hi again");

        pan.add(but);
        pan.add(but2);

        // getting user info
        //  make labels for name, age, weight, height

        //labels
        JLabel name = new JLabel("Enter Name:");
        JLabel age = new JLabel("Enter age: ");
        JLabel weight = new JLabel("Enter weight: ");
        JLabel height = new JLabel("Enter height: ");

        //text feilds
        JTextField tName = new JTextField();
        JTextField tAge = new JTextField();
        JTextField tWeight = new JTextField();
        JTextField tHeight = new JTextField();








        frame.add(pan);
        frame.setSize(500,500);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
