import javax.swing.table.AbstractTableModel;
import java.util.ArrayList;

public class ListModel extends AbstractTableModel {
    protected String[] columnNames = {"Date","BMI"};
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
        return columnNames.length;
    }

    @Override
    public Object getValueAt(int row, int col) {
        switch(col){
            case 0: return bmiList.get(row).getDate();
            case 1: return bmiList.get(row).getBMI();
            default: return null;
        }
    }

    public String[] getColumnNames() {
        return columnNames;
    }

    public void setColumnNames(String[] columnNames) {
        this.columnNames = columnNames;
    }

    public ArrayList<TrackData> getBmiList() {
        return bmiList;
    }

    public void setBmiList(ArrayList<TrackData> bmiList) {
        this.bmiList = bmiList;
    }
}
