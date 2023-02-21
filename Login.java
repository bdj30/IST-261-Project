public class Login {
    private String uName;
    private String pWord;

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

    @Override
    public String toString() {
        return "Login{" +
                "uName='" + uName + '\'' +
                ", pWord='" + pWord + '\'' +
                '}';
    }
    
public class User extends Login {
    private String name;
    private int age;
    
    public User(String uName, String pWord, String name, int age){
        super(uName, pWord);
        this.name = name;
        this.age = age;
    }
    
    public void viewProfile(){
    }
}
}
