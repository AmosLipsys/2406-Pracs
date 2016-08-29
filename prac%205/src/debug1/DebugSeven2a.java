package debug1;

import java.util.Scanner;

/**
 * Created by Amos on 28-Aug-16.
 */
public class DebugSeven2a {
    public static void main(String[] arg){

        String str;
        StringBuilder subStr = new StringBuilder();
        char singleChar = ' ';
        int num, sum = 0, length;

        Scanner in = new Scanner(System.in);
        System.out.print("Enter a series of integers separated by spaces >> ");
        str = in.nextLine();
        length = str.length();


        for (int i = 0; i < length; i++) {
            singleChar = str.charAt(i);
            if (singleChar == ' '){
                if(! subStr.equals(" ")) {
                    num = Integer.parseInt(subStr.toString());
                    sum += num;
                    System.out.println("                  " + subStr);
                }
                subStr.setLength(0);
            }
            else
                subStr.append(singleChar);

        }

        if(! (subStr.equals(" ") || subStr.equals("")) ) {
            num = Integer.parseInt(subStr.toString());
            sum += num;
            System.out.println("                  " + subStr);
        }
        System.out.print("Total sum of ints are : " + sum);
    }
}
