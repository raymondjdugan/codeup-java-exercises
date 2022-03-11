package collections.grades;

import java.util.ArrayList;

public class Student {
    private String name;
    private ArrayList<Integer> grades;

    public Student(String name) {
        this.name = name;
        this.grades = new ArrayList<>();
    }

    public void addGrade(int grade) {
        grades.add(grade);
    }

    public void deleteLastGrade(){
        grades.remove(grades.size() - 1);
    }

    public double getAverage() {
       double sum = 0;
        for (Integer grade : grades) {
            sum += grade;
        }
        return sum / grades.size();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Integer> getGrades() {
        return grades;
    }

    public void setGrades(ArrayList<Integer> grades) {
        this.grades = grades;
    }

    public static void main(String[] args) {
        Student cracked = new Student("Ray");

        System.out.println(cracked.getName());
        System.out.println(cracked.getGrades());
        cracked.addGrade(100);
        cracked.addGrade(90);
        System.out.println(cracked.getGrades());
        System.out.println(cracked.getAverage());
    }
}
