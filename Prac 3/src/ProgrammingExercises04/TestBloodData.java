package ProgrammingExercises04;

/**
 * Created by Amos on 15-Aug-16.
 */
public class TestBloodData {
    public static void main(String args[]) {
        BloodData Max = new  BloodData();
        BloodData Bob = new  BloodData("A", "-");
        System.out.println(Max.getBloodType() + Max.getBloodFactor());
        System.out.println(Bob.getBloodType() + Bob.getBloodFactor());
    }
}
