package ProgrammingExercises;

import javax.swing.*;

/**
 * Created by Amos on 08-Aug-16.
 */
public class Part5 {
    public static void main(String[] args)
    {
        final double KM_IN_NAUTMILE = 1.852;
        final double MILE_IN_NAUTMILE = 1.150779;


        String NautMileString = JOptionPane.showInputDialog(null, "Enter total number of Nautical Part5", "Distance Calculator", JOptionPane.INFORMATION_MESSAGE);
        int NautMile = Integer.parseInt(NautMileString);
        double KM = NautMile * KM_IN_NAUTMILE;
        double Mile = NautMile * MILE_IN_NAUTMILE;



        System.out.print(NautMile + " Nautical Miiles is equal to " + KM + " KMs and " + Mile + " Part5" );

    }
}
