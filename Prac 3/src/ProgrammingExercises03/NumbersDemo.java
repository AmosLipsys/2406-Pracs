package ProgrammingExercises03;

/**
 * Created by Amos on 15-Aug-16.
 */
import java.util.Scanner;

public class NumbersDemo{
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter First Number: " );
        int a = input.nextInt();
        System.out.print("Enter Second Number: " );
        int b = input.nextInt();

        displayTwiceTheNumber(b);
        displayNumberPlusFive(a);
        displayNumberPlusFive(b);
        displayNumberSquared(a);
        displayNumberSquared(b);
    }


    private static void displayTwiceTheNumber(int a){
        System.out.println("Double " + a + " is " +  (a*2));

    }

    private static void displayNumberPlusFive(int a){
        System.out.println(a + " + 5 is " +  (a+5));

    }

    private static void displayNumberSquared(int a){
        System.out.println(a + " squared is " +  (a*a));

    }


}
