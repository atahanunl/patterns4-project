package requirement_1;

import java.util.Calendar;
import java.util.Date;

public class Demo {
    public static void main(String[] args) {
        Date endDateTeacher = new Date(2022, Calendar.APRIL, 23);
        Date endDateTeachingAssistant = new Date(2022, Calendar.MAY, 19);

        Instructor teacher = new Teacher();
        Instructor teachingAssistant = new TeachingAssistant();

        Instructor substituteTeacher = new SubstituteDecorator(new Teacher(), endDateTeacher);
        Instructor substituteTeachingAssistant = new SubstituteDecorator(new TeachingAssistant(), endDateTeachingAssistant);

        teacher.speak();
        System.out.println();

        teachingAssistant.speak();
        System.out.println();

        substituteTeacher.speak();
        System.out.println();

        substituteTeachingAssistant.speak();
        System.out.println();
    }
}
