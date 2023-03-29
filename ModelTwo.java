import java.util.ArrayList;

public class ModelTwo {
    ArrayList<TrackData> ModelLists = new ArrayList<>();

    public void addData(TrackData data){
        ModelLists.add(data);

    }
    @Override
    public String toString() {
        return "ModelTwo{" +
                "ModelLists=" + ModelLists +
                '}';
    }

}
