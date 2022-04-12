package requirement_1;

import java.util.Date;

public class SubstituteDecorator extends InstructorDecorator {
    private final Date endDate;

    public SubstituteDecorator(Instructor decoratedInstructor, Date endDate) {
        super(decoratedInstructor);
        this.endDate = endDate;
    }

    private void contractDetails() {
        System.out.println("I am here until " + endDate);
    }

    @Override
    public void speak() {
        decoratedInstructor.speak();
        contractDetails();
    }
}
