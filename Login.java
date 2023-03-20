import java.util.HashMap;

public class Login {
    private String uName;
    protected String pWord;
    private HashMap<String,String> users = new HashMap<>();

    public Login(String uName, String pWord) {
        this.uName = uName;
        this.pWord = pWord;
    }
    //setters
    public void setuName(String uName) {
        this.uName = uName;
    }

    public void setpWord(String pWord) {
        this.pWord = pWord;
    }

    //delete Getters later, for testing purposes only
    public String getuName() {
        return uName;
    }

    public String getpWord() {
        return pWord;
    }

    //collection methods

    public void addUser(String userName, String passWord){
        if(!users.containsKey(userName)) users.put(userName,passWord);
        else System.out.println("User already exists");

    }
    public String search4User(String userName){
        String user = users.containsKey(userName) ? "user Exists": "user dose NOT Exists";
        return user;
    }

    public void getUser(String userName){
        if(users.containsKey(userName)){
            System.out.println(users.get(userName));
        }else System.out.println("User dose not exist");
    }

    public void removeUser(String userName){
        if(users.containsKey(userName)) users.remove(userName);
    }

    public void printUsers(){
        System.out.println(users);
    }

    @Override
    public String toString() {
        return "Login{" +
                "uName='" + uName + '\'' +
                ", pWord='" + pWord + '\'' +
                '}';
    }
    

}
