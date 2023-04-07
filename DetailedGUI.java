import javax.swing.*;

public class DetailedGUI extends JFrame{
    private JPanel Pan1;
    private JTextField dateField;
    private JTextField heightFeild;
    private JTextField bmiField;
    private JTextField weightFeild;
    private JLabel dateT;
    private JLabel bmiT;
    private JLabel iWeightT;
    private JLabel heightT;


    public DetailedGUI(TrackData tr){
        this.setContentPane(getPan1());

        dateField.setText(tr.getDate().toString());
        bmiField.setText(tr.getStringBMI());
        weightFeild.setText(String.valueOf(tr.getWeight()));
        heightFeild.setText(String.valueOf(tr.getHeight()));



        this.setName("Detailed View");
        this.pack();
        this.setVisible(true);
    }

    public JPanel getPan1() {
        return Pan1;
    }

    public void setPan1(JPanel pan1) {
        Pan1 = pan1;
    }

    public JTextField getDateField() {
        return dateField;
    }

    public void setDateField(JTextField dateField) {
        this.dateField = dateField;
    }

    public JTextField getHeightFeild() {
        return heightFeild;
    }

    public void setHeightFeild(JTextField heightFeild) {
        this.heightFeild = heightFeild;
    }

    public JTextField getBmiField() {
        return bmiField;
    }

    public void setBmiField(JTextField bmiField) {
        this.bmiField = bmiField;
    }

    public JTextField getWeightFeild() {
        return weightFeild;
    }

    public void setWeightFeild(JTextField weightFeild) {
        this.weightFeild = weightFeild;
    }

    public JLabel getDateT() {
        return dateT;
    }

    public void setDateT(JLabel dateT) {
        this.dateT = dateT;
    }

    public JLabel getBmiT() {
        return bmiT;
    }

    public void setBmiT(JLabel bmiT) {
        this.bmiT = bmiT;
    }

    public JLabel getiWeightT() {
        return iWeightT;
    }

    public void setiWeightT(JLabel iWeightT) {
        this.iWeightT = iWeightT;
    }

    public JLabel getHeightT() {
        return heightT;
    }

    public void setHeightT(JLabel heightT) {
        this.heightT = heightT;
    }
}
