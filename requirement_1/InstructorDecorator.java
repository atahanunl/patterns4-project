package requirement_1;

public abstract class InstructorDecorator implements Instructor {
    protected Instructor decoratedInstructor;

    public InstructorDecorator(Instructor decoratedInstructor) {
        this.decoratedInstructor = decoratedInstructor;
    }

    @Override
    public void speak() {
        decoratedInstructor.speak();
    }
}
