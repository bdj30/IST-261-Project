import javax.swing.*;
import java.time.LocalDate;
import java.util.ArrayList;

public class AddUser extends JFrame{
    private JTextField dateText;
    private JLabel DateF;
    private JLabel heightF;
    private JTextField heightText;
    private JTextField weightText;
    private JLabel weightF;
    private JLabel optionF;
    private JRadioButton kgBut;
    private JRadioButton lbsBut;
    private JButton addBut;
    private JPanel pan1;
    private JButton doneBut;
    private ButtonGroup bg1 = new ButtonGroup();
    private ArrayList<TrackData> dataLists;
    private int option;

    public AddUser(ArrayList<TrackData> list){
        dataLists = list;
        bg1.add(kgBut);
        bg1.add(lbsBut);
        addBut.addActionListener(a ->{
            if (a.getSource() == addBut && !dateText.equals("") && !heightText.equals("") && !weightText.equals("") && bg1.getSelection() != null){
                option = bg1.getSelection() == lbsBut ? 1 : 0;
                TrackData newTD = new TrackData(option, Double.parseDouble(weightText.getText()), Double.parseDouble(heightText.getText()), LocalDate.parse(dateText.getText()));
                dataLists.add(newTD);

            }else System.out.println("all data entries must be filled in");
        });

        doneBut.addActionListener(a ->{
            this.setVisible(false);
        });





        this.setName("Add a data entry");
        this.setContentPane(pan1);
        this.pack();
        this.setVisible(true);
    }

    public ArrayList<TrackData> getList(){
        return dataLists;
    }

}
