public class GuiController {

    private TrackData data;
    private GuiLogic model;

    public GuiController(GuiLogic model, TrackData data){
        this.model = model;
        this.data = data;

        model.form().getDateText().setText(data.getDate().toString());
    }

}
