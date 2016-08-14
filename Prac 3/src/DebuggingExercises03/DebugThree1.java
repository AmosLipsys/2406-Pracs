package DebuggingExercises03;
// This class calculates a waitperson's tip as 15% of the bill



public class DebugThree1
{
   public static void main(String args[])
   {

      double myCheck = 50.00;
      double yourCheck = 19.95;
      System.out.println("Tips are:" );
      calcTip(myCheck);
      calcTip(yourCheck);
    }
    private static void calcTip(double bill)
    {
      final double RATE = 0.15;
      double tip = Math.round(bill * RATE * 100.0)/100.0;
      System.out.println("With a bill of $" + bill +" the tip should be at least $" + tip);
    }
}
