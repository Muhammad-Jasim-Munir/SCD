package Java;

import java.util.Scanner;

public class index {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int distance;
        //Name
        System.out.println("Enter your name: ");
        String name = sc.nextLine();
        //Distance
        System.out.println("Enter your distance from Uni: ");
         distance = sc.nextInt();
        if (distance <= 5) {
            System.out.println("Cost will be Rs 2000");
        } else if (distance >=6 || distance <= 10) {
            System.out.println("Cost will be Rs 3500");
        } else if (distance >=10 || distance <= 20) {
            System.out.println("Cost will be Rs 5000");
        }else {
            System.out.println("Cost will be Rs 7000");
        }
    }
}
