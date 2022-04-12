package requirement_2;

import java.util.Random;

public class FaceIdVerification extends SecurityLayer {
    private boolean isFaceRecognized;

    public FaceIdVerification() {
        this.isFaceRecognized = new Random().nextBoolean();
    }

    @Override
    protected boolean check(String email, String password) {
        System.out.println("Checking FaceID...");
        wait(new Random().nextInt(5000) + 1);

        if (isFaceRecognized) {
            System.out.println("Face recognized !\n");
            return checkNextLayer(email, password);
        } else {
            System.err.println("Face could not be recognized !\n");
        }

        return false;
    }
}
