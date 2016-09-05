package Ex10_Q4;

/**
 * Created by jc299390 on 5/09/16.
 */
public class DemoPoems {
    public static void main(String args[]) {
        Poem poem1 = new Poem("If I could catch a rainbow", 24);
        Couplet poem2 = new Couplet("Green Eggs and Ham");
        Limerick poem3 = new Limerick("A Funny Young fellow named Perkins");
        Haiku poem4 = new Haiku("Bright lights fill my eyes");

        poem1.display();
        poem2.display();
        poem3.display();
        poem4.display();
    }
}
