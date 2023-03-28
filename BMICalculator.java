import MVC.HelloController;
import MVC.HelloLogic;
import MVC.WrapperModel;
import com.sun.tools.javac.Main;

import java.time.LocalDate;
import java.util.Scanner;

public class BMICalculator {
    
   public static void main(String args[]) 
   {

      TrackData day1 = new TrackData(1,200, LocalDate.now());
      day1.addEntry(day1.getDate(), day1.getBMI());
      GuiLogic model = new GuiLogic("Text of Text");
      GuiController controller = new GuiController(model, day1);

   }
}