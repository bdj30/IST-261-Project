package MVC;

import javax.swing.*;

public class HelloLogic extends JFrame {
    private HelloView form;

    public HelloLogic() {
        this.form = new HelloView();
        JPanel content = form.getPan1();
        this.setContentPane(content);
        this.pack();
        this.setTitle("Hello World Gui");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public HelloView form() { return form; }
}