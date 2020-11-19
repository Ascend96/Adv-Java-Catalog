package lab1;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<MyAbstractSuperClass> courses = new ArrayList<>();
        courses.add(new AdvancedJavaCourse("Hard Java","J201",4,"J101"));
        courses.add(new IntroToProgrammingCourse("Hello World","P100",2));
        for (MyAbstractSuperClass c: courses) {
            System.out.println(c);
        }
    }
}
