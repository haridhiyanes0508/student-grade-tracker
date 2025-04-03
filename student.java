import java.util.ArrayList;
import java.util.Scanner;

public class Student {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> grades = new ArrayList<>();

        System.out.print("Enter the number of students: ");
        int num = scanner.nextInt();

        // Input student grades
        for (int i = 0; i < num; i++) {
            System.out.print("Enter grade for student " + (i + 1) + ": ");
            grades.add(scanner.nextInt());
        }

        // Compute statistics
        int highest = findHighest(grades);
        int lowest = findLowest(grades);
        double average = calculateAverage(grades);

        // Display results
        System.out.println("\n--- Grade Statistics ---");
        System.out.println("Highest Score: " + highest);
        System.out.println("Lowest Score: " + lowest);
        System.out.printf("Average Score: %.2f\n", average);

        scanner.close();
    }

    // Method to find the highest grade
    public static int findHighest(ArrayList<Integer> grades) {
        int max = grades.get(0);
        for (int grade : grades) {
            if (grade > max) {
                max = grade;
            }
        }
        return max;
    }

    // Method to find the lowest grade
    public static int findLowest(ArrayList<Integer> grades) {
        int min = grades.get(0);
        for (int grade : grades) {
            if (grade < min) {
                min = grade;
            }
        }
        return min;
    }

    // Method to calculate the average grade
    public static double calculateAverage(ArrayList<Integer> grades) {
        int sum = 0;
        for (int grade : grades) {
            sum += grade;
        }
        return (double) sum / grades.size();
    }
}