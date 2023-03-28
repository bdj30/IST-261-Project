package MVC;

public class WrapperModel {

    private String wrappedString;

    public WrapperModel(String wrappedString) {
        this.wrappedString = wrappedString;
    }

    public static void main(String[] args) {
        WrapperModel model = new WrapperModel("Text of Text");
        HelloLogic view = new HelloLogic();
        HelloController controller = new HelloController(model, view);
        view.setVisible(true);
    }

    public String getText() {return wrappedString;}

    public void setText(String text) {wrappedString = text;}

    public String reverseString() { return new StringBuilder(wrappedString).reverse().toString();}



}
