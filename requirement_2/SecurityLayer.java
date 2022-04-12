package requirement_2;

public abstract class SecurityLayer {
    private SecurityLayer nextLayer;

    protected SecurityLayer linkLayer(SecurityLayer nextLayer) {
        this.nextLayer = nextLayer;
        return nextLayer;
    }

    protected abstract boolean check(String email, String password);

    protected boolean checkNextLayer(String email, String password) {
        if (nextLayer == null) {
            return true;
        } else {
            return nextLayer.check(email, password);
        }
    }

    protected void wait(int milliseconds) {
        long timer = System.currentTimeMillis();

        while (timer >= System.currentTimeMillis() - milliseconds) ;
    }
}
