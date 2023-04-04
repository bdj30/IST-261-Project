import javax.swing.*;

public class ListLogic extends JFrame{
    private DateList form;
    private ListController c;

    public ListLogic(String text){
        this.form = new DateList(c);
        this.c=c;
        JPanel content = form.getPan1();
        this.setContentPane(content);
        this.setVisible(true);
        this.pack();
        this.setTitle(text);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public DateList form() { return form; }

    public ListController control() {return c;}
}
