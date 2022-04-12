package requirement_1;

public class Teacher implements Instructor {
    @Override
    public void speak() {
        System.out.println("I am a teacher");
    }
}
