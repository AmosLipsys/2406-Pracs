package ProgrammingExercises03;

import java.util.Scanner;

/**
 * Created by Amos on 15-Aug-16.
 */
public class Percentages {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter First Floating Point Number: " );
        double a = input.nextDouble();
        System.out.print("Enter Second Floating Point Number: " );
        double b = input.nextDouble();
        computePercentage(a, b);
        computePercentage(b, a);
    }

    private static void computePercentage(double a, double b){
        double percentage = a / b * 100;
        System.out.println(a + " is "+ percentage + "% of " + b);
    }
}
