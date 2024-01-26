package ec.edu.charge.strategy.utils;

import java.util.HashMap;

public class OnMemoryDataBase {
    private static final HashMap<String, User> USER_MAP = new HashMap<>();

    static {
        USER_MAP.put("marivc", new User("Marivc", "1234", "Admin"));
        USER_MAP.put("jose", new User("iolvera", "7890", "Cajero"));
        USER_MAP.put("maria", new User("amedina", "3456", "Supervisor"));
    }

    public static User findUserByName(String username) {
        return USER_MAP.get(username);
    }
}
