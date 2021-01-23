import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class UserStorage {
    int limit = 20;

    public synchronized int getSize() {


        return userList.size();
    }

    private List<User> userList= new ArrayList<>();

    public synchronized User getUser() {
        if (userList.size() == 0) {
            try {
                this.wait(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

            return userList.remove(0);
    }

    public synchronized void setUser(User user) {
        if (userList.size()==limit){
            try {
                this.wait(10000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        userList.add(user);
    }
}
