import java.io.*;
import java.util.ArrayList;

public class SerialListSe{
    private ArrayList<TrackData> fullData;

    public SerialListSe(ArrayList<TrackData> list) {
        fullData = list;
    }

    public ArrayList<TrackData> getSavedData() throws IOException, ClassNotFoundException {
        FileInputStream fis;
        ObjectInputStream in;
        try {
            fis = new FileInputStream("dataEntry.ser");
            in = new ObjectInputStream(fis);
            fullData = (ArrayList<TrackData>) in.readObject();
            in.close();
            if (!fullData.isEmpty()) {
                System.out.println("There are users in the user list");
            }
        } catch (FileNotFoundException fne) {
            System.out.println("File was not found, a new one will be created");
        } catch (IOException ex) {
            ex.printStackTrace();
        } catch (ClassNotFoundException ex) {
            ex.printStackTrace();
        }
        return fullData;
    }
    public void setSaveData(ArrayList<TrackData> doneList){
        FileOutputStream fileOut;
        ObjectOutputStream out;
        try {
            fileOut = new FileOutputStream("dataEntry.ser");
            out = new ObjectOutputStream(fileOut);
            out.writeObject(doneList);
            out.close();
            fileOut.close();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    public ArrayList<TrackData> getFullData() {
        return fullData;
    }

    public void setFullData(ArrayList<TrackData> fullData) {
        this.fullData = fullData;
    }
}