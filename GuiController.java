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
    }

}
