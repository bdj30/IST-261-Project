import javax.swing.*;
import java.awt.*;
import java.io.*;
import java.util.ArrayList;

//gui controller for dateList
public class ListController extends ListModel{
    transient ListLogic ll;
    //private ModelTwo AListMod = new ModelTwo();
    private ArrayList<TrackData> list;
    private ListModel LMod;

    public ListController(ArrayList<TrackData> lists , ListLogic ll) throws IOException, ClassNotFoundException {
        super(lists);
        this.ll = ll;
        ArrayList<TrackData> savedData = getSavedData();
        list = savedData != null ? savedData : lists;
        LMod = new ListModel(list);
        initComponents();

        //select button action listener
        ll.form().getSelBut().addActionListener(a -> new DetailedGUI(list.get((ll.form().getjTable().getSelectedRow()))));

        //delete button action listener
        ll.form().getDelBut().addActionListener(a ->{
            if(list.size() > 0){
                list.remove(ll.form().getjTable().getSelectedRow());
           }else System.out.println("no data on list");
            //updates the table
            ((ListModel) ll.form().getjTable().getModel()).fireTableDataChanged();
        });
        //add button action listener
        ll.form().getAddBut().addActionListener(a ->{
            AddUser ad = new AddUser(list);
            list = ad.getList();


        });
        // refresh button action listener
        ll.form().getRefreshButton().addActionListener(a ->{
            ((ListModel) ll.form().getjTable().getModel()).fireTableDataChanged();
        });

        //save and exit button action listener
        ll.form().getSeBut().addActionListener(a ->{
            setSaveData(list);
            System.exit(0);
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


    public ArrayList<TrackData> getSavedData() {
        FileInputStream fis;
        ObjectInputStream in;
        try {
            fis = new FileInputStream("dataEntry.ser");
            in = new ObjectInputStream(fis);
            list = (ArrayList<TrackData>) in.readObject();
            in.close();
            if (!list.isEmpty()) {
                System.out.println("There are users in the user list");
            }
        } catch (FileNotFoundException fne) {
            System.out.println("File was not found, a new one will be created");
        } catch (IOException ex) {
            ex.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return list;
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
    public ListModel getListModel(){
        return LMod;
    }
    @Override
    public String getColumnName(int col){
        return columnNames[col];
    }


}
