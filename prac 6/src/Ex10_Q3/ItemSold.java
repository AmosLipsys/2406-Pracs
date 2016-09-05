package Ex10_Q3;

/**
 * Created by jc299390 on 5/09/16.
 */
public class ItemSold {
    int itemNumber;
    String description;
    double price;

    ItemSold(int itemNumber, String description, double price){
        this.itemNumber = itemNumber;
        this.description = description;
        this.price = price;
    }

    public void display()
    {
        System.out.println(String.format("Item #%d is a %s and costs $%.2f", itemNumber, description, price ));
    }
}
