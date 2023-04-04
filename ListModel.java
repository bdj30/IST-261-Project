import javax.swing.table.AbstractTableModel;
import java.util.ArrayList;

public class ListModel extends AbstractTableModel {
    protected String[] columnNames = {"Type", "Manufacturer", "Model"};
    private ArrayList<TrackData> bmiList;

    public ListModel(ArrayList<TrackData> list){
        bmiList = list;

    }


    @Override
    public int getRowCount() {
        return bmiList.size();
    }

    @Override
    public int getColumnCount() {
        return 0;
    }

    @Override
    public Object getValueAt(int row, int col) {
        switch(col){
            case 0: return (Object) bmiList.get(row).getDate();
            case 1: return (Object) bmiList.get(row).getBMI();
            default: return null;
        }
    }
}
