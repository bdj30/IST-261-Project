import com.sun.tools.javac.Main;

import java.time.LocalDate;
import java.util.Scanner;

public class BMICalculator {
    
   public static void main(String args[]) 
   {
      ModelTwo mod2 = new ModelTwo();

      TrackData day1 = new TrackData(1,180, 70, LocalDate.now());
      //entry 1
      day1.addEntry(day1.getDate(), day1.getBMI());
      //entry 2
      TrackData day2 = new TrackData(1,220, 71, LocalDate.now().plusDays(1));
      day2.addEntry(day1.getDate(), day1.getBMI());
      //entry 3
      TrackData day3 = new TrackData(1,240, 72, LocalDate.now().plusDays(2));
      day3.addEntry(day1.getDate(), day1.getBMI());

      mod2.addData(day1);
      mod2.addData(day2);
      mod2.addData(day3);



//      GuiLogic model = new GuiLogic("Text of Text");
//      GuiController controller = new GuiController(model);



      ListLogic lModel = new ListLogic("List View");
      ListController c = new ListController(mod2.getModelLists(), lModel);

   }
}