public class Threat1 extends Thread {
    private UserStorage userStorage;
    private Thread thread;

    public Threat1(UserStorage userStorage) {
        this.userStorage = userStorage;

    }

    public void setThread(Thread thread) {
        this.thread = thread;
    }

    @Override
    public void run() {
        while (true) {


                try {
                    thread.join(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("get" + userStorage.getUser().getClass().getName());
            }


    }

}
