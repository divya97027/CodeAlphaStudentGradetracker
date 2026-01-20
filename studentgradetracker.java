import java.util.ArrayList;
import java.util.Scanner;

public class StudentGradeTracker {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> marks = new ArrayList<>();

        System.out.print("Enter number of students: ");
        int n = sc.nextInt();

        // Input marks
        for (int i = 1; i <= n; i++) {
            System.out.print("Enter marks of student " + i + ": ");
            int m = sc.nextInt();
            marks.add(m);
        }

        int total = 0;
        int highest = marks.get(0);
        int lowest = marks.get(0);

        // Calculation
        for (int m : marks) {
            total += m;

            if (m > highest)
                highest = m;

            if (m < lowest)
                lowest = m;
        }

        double average = (double) total / n;

        // Output
        System.out.println("\n--- Student Grade Report ---");
        System.out.println("Total Students: " + n);
        System.out.println("Average Marks: " + average);
        System.out.println("Highest Marks: " + highest);
        System.out.println("Lowest Marks: " + lowest);

        sc.close();
    }
}
