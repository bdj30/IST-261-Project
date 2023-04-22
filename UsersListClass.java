import java.util.HashMap;

public class UsersListClass {
    HashMap<String, Login> UsersList = new HashMap<>();
    public UsersListClass(){
    }

    public void addUser(String s, Login l){

    }

    public HashMap<String, Login> getUsersList() {
        return UsersList;
    }

    @Override
    public String toString() {
        return "UsersListClass{" +
                "UsersList=" + UsersList +
                '}';
    }
}
