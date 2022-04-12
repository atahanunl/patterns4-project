package requirement_2;

import java.util.Random;

public class TimedVerification extends SecurityLayer {
    private final int timeSpent;
    private final int timeLimit;

    public TimedVerification() {
        this.timeSpent = new Random().nextInt(5000) + 1;
        this.timeLimit = 4000;
    }

    @Override
    protected boolean check(String email, String password) {
        System.out.println("Processing...");
        wait(timeSpent);

        if (timeSpent <= timeLimit) {
            System.out.println("Process completed !\n");
            return checkNextLayer(email, password);
        } else {
            System.err.println("Session timed out !\n");
            return false;
        }
    }
}
