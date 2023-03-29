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
        
    }

}
