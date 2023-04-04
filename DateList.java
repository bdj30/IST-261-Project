import javax.swing.*;
import java.awt.*;

public class DateList {
    private JPanel pan1;
    private JTable jTable;
    private JButton selBut;
    private JButton DelBut;
    private JScrollBar scrollBar1;
    private JButton addBut;
    ListController c;

    public DateList(ListController c){
        this.c=c;
        initComponents();
    }

    public void initComponents(){
        jTable = new JTable(c.getListModel());
//        jTable.getColumnModel().getColumn(0).setPreferredWidth(25);
//        jTable.getColumnModel().getColumn(1).setPreferredWidth(50);
        //detailsButton.addActionListener(new DetailsButtonListener());
        pan1.add(addBut);
        pan1.add(selBut);
        pan1.add(DelBut);
        //if data goes off screen use code below
        //scrollBar1 = new JScrollPane(jTable);
        jTable.setFillsViewportHeight(true);
        //scrollBar1.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        scrollBar1.setOrientation(JScrollBar.VERTICAL);
        scrollBar1.setPreferredSize(new Dimension(350,300));
        pan1.add(scrollBar1);
    }

// public class DetailsButtonListener implements ActionListener{
  //  public void actionPerformed(ActionEvent evt){
    //    int selectedTableRow = jTable.getSelectedRow();
     //   int selectedModelRow = jTable.convertRowIndexToModel(selectedTableRow);
     //   if(selectedModelRow < 0) //if the user does not highlight a row, this will be -1
     //      selectedModelRow = 0; //set the model row to the first element in the list
     //   InstrumentListUI.this.ListController.getInstrumentDetailUI(selectedModelRow);
   }
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
        return selBut;
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

}
