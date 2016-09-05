package debug10;

class DebugMusical extends DebugPlay
{
   private String composer;
   
   DebugMusical(String title, String author, String comp)
   {
      super(title, author);
      composer = comp;
   }
   public void display()
   {
      System.out.println("The performance is " + title + " by " + author + "\nThe music for " + title +  " is by " + composer);
   }
}