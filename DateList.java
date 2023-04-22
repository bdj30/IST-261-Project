import javax.swing.*;

public class DateList {
    private JPanel pan1;
    private JTable jTable;
    private JButton selBut;
    private JButton DelBut;
    private JScrollBar scrollBar1;
    private JButton addBut;
    private JButton refreshButton;
    private JButton seBut;

    public DateList(){
    }


    public JButton getSelBut() {
        return selBut;
    }

    public void setSelBut(JButton selBut) {
        this.selBut = selBut;
    }

    public JScrollBar getScrollBar1() {
        return scrollBar1;
    }

    public void setScrollBar1(JScrollBar scrollBar1) {
        this.scrollBar1 = scrollBar1;
    }

    public JPanel getPan1() {
        return pan1;
    }

    public void setPan1(JPanel pan1) {
        this.pan1 = pan1;
    }

    public JTable getjTable() {
        return jTable;
    }

    public void setjTable(JTable jTable) {
        this.jTable = jTable;
    }

    public JButton getAddBut() {
        return addBut;
    }

    public void setAddBut(JButton addBut) {
        this.selBut = addBut;
    }

    public JButton getDelBut() {
        return DelBut;
    }

    public void setDelBut(JButton delBut) {
        DelBut = delBut;
    }

    public JButton getRefreshButton() {
        return refreshButton;
    }

    public void setRefreshButton(JButton refreshButton) {
        this.refreshButton = refreshButton;
    }

    public JButton getSeBut() {
        return seBut;
    }

    public void setSeBut(JButton seBut) {
        this.seBut = seBut;
    }
}
