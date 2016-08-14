package ProgrammingExercises04;

import ProgrammingExercises04.Patient;

/**
 * Created by Amos on 15-Aug-16.
 */
public class TestPatient {
    public static void main(String args[]) {
        Patient Max = new  Patient();
        Patient Bob = new  Patient(123, 12, "A", "-");
        System.out.println("Number: " + Max.getNum() + "    Age: " + Max.getAge() + "    Blood type: " +  Max.getBloodType() + Max.getBloodFactor());
        System.out.println("Number: " + Bob.getNum() + "    Age: " + Bob.getAge() + "    Blood type: " +  Bob.getBloodType() + Bob.getBloodFactor());
    }
}
