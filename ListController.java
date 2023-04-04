import javax.swing.*;
import java.util.ArrayList;

public class ListController extends ListModel {
    ListLogic ll;
    private ModelTwo AListMod = new ModelTwo();
    private ListModel LMod = new ListModel (AListMod.getModelLists());


    public ListController(ArrayList<TrackData> list , ListLogic ll) {
        super(list);
        this.ll = ll;

    }

    public ListModel getListModel(){
        return LMod;
    }
    @Override
    public String getColumnName(int col){
        return columnNames[col];
    }


}
