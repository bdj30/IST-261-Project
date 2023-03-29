public class GuiController {

    private TrackData data;
    private GuiLogic model;
    private int currentEntryIndex;
    
    public GuiController(GuiLogic model, TrackData data){
        this.model = model;
        this.data = data;
        this.currentEntryIndex = 0;

        // updates the date text field
        model.form().getDateText().setText(data.getDate().toString());
        //updates the Bmi text field
        model.form().getBmiText().setText(data.getStringBMI());
        
        model.form().getPreviousButton().addActionListener(e -> {
            TrackData lastEntry = data.getLastEntry();
            if (lastEntry != null) {
                // update the data and GUI form with the last entry
                data = lastEntry;
                model.form().getDateText().setText(data.getDate().toString());
                model.form().getBmiText().setText(data.getStringBMI());
            } else {
                JOptionPane.showMessageDialog(model.form(), "No previous entry available");
            }
        });
        
         model.form().getNextButton().addActionListener(e -> {
            TrackData nextEntry = data.getEntry(currentEntryIndex + 1);
            if (nextEntry != null) {
                // update the data and GUI form with the next entry
                data = nextEntry;
                currentEntryIndex++;
                model.form().getDateText().setText(data.getDate().toString());
                model.form().getBmiText().setText(data.getStringBMI());
            } else {
                JOptionPane.showMessageDialog(model.form(), "No next entry available");
            }
        });
        
         model.form().getAddButton().addActionListener(e -> {
            // create a new TrackData object with default values
            TrackData newEntry = new TrackData();
            data.addEntry(newEntry);
            currentEntryIndex = data.size() - 1;
            // update the GUI form with the new entry
            model.form().getDateText().setText(newEntry.getDate().toString());
            model.form().getBmiText().setText(newEntry.getStringBMI());
        });
        
        model.form().getUpdateButton().addActionListener(e -> {
        // get the current entry and update its values
        TrackData currentEntry = data.getEntry(currentEntryIndex);
        currentEntry.setDate(model.form().getDateText().getText());
        currentEntry.setWeight(model.form().getWeightText().getText());
        currentEntry.setHeight(model.form().getHeightText().getText());
        // recalculate and update the BMI value
        currentEntry.calculateBMI();
        model.form().getBmiText().setText(currentEntry.getStringBMI());
    });
        
        model.form().getDeleteButton().addActionListener(e -> {
    // remove the current entry from the data list
    data.removeEntry(currentEntryIndex);
    // check if there are any remaining entries
    if (data.size() > 0) {
        // if there are remaining entries, update the GUI form with the first entry
        currentEntryIndex = 0;
        TrackData firstEntry = data.getEntry(currentEntryIndex);
        model.form().getDateText().setText(firstEntry.getDate().toString());
        model.form().getWeightText().setText(firstEntry.getWeight());
        model.form().getHeightText().setText(firstEntry.getHeight());
        firstEntry.calculateBMI();
        model.form().getBmiText().setText(firstEntry.getStringBMI());
    } else {
        // if there are no remaining entries, clear the GUI form
        model.form().getDateText().setText("");
        model.form().getWeightText().setText("");
        model.form().getHeightText().setText("");
        model.form().getBmiText().setText("");
    }
});
      
        model.form().getQuitButton().addActionListener(e -> {
    System.exit(0);
});
        
    }

}
