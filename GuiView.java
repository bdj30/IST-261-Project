import javax.swing.*;

public class GuiView {
    private JButton UpBut;
    private JButton NextBut;
    private JButton DelBut;
    private JButton PreBut;
    private JButton QuitBut;
    private JButton AddBut;
    private JLabel DateLabel;
    private JLabel BmiLabel;
    private JPanel Pan1;
    private JTextField DateText;
    private JTextField BmiText;


    public JButton getUpBut() {
        return UpBut;
    }

    public void setUpBut(JButton upBut) {
        UpBut = upBut;
    }

    public JButton getNextBut() {
        return NextBut;
    }

    public void setNextBut(JButton nextBut) {
        NextBut = nextBut;
    }

    public JButton getDelBut() {
        return DelBut;
    }

    public void setDelBut(JButton delBut) {
        DelBut = delBut;
    }

    public JButton getPreBut() {
        return PreBut;
    }

    public void setPreBut(JButton preBut) {
        PreBut = preBut;
    }

    public JButton getQuitBut() {
        return QuitBut;
    }

    public void setQuitBut(JButton quitBut) {
        QuitBut = quitBut;
    }

    public JButton getAddBut() {
        return AddBut;
    }

    public void setAddBut(JButton addBut) {
        AddBut = addBut;
    }

    public JLabel getDateLabel() {
        return DateLabel;
    }

    public void setDateLabel(JLabel dateLabel) {
        DateLabel = dateLabel;
    }

    public JLabel getBmiLabel() {
        return BmiLabel;
    }

    public void setBmiLabel(JLabel bmiLabel) {
        BmiLabel = bmiLabel;
    }

    public JTextField getDateText() {
        return DateText;
    }

    public void setDateText(JTextField dateText) {
        DateText = dateText;
    }

    public JTextField getBmiText() {
        return BmiText;
    }

    public void setBmiText(JTextField bmiText) {
        BmiText = bmiText;
    }

    public JPanel getPan1() {
        return Pan1;
    }

    public void setPan1(JPanel pan1) {
        Pan1 = pan1;
    }
}


