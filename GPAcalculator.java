import java.util.Scanner;

public class GPAcalculator {

    // Method to calculate GPA based on grades and their corresponding points
    public static double calculateGPA(int numSubjects, double[] grades) {
        double totalPoints = 0.0;

        // Calculate total grade points based on grades entered
        for (int i = 0; i < numSubjects; i++) {
            totalPoints += grades[i];
        }

        // Return the GPA by dividing total points by the number of subjects
        return totalPoints / numSubjects;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of subjects: ");
        int numSubjects = scanner.nextInt();

        double[] grades = new double[numSubjects];

        // Input grades for each subject
        for (int i = 0; i < numSubjects; i++) {
            System.out.print("Enter grade for subject " + (i + 1) + ": ");
            grades[i] = scanner.nextDouble();
        }

        // Calculate and print GPA
        double gpa = calculateGPA(numSubjects, grades);
        System.out.println("Your GPA is: " + gpa);

        scanner.close();
    }
}