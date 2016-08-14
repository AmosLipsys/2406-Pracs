package ProgrammingExercises;

import javax.swing.*;

/**
 * Created by Amos on 08-Aug-16.
 */
public class Part4 {
    public static void main(String[] args)
    {
        final int QUARTS_IN_GALLON = 4;

        String totalQuartsString = JOptionPane.showInputDialog(null, "Enter total number of Quarts", "Quarts to Gallons", JOptionPane.INFORMATION_MESSAGE);
        Integer totalQuarts = Integer.parseInt(totalQuartsString);
        Integer Gallon = totalQuarts / QUARTS_IN_GALLON;
        Integer Quarts =  totalQuarts % QUARTS_IN_GALLON;


        System.out.print("Out of " + totalQuarts + " Quarts there is a total of " + Gallon +  " Gallons and " + Quarts + " Quarts");

    }
}
