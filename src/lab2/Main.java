package lab2;


import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<MyInterface> courses = new ArrayList<>();
        courses.add(new IntroJavaCourse("The Java Intro", "J101", 4, "P100"));
        courses.add(new AdvancedJavaCourse("Hard Java", "J201", 4, "J101"));
        courses.add(new IntroToProgrammingCourse("Hello World", "P100", 2));
        for (MyInterface c : courses) {
            System.out.println(c);
        }
    }
}