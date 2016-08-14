package ProgrammingExercises04;

/**
 * Created by Amos on 15-Aug-16.
 */
public class Patient extends BloodData{
    private int num;
    private int age;


    public Patient() {
        num = 0;
        age = 0;
    }

    public Patient(int num, int age, String bloodType, String bloodFactor  ) {
        this.num = num;
        this.age = age;
        this.bloodType = bloodType;
        this.bloodFactor = bloodFactor;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
