import com.sun.tools.javac.Main;

import java.io.*;
import java.time.LocalDate;
import java.util.Scanner;

public class BMICalculator {
    
   public static void main(String args[]) throws IOException, ClassNotFoundException {
      //use loginGUI when project is done and ready for presentation
      //LoginGUI start = new LoginGUI();

      ModelTwo mod2 = new ModelTwo();
      TrackData day1 = new TrackData(1,180, 70, LocalDate.now());
      //entry 1
      //entry 2
      TrackData day2 = new TrackData(1,220, 71, LocalDate.now().plusDays(1));
      //entry 3
      TrackData day3 = new TrackData(1,240, 72, LocalDate.now().plusDays(2));
      mod2.addData(day1);
      mod2.addData(day2);
      mod2.addData(day3);
//      GuiLogic model = new GuiLogic("Text of Text");
//      GuiController controller = new GuiController(model);
      ListLogic lModel = new ListLogic("List View");
      ListController con = new ListController(mod2.getModelLists(), lModel);







   }
}