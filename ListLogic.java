import javax.swing.*;
import java.io.Serializable;

public class ListLogic extends JFrame{
    private DateList form;

    public ListLogic(String text){
        this.form = new DateList();
        JPanel content = form.getPan1();
        this.setContentPane(content);
        this.setVisible(true);
        this.setSize(650,400);
        this.setTitle(text);
        this.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
    }
    public DateList form() { return form; }

}
