package collections.grades;

import util.Input;

import java.util.HashMap;
import java.util.Map;

public class GradesApplication {
    public static Map<String, Student> createStudents() {
        HashMap<String, Student> students = new HashMap<>();
        Student student1 = new Student("Ray");
        Student student2 = new Student("Wesley");
        Student student3 = new Student("Emilio");
        Student student4 = new Student("Scott");

        int[] student1Grades = {100, 95, 100};
        int[] student2Grades = {100, 98, 100};
        int[] student3Grades = {70, 70, 75};
        int[] student4Grades = {80, 85, 90};

        student1.addMultipleGrades(student1Grades);
        student2.addMultipleGrades(student2Grades);
        student3.addMultipleGrades(student3Grades);
        student4.addMultipleGrades(student4Grades);

        students.put("superCracked", student1);
        students.put("Cracked", student2);
        students.put("littleCracked", student3);
        students.put("eh", student4);
        return students;
    }

    private static void printMessage(Map<String, Student> students) {
        int count = 1;
        System.out.println("\nWelcome!\n" +
                "\n" +
                "Here are the GitHub usernames of our students:");
        for (String key : students.keySet()) {
            System.out.println(count + ": " + key);
            count += 1;
        }
    }

    private static void printResults(Map<String, Student> students, String userChoice) {
        if (!students.containsKey(userChoice)) {
            System.out.printf("Sorry, no student found with the GitHub username of \"%s\".\n", userChoice);
        }
        students.forEach((gitHubName, student) -> {
            if (gitHubName.equals(userChoice)) {
                System.out.printf("Name: %s - GitHub Username: %s\n",student.getName(), gitHubName);
                System.out.printf("Current Average: %.0f%%\n",student.getAverage());
                System.out.println("Current Grades: " + student.getGrades());
                System.out.printf("Class Average: %.0f%%\n",getAverage(students));
            }
        });
    }

    private static double getAverage(Map<String, Student> students) {
        double classAverage = 0;
        for (Student student : students.values()) {
            classAverage += student.getAverage();
        }
        return classAverage / students.size();
    }

    public static void main(String[] args) {
        Input select = new Input();
        Map<String, Student> students = createStudents();

        printMessage(students);

        String userChoice = select.getString("Enter the Github profile name of the student");

        printResults(students, userChoice);

    }


}
