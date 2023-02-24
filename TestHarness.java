import java.util.ArrayList;

public class TestHarness {
    public TestHarness() {
        // Test the login class
        Login login = new Login("uName", "pWord");

        if (login != null) {

            System.out.println("Login successful");
            System.out.println("Login info: " + login + "\n----------------------------");
        }

        // Test the user class
        User user = new User("Name", 10, 200, 72,"User", "1234");

        if (user != null) {

            System.out.println("New user successfully created");
            System.out.println("User info: " + user + "\n----------------------------");
        }

        // Test the convert class
        //for now 0 = convert to kg, 1 = convert to lbs
        Convert convert = new Convert(1, 200);

        if (convert != null) {

            System.out.println("New conversion successful");
            System.out.println("Conversion: " + convert+ "\n----------------------------");
        }
    }
    
    public void testClassHierarchy() {
        ArrayList<Login> trackList = new ArrayList<>();
        ArrayList<Convert> youSir = new ArrayList<>();

        Login day = new Login("User","Pass");
        Convert uName = new Convert(1, 200);
        TrackData tr = new TrackData(1, 200, 20, "Feb", 2023);
        User u = new User("Me", 19, 200, 62, "User", "Pass");
        trackList.add(day);
        youSir.add(uName);

        for(Login e : trackList) {
            System.out.println(e);
        }
        for(Convert e : youSir) {
            System.out.println(e);
        }
        System.out.println("-------------------" + "\n" + "Original classes:");

        //original methods
        uName.lbsToKg();
        System.out.println(uName.getConvertedWeight());
        day.setpWord("bob");
        System.out.println(day.getpWord() +"\n"+ "------------\n" + "OverWritten classes");

        //Overwritten methods
        tr.convertion(1);
        System.out.println(tr.getConvertedWeight());
        u.setpWord("Bob");
        System.out.println(u.getpWord());
    }
}
