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
    
    public testClassHierarchy() {
        
}
