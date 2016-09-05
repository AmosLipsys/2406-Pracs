package Ex10_Q1;

public class Horse
{
    int year;
    String name, colour;
    public void Horse(String name, String colour, int year){
       this.year = year;
       this.name = name;
       this.colour = colour;
    }
    public void display()
    {
        System.out.println(name + " was born in " + year + " and is distinctively " + colour + " in colour." );
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }
}
