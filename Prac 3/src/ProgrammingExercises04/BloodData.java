package ProgrammingExercises04;

/**
 * Created by Amos on 15-Aug-16.
 */
public class BloodData {

    public String bloodType;
    public String bloodFactor;

    public BloodData(){
        bloodType = "O";
        bloodFactor = "+";
    }

    public BloodData(String bloodType, String bloodFactor){
        this.bloodType = bloodType;
        this.bloodFactor = bloodFactor;
    }

    public String getBloodType() {
        return bloodType;
    }

    public void setBloodType(String bloodType) {
        this.bloodType = bloodType;
    }

    public String getBloodFactor() {
        return bloodFactor;
    }

    public void setBloodFactor(String bloodFactor) {
        this.bloodFactor = bloodFactor;
    }
}
