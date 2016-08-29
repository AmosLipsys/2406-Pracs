package exe2;

import javax.swing.*;

/**
 * Created by jc299390 on 29/08/16.
 */
public class distanceFromAverage {
    public static void main(String[] args){
        int index = 0;
        double[] entry;
        entry = new double[20];
        String input, STOP = "999999";

        //First input
        input = JOptionPane.showInputDialog(null, "Enter a double\n" +
                "Enter " + STOP + " when you want to stop");
        if(!(input.equals(""))){
            entry[index] = Double.parseDouble(input);
            index ++;
        }

        while(!(input.equals(STOP)) || index >= 20) {
            input = JOptionPane.showInputDialog(null, "Enter another double\n" +
                    "Enter " + STOP + " when you want to stop");
            if(!(input.equals(""))) {
                entry[index] = Double.parseDouble(input);
                index++;
            }

        }

    }
}
