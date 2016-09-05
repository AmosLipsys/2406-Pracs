package Ex10_Q3;

/**
 * Created by jc299390 on 5/09/16.
 */
public class DemoItemsAndPets{
    public static void main(String args[]) {
        ItemSold carrot = new ItemSold(12, "Fresh Carrot", 3.50);
        carrot.display();
        PetSold chris = new PetSold(1564, "Cat, black and white", 38, true, false, true);
        chris.display();
    }
}
