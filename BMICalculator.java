import com.sun.tools.javac.Main;
 
import java.util.Scanner;

public class BMICalculator {
    
   public static void main(String args[]) 
   {
      FindBMI fb = new FindBMI(200,1,19, 61);
      Convert con = new Convert(1, 200);
      TestHarness h = new TestHarness();
      h.testInterface();
      //new LoginGUI();
      //new MainGUI();
   }
}

/*
gui for login
keep track of weight
 */