public class Thread2 extends Thread{
    private UserStorage userStorage;
    private final Thread thread;


    public Thread2(UserStorage userStorage, Thread thread) {
        this.userStorage = userStorage;
        this.thread = thread;
    }

    @Override
    public void run() {
        while (true){

            try {
                thread.join(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
           userStorage.setUser(new User());
                System.out.println("set User");
        }
    }
    }

