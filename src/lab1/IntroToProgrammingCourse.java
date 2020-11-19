package lab1;


public class IntroToProgrammingCourse extends MyAbstractSuperClass {
    public IntroToProgrammingCourse(String courseName, String courseNumber, int credits) {
        super(courseName, courseNumber,credits);
    }

    @Override
    public String toString() {
        return super.toString() + "IntroToProgrammingCourse{}";
    }
}

