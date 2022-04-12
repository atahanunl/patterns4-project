package requirement_2;

import java.util.HashMap;
import java.util.Map;

public class Demo {
    private static Map<String, String> database;
    private static Map<String, String> accounts;

    private static void initializeDatabase() {
        database = new HashMap<String, String>();

        database.put("admin", "admin123");
        database.put("teacher", "teacher123");
        database.put("student", "student123");
        database.put("staff", "staff123");

        accounts = new HashMap<String, String>();

        accounts.put("admin", "admin123");
        accounts.put("user", "user123");
        accounts.put("student", "student1234");
        accounts.put("staff", "staff123");
    }

    private SecurityLayer createSecurityLayer() {
        SecurityLayer timedVerification = new TimedVerification();
        SecurityLayer credentialVerification = new CredentialVerification(database);
        SecurityLayer faceIdVerification = new FaceIdVerification();

        timedVerification.linkLayer(credentialVerification);
        credentialVerification.linkLayer(faceIdVerification);

        return timedVerification;
    }

    public static void main(String[] args) {
        initializeDatabase();
        int entryCounter = 1;

        for (Map.Entry<String, String> entry : accounts.entrySet()) {
            System.out.println("********** Entry " + entryCounter + " is being checked **********\n");

            SecurityLayer securityLayer = new Demo().createSecurityLayer();
            boolean isSuccessful = securityLayer.check(entry.getKey(), entry.getValue());

            if (isSuccessful) {
                System.out.println("ACCESS GRANTED FOR ENTRY " + entryCounter++);
            } else {
                System.err.println("ACCESS DENIED FOR ENTRY " + entryCounter++);
            }
        }
    }
}
