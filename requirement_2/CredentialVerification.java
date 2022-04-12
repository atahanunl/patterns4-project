package requirement_2;

import java.util.Map;
import java.util.Random;

public class CredentialVerification extends SecurityLayer {
    private Map<String, String> database;

    public CredentialVerification(Map<String, String> database) {
        this.database = database;
    }

    @Override
    protected boolean check(String email, String password) {
        System.out.println("Connecting to the database...");
        wait(new Random().nextInt(5000) + 1);
        System.out.println("Database connection established !");

        System.out.println("Checking credentials...");
        wait(new Random().nextInt(5000) + 1);

        if (database.containsKey(email)) {
            if (database.get(email).equals(password)) {
                System.out.println("Email and password are correct !\n");
                return checkNextLayer(email, password);
            } else {
                System.err.println("Invalid password !\n");
                return false;
            }
        } else {
            System.err.println("Invalid email ! \n");
            return false;
        }
    }
}
