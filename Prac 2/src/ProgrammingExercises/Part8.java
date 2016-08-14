package ProgrammingExercises;

import javax.swing.*;

/**
 * Created by Amos on 08-Aug-16.
 */
public class Part8 {
    public static void main(String[] args)
    {
        final int EGGS_IN_DOZEN = 12;
        double dozenCost = 3.5;
        double individualCost = 0.45;


        String totalEggsString = JOptionPane.showInputDialog(null, "Enter total number of eggs you want to buy", "Inches to Feet", JOptionPane.INFORMATION_MESSAGE);
        Integer totalEggs = Integer.parseInt(totalEggsString);
        Integer dozen = totalEggs / EGGS_IN_DOZEN;
        Integer individualEggs =  totalEggs % EGGS_IN_DOZEN;
        double totalCost = dozen * dozenCost + individualEggs * individualCost;



        System.out.print(totalEggs + " eggs at prices $" + dozenCost + " per dozen and $" + individualCost + " for each extra egg. This gives a grand total of $" + totalCost );


    }
}
