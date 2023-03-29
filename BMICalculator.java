import com.sun.tools.javac.Main;

import java.time.LocalDate;
import java.util.Scanner;

public class BMICalculator {
    
   public static void main(String args[]) 
   {
      GuiLogic model = new GuiLogic("Text of Text");
      GuiController controller = new GuiController(model);

   }
}