import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
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

    }

    public void initComponents(){
        ll.form().setjTable(new JTable(this.getListModel()));
        ll.form().getjTable().getColumnModel(). getColumn(0).setPreferredWidth(25);
        ll.form().getjTable().getColumnModel(). getColumn(1).setPreferredWidth(50);
        ll.form().getjTable().setFillsViewportHeight(true);
        ll.form().getScrollBar1().setOrientation(JScrollBar.VERTICAL);
        ll.form().getScrollBar1().setPreferredSize(new Dimension(350,300));
        ll.form().getjTable().setVisible(true);
    }

    public ListModel getListModel(){
        return LMod;
    }
    @Override
    public String getColumnName(int col){
        return columnNames[col];
    }


}
