package Ex10_Q1;

public class RaceHorse extends Horse {
    private int numOfRaces;
    public int getNumOfRaces() {
        return numOfRaces;
    }
    public void setNumOfRaces(int numOfRaces) {
        this.numOfRaces = numOfRaces;
    }

    RaceHorse(String name, String colour, int year, int numOfRaces){
       Horse(name, colour, year);
       this.numOfRaces = numOfRaces;
    }
    @Override
    public void display()
    {
        System.out.println(name + " was born in " + year + " and is distinctively " + colour + " in colour. \nHe has just finished race numer " + numOfRaces);
    }
}
