import java.time.LocalDate;
import java.util.ArrayList;

public class TestHarness {
//    public TestHarness() {
//        // Test the login class
//        Login login = new Login("uName", "pWord");
//
//        if (login != null) {
//
//            System.out.println("Login successful");
//            System.out.println("Login info: " + login + "\n----------------------------");
//        }
//
//        // Test the user class
//        User user = new User("Name", 10, 200, 72,"User", "1234");
//
//        if (user != null) {
//
//            System.out.println("New user successfully created");
//            System.out.println("User info: " + user + "\n----------------------------");
//        }
//
//        // Test the convert class
//        //for now 0 = convert to kg, 1 = convert to lbs
//        Convert convert = new Convert(1, 200);
//
//        if (convert != null) {
//
//            System.out.println("New conversion successful");
//            System.out.println("Conversion: " + convert+ "\n----------------------------");
//        }
//    }
//
//    public void testClassHierarchy() {
//        ArrayList<Login> trackList = new ArrayList<>();
//        ArrayList<Convert> youSir = new ArrayList<>();
//
//        Login day = new Login("User","Pass");
//        Convert uName = new Convert(1, 200);
//        //TrackData tr = new TrackData(1, 200, 20, "Feb", 2023);
//        User u = new User("Me", 19, 200, 62, "User", "Pass");
//        trackList.add(day);
//        youSir.add(uName);
//
//        for(Login e : trackList) {
//            System.out.println(e);
//        }
//        for(Convert e : youSir) {
//            System.out.println(e);
//        }
//        System.out.println("-------------------" + "\n" + "Original classes:");
//
//        //original methods
//        uName.kgCon();
//        System.out.println(uName.getConvertion());
//        day.setpWord("bob");
//        System.out.println(day.getpWord() +"\n"+ "------------\n" + "OverWritten classes");
//
//        //Overwritten methods
//        //tr.convertion(1);
//        //System.out.println(tr.getConvertion());
//        u.setpWord("Bob");
//        System.out.println(u.getpWord());
//    }

    public void testInterface(){
//       ArrayList<Object> impLists = new ArrayList<>();
//       Convert con = new Convert(1,200);
//       //FindBMI fb = new FindBMI(200,1, 19,61);
//       impLists.add(con);
//       //impLists.add(fb);
//        System.out.println("Interface 1: Convert getConvertion() ->" + con.getConvertion() + ",  FindBMI getConvertion() ->" + fb.getConvertion());
//        System.out.println("Interface 2: Convert checkConvertion ->" + con.checkConvertion() + ", FindBMI checkConvertion() -> "+ fb.checkConvertion());
//        System.out.println("---------\n" + impLists);


    }

    public void checkCollections(){
        //tree map
        TrackData td1 = new TrackData(1,100, 72,LocalDate.now());
        td1.addEntry(LocalDate.now(), td1.getBMI());
        TrackData td2 = new TrackData(0,200, 72,LocalDate.now());
        TrackData td3 = new TrackData(1,300, 72,LocalDate.now());
        TrackData td4 = new TrackData(0,400, 72,LocalDate.now());
        System.out.println("date " + LocalDate.now() + td1.findEntry(LocalDate.now()));
        System.out.println("Date 2023-9-10 " + td1.findEntry(LocalDate.ofEpochDay(2023-9-11)));
        double nowDate = td1.findBmiOnDate(LocalDate.now());
        System.out.println("data on list = " + ( nowDate > 0 ?nowDate : "Doesn't exist"));
        System.out.println("data not on the list= " +td1.findBmiOnDate(LocalDate.ofEpochDay(2023-1-22)));
        td1.removeEntry(LocalDate.now());
        td1.displayData();

        System.out.println("----------------------------------------");

        //hashmap
        Login l1 = new Login("Admin","123");
        l1.addUser(l1.getuName(), l1.getpWord());
        Login l2 = new Login("User1","abc");
        Login l3 = new Login("User2","123abc");
        Login l4 = new Login("User3","User3");

        System.out.println("User 'Admin': " + l1.search4User("Admin"));
        System.out.println("User 'bob': " + l1.search4User("bob"));
        System.out.print("User 'Admin': "); l1.getUser("Admin");
        System.out.print("User 'bob': "); l1.getUser("bob");
        l1.removeUser("Admin");
        l1.printUsers();
    }
}
