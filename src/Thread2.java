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
            if (userStorage.limit == userStorage.getSize()) {
                while (!thread.isAlive()){
                    try {
                        Thread2.sleep(2000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                }
                thread.start();
            } else {

            try {
                thread.join(4000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
           userStorage.setUser(new User());
                System.out.println("set User");
        }
    }
    }
}
