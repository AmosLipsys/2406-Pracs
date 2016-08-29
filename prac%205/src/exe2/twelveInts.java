package exe2;

/**
 * Created by jc299390 on 29/08/16.
 */
public class twelveInts {
    public static void main(String[] arg){
        int[] myIntArray = {1 , 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};
        System.out.println("Normal order: ");

        for (int i:myIntArray)
        {
            System.out.print(i + " ");
        }

        System.out.println("\n\nReverse order: ");

        for (int i = myIntArray.length; i > 0; i-- ){
            System.out.print(i + " ");
        }
    }
}
