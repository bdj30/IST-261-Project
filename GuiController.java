import java.time.LocalDate;

public class GuiController {

    private TrackData data;
    private GuiLogic model;
    private int i = 0;
    private int tempI = 0;
    public GuiController(GuiLogic model){
        this.model = model;

        ModelTwo mod2 = new ModelTwo();

        TrackData day1 = new TrackData(1,180, 70, LocalDate.now());
        //entry 1
        day1.addEntry(day1.getDate(), day1.getBMI());
        //entry 2
        TrackData day2 = new TrackData(1,220, 71, LocalDate.now().plusDays(1));
        day2.addEntry(day1.getDate(), day1.getBMI());
        //entry 3
        TrackData day3 = new TrackData(1,240, 72, LocalDate.now().plusDays(2));
        day3.addEntry(day1.getDate(), day1.getBMI());

        mod2.addData(day1);
        mod2.addData(day2);
        mod2.addData(day3);

        // updates the date text field
        model.form().getDateText().setText(mod2.ModelLists.get(i).getDate().toString());
        //updates the Bmi text field
        model.form().getBmiText().setText(mod2.ModelLists.get(i).getStringBMI());
        
        model.form().getPreBut().addActionListener(e -> {
            //check if previous in arraylist is not null
            tempI = i;
            tempI--;
            i = tempI < 0 ? i : tempI;
            // get and display the previous index or the current if previous is null
            mod2.ModelLists.get(i);
            model.form().getDateText().setText(mod2.ModelLists.get(i).getDate().toString());
            model.form().getBmiText().setText(mod2.ModelLists.get(i).getStringBMI());
        });
        
         model.form().getNextBut().addActionListener(e -> {
             //check if next in arraylist is not null
             tempI = i;
             tempI++;
             i = tempI > mod2.ModelLists.size() -1 ? i : tempI;
             // get and display the next index or the current if next is null
             mod2.ModelLists.get(i);
             model.form().getDateText().setText(mod2.ModelLists.get(i).getDate().toString());
             model.form().getBmiText().setText(mod2.ModelLists.get(i).getStringBMI());

        });

         model.form().getAddBut().addActionListener(e -> {
            // create a new TrackData object with values
            TrackData newEntry = new TrackData(1, 150, 65, LocalDate.now().plusDays(4));
            //add the new entry into the arrayList
            mod2.addData(newEntry);
        });

        model.form().getUpBut().addActionListener(e -> {
            //check and see if the displayed data match the stored data
            if(!mod2.ModelLists.get(i).getDate().toString().equals(model.form().getDateText())
                    || !mod2.ModelLists.get(i).getStringBMI().equals(model.form().getBmiText())){
                //if data does not match then overwrite data
                LocalDate newDate = LocalDate.parse(model.form().getDateText().getText());
                mod2.ModelLists.get(i).setDate(newDate);
                double newBMI = Double.parseDouble(model.form().getBmiText().getText());
                mod2.ModelLists.get(i).setBMI(newBMI);
                // display data
                model.form().getDateText().setText(mod2.ModelLists.get(i).getDate().toString());
                model.form().getBmiText().setText(mod2.ModelLists.get(i).getStringBMI());
            }
    });

        model.form().getDelBut().addActionListener(e -> {
    // remove the current entry from the data list
            mod2.ModelLists.remove(i);
    // check if there are any remaining entries
    if (mod2.ModelLists.size() > 0) {
        // if there are remaining entries, update the GUI form with the first entry
        i = 0;
        model.form().getDateText().setText(mod2.ModelLists.get(i).getDate().toString());
        model.form().getBmiText().setText(mod2.ModelLists.get(i).getStringBMI());
    } else {
        // if there are no remaining entries, clear the GUI form
        model.form().getDateText().setText("No data in List");
        model.form().getBmiText().setText("No data in List");
    }
});

        model.form().getQuitBut().addActionListener(e -> {
    System.exit(0);
});
        
    }

}
