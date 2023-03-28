import MVC.HelloView;

import javax.swing.*;

public class GuiLogic extends JFrame{
    private GuiView form;

    public GuiLogic(String text){
        this.form = new GuiView();
        JPanel content = form.getPan1();
        this.setContentPane(content);
        this.setVisible(true);
        this.pack();
        this.setTitle(text);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public GuiView form() { return form; }
}
