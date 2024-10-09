import java.util.ArrayList;
import java.util.Scanner;

public class GradeTracker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Double> grades = new ArrayList<>();

        System.out.println("Student Grade Tracker");

        // Input: Enter student grades
        while (true) {
            System.out.print("Enter a grade (or type '-1' to finish): ");
            double grade = scanner.nextDouble();
            if (grade == -1) {
                break;  // exit input loop when -1 is entered
            }
            grades.add(grade);
        }

        if (grades.isEmpty()) {
            System.out.println("No grades were entered.");
        } else {
            // Output: Display average, highest, and lowest grades
            double average = calculateAverage(grades);
            double highest = findHighestGrade(grades);
            double lowest = findLowestGrade(grades);

            System.out.printf("Average grade: %.2f%n", average);
            System.out.printf("Highest grade: %.2f%n", highest);
            System.out.printf("Lowest grade: %.2f%n", lowest);
        }

        scanner.close();
    }

    // Method to calculate average grade
    public static double calculateAverage(ArrayList<Double> grades) {
        double sum = 0;
        for (double grade : grades) {
            sum += grade;
        }
        return sum / grades.size();
    }

    // Method to find the highest grade
    public static double findHighestGrade(ArrayList<Double> grades) {
        double highest = grades.get(0);
        for (double grade : grades) {
            if (grade > highest) {
                highest = grade;
            }
        }
        return highest;
    }

    // Method to find the lowest grade
    public static double findLowestGrade(ArrayList<Double> grades) {
        double lowest = grades.get(0);
        for (double grade : grades) {
            if (grade < lowest) {
                lowest = grade;
            }
        }
        return lowest;
    }
}
