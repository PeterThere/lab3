import java.util.HashMap;

public class Database {

    HashMap<String,String> users = new HashMap<>(); // <login, hasło>

    Database()
    {
        users.put("Grzegorz", "Brzęczyszczykiewicz");
        users.put("Mike", "Oxlong");
        users.put("user", "123");
    }
}