package ProgrammingExercises;

import javax.swing.*;

/**
 * Created by Amos on 08-Aug-16.
 */
public class Part6
{
        public static void main(String[] args)
        {
            final int INCHES_IN_FOOT = 12;

            String totalInchesString = JOptionPane.showInputDialog(null, "Enter total number of Inches", "Inches to Feet", JOptionPane.INFORMATION_MESSAGE);
            Integer totalInches = Integer.parseInt(totalInchesString);
            Integer feet = totalInches / INCHES_IN_FOOT;
            Integer inches =  totalInches % INCHES_IN_FOOT;


            System.out.print("Out of " + totalInches + " inches there is a total of " + feet +  " feet and " + inches + " inches");

        }
}
