package Ex10_Q3;

/**
 * Created by jc299390 on 5/09/16.
 */
class PetSold extends ItemSold
{
    private String composer;
    boolean vaccinated, neauted, housebroken;
    PetSold(int itemNumber, String description, double price,
            boolean vaccinated, boolean neauted, boolean housebroken)
    {
        super(itemNumber, description, price);
        this.vaccinated = vaccinated;
        this.neauted = neauted;
        this.housebroken = housebroken;
    }

    @Override
    public void display()
    {
        System.out.print(String.format("Pet #%d is a %s and costs $%.2f. ", itemNumber, description, price ));
        if (vaccinated){
            System.out.print("It has been vaccinated. ");
        }
        if (neauted){
            System.out.print("It has been neuted. ");
        }
        if (housebroken){
            System.out.print("It has been housebroken. ");
        }

    }

}