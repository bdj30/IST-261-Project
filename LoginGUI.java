import javax.swing.*;
import java.awt.*;
import java.io.IOException;
import java.time.LocalDate;
import java.util.HashMap;

public class LoginGUI{

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
                 //gui for when finalizing project
                ModelTwo mod2 = new ModelTwo();
                TrackData day1 = new TrackData(1,180, 70, LocalDate.now());
                //entry 1
                //entry 2
                TrackData day2 = new TrackData(1,220, 71, LocalDate.now().plusDays(1));
                //entry 3
                TrackData day3 = new TrackData(1,240, 72, LocalDate.now().plusDays(2));
                mod2.addData(day1);
                mod2.addData(day2);
                mod2.addData(day3);
//      GuiLogic model = new GuiLogic("Text of Text");
//      GuiController controller = new GuiController(model);
                ListLogic lModel = new ListLogic("List View");
                try {
                    ListController con = new ListController(mod2.getModelLists(), lModel);
                } catch (IOException ex) {
                    throw new RuntimeException(ex);
                } catch (ClassNotFoundException ex) {
                    throw new RuntimeException(ex);
                }
                frame.setVisible(false);
            }
        });

        resetPw.addActionListener(a ->{
            ModelTwo mod2 = new ModelTwo();
            TrackData day1 = new TrackData(1,180, 70, LocalDate.now());
            //entry 1
            //entry 2
            TrackData day2 = new TrackData(1,220, 71, LocalDate.now().plusDays(1));
            //entry 3
            TrackData day3 = new TrackData(1,240, 72, LocalDate.now().plusDays(2));
            mod2.addData(day1);
            mod2.addData(day2);
            mod2.addData(day3);
//      GuiLogic model = new GuiLogic("Text of Text");
//      GuiController controller = new GuiController(model);
            ListLogic lModel = new ListLogic("List View");
            try {
                ListController con = new ListController(mod2.getModelLists(), lModel);
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            } catch (ClassNotFoundException ex) {
                throw new RuntimeException(ex);
            }
            frame.setVisible(false);
        });

        creatAcc.addActionListener(a ->{
            ModelTwo mod2 = new ModelTwo();
            TrackData day1 = new TrackData(1,180, 70, LocalDate.now());
            //entry 1
            //entry 2
            TrackData day2 = new TrackData(1,220, 71, LocalDate.now().plusDays(1));
            //entry 3
            TrackData day3 = new TrackData(1,240, 72, LocalDate.now().plusDays(2));
            mod2.addData(day1);
            mod2.addData(day2);
            mod2.addData(day3);
//      GuiLogic model = new GuiLogic("Text of Text");
//      GuiController controller = new GuiController(model);
            ListLogic lModel = new ListLogic("List View");
            try {
                ListController con = new ListController(mod2.getModelLists(), lModel);
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            } catch (ClassNotFoundException ex) {
                throw new RuntimeException(ex);
            }
            frame.setVisible(false);
        });

        frame.setSize(200,250);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
}