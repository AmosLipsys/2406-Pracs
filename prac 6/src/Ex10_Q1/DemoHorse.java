package Ex10_Q1;

public class DemoHorse{
   public static void main(String args[]){
      String name = "Franklin";
      String colour = "white";
      int year = 2011;
      int numOfRaces = 2;
      RaceHorse pony = new RaceHorse(name, colour, year, numOfRaces);
      pony.display();
   }
}