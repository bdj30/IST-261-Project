import javax.swing.*;

public class ListLogic extends JFrame{
    private DateList form;

    public ListLogic(String text){
        this.form = new DateList();
        JPanel content = form.getPan1();
        this.setContentPane(content);
        this.setVisible(true);
        this.setSize(500,400);
        this.setTitle(text);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public DateList form() { return form; }

}
