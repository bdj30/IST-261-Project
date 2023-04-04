import java.util.ArrayList;

public class ModelTwo {
    ArrayList<TrackData> ModelLists = new ArrayList<>();

    public void addData(TrackData data){
        ModelLists.add(data);

    }

    public ArrayList<TrackData> getModelLists() {
        return ModelLists;
    }

    public void setModelLists(ArrayList<TrackData> modelLists) {
        ModelLists = modelLists;
    }
    @Override
    public String toString() {
        return "ModelTwo{" +
                "ModelLists=" + ModelLists +
                '}';
    }

}
