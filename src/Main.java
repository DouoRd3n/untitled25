public class Main {
    public static void main(String[] args) {
        UserStorage userStorage = new UserStorage();
        Threat1 threat1 = new Threat1(userStorage);
        Thread2 thread2 = new Thread2(userStorage, threat1);
        setUserStorageElements(userStorage);
        threat1.setThread(thread2);
        threat1.start();
        thread2.start();
    }

    private static void setUserStorageElements(UserStorage userStorage) {
        for (int i = 0; i < 18 ; i++) {
            userStorage.setUser(new User());

        }
    }
}
