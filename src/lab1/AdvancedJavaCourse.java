package lab1;

import javax.swing.*;


public class AdvancedJavaCourse extends MyAbstractSuperClass {

    String courseName;
    private String courseNumber;
    private double credits;
    private String prerequisites;

    public AdvancedJavaCourse(String courseName, String courseNumber, int credits, String prerequisit) {
        super(courseName, courseNumber, credits);
        this.setPrerequisites(prerequisit);
    }

    public final String getPrerequisites() {
        return prerequisites;
    }

    public final void setPrerequisites(String prerequisites) {
        if (prerequisites == null || prerequisites.length() == 0) {
            JOptionPane.showMessageDialog(null,
                    "Error: prerequisites cannot be null of empty string");
            System.exit(0);
        }
        this.prerequisites = prerequisites;
    }

    @Override
    public String toString() {
        return super.toString() + "AdvancedJavaCourse{" +
                "prerequisites='" + prerequisites + '\'' +
                '}';
    }
}
