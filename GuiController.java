public class GuiController {

    private TrackData data;
    private GuiLogic model;

    public GuiController(GuiLogic model, TrackData data){
        this.model = model;
        this.data = data;

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
    }

}
