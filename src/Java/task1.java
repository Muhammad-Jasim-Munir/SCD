package Java;
import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int marks;
        int total = 0;

        // Name
        System.out.println("Enter your name:");
        String name = sc.nextLine();

        // Roll Number
        System.out.println("Enter your roll number:");
        String roll = sc.nextLine();

        // Subjects marks
        System.out.println("Enter your marks:");

        for (int i = 0; i < 3; i++) {
            marks = sc.nextInt();
            total = total + marks;
        }

        System.out.println("Total marks: " + total);

        // Percentage
        double percentage = (total / 300.0) * 100;
        System.out.println("Percentage: " + percentage);

        // Grade
        if (percentage >= 85 && percentage <= 100) {
            System.out.println("Grade A");
        } 
        else if (percentage >= 70 && percentage < 85) {
            System.out.println("Grade B");
        } 
        else if (percentage >= 50 && percentage < 70) {
            System.out.println("Grade C");
        } 
        else {
            System.out.println("Grade F");
        }

        sc.close();
    }
}