import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class UserStorage {
    int limit = 20;

    public int getSize() {
        return userList.size();
    }

    private List<User> userList= new ArrayList<>();

    public  User getUser() {
        return userList.remove(0);
    }

    public void setUser(User user) {
        userList.add(user);
    }
}
