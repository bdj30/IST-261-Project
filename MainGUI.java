import javax.swing.*;
import java.awt.*;

public class MainGUI {
    public MainGUI(){
        JFrame frame = new JFrame();
        frame.setLayout(new GridLayout(5,1));

        JPanel pan1 = new JPanel();
        JPanel pan2 = new JPanel();
        JPanel pan3 = new JPanel();
        JPanel pan4 = new JPanel();
        JPanel pan5 = new JPanel();

        JLabel tHeight = new JLabel("Height");
        JTextField fHeight = new JTextField(2);



        pan2.add(tHeight);
        pan2.add(fHeight);




        frame.add(pan1);
        frame.add(pan2);
        frame.add(pan3);
        frame.add(pan4);
        frame.add(pan5);

        frame.setSize(720,720);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
