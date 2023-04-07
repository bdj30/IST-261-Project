import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.time.LocalDate;
import java.util.ArrayList;

public class ListController extends ListModel {
    ListLogic ll;
    //private ModelTwo AListMod = new ModelTwo();
    private ArrayList<TrackData> list;
    private ListModel LMod;



    public ListController(ArrayList<TrackData> lists , ListLogic ll) {
        super(lists);
        list = lists;
        this.ll = ll;
        LMod = new ListModel(lists);
        initComponents();


        ll.form().getSelBut().addActionListener(a ->{
            Object index = this.getValueAt(ll.form().getjTable().getSelectedRow(), ll.form().getjTable().getSelectedColumn());
            //int getFromList = list.get((ll.form().getjTable().getSelectedRow()));
            //System.out.println(getFromList);
            new DetailedGUI(list.get((ll.form().getjTable().getSelectedRow())));
        });
        ll.form().getDelBut().addActionListener(a ->{
            if(list.size() > 0){
                list.remove(ll.form().getjTable().getSelectedRow());

            }else System.out.println("no data on list");
        });

        ll.form().getAddBut().addActionListener(a ->{
            TrackData newtr = new TrackData(0,400,90,LocalDate.now().plusDays(5));
            list.add(newtr);
        });
    }

    public void initComponents(){
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.gridx=0;
        gbc.gridy=0;

        ll.form().setjTable(new JTable(this.getListModel()));
        ll.form().getjTable().getColumnModel().getColumn(0).setPreferredWidth(25);
        ll.form().getjTable().getColumnModel().getColumn(1).setPreferredWidth(50);
        ll.form().getjTable().setFillsViewportHeight(true);
        JScrollPane jsp = new JScrollPane(ll.form().getjTable());
jsp.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);

        //jsp.setOrientation(JScrollBar.VERTICAL);
        jsp.setPreferredSize(new Dimension(350,300));

        ll.form().getPan1().add(jsp,gbc);


        ll.form().getjTable().setVisible(true);
        ll.form().getPan1().revalidate();
    }

    public ListModel getListModel(){
        return LMod;
    }
    @Override
    public String getColumnName(int col){
        return columnNames[col];
    }


}
