package balex.courselist;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CourseList {

    public static void main(String[] args) {
        Courses courses = new Courses();
        courses.printCourseDetails();
    }
}

class Courses {
    private Map<String, Integer> courseDetails;

    public Courses() {
        courseDetails = new HashMap<>();
        courseDetails.put("BSE", 900000);
        courseDetails.put("BIT", 750000);
        courseDetails.put("BCS", 800000);
        courseDetails.put("BCE", 950000);
    }

    public void printCourseDetails() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter CourseID: ");
        String courseId = scanner.next().toUpperCase();

        Integer tuition = courseDetails.get(courseId);
        if (tuition != null) {
            System.out.println("Course: " + getCourseName(courseId));
            System.out.println("Tuition: " + tuition);
        } else {
            System.out.println("Wrong CourseID details");
        }
    }

    private String getCourseName(String courseId) {
        switch (courseId) {
            case "BSE":
                return "Software Engineering";
            case "BIT":
                return "Information Technology";
            case "BCS":
                return "Computer Science";
            case "BCE":
                return "Computer Engineering";
            default:
                return "Unknown Course";
        }
    }
}
