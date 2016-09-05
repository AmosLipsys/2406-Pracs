package Ex10_Q2;

/**
 * Created by jc299390 on 5/09/16.
 */
public class Candle{
    String colour;
    double height, price;

    public void Candle(String colour, double height){
        this.colour = colour;
        this.height = height;
        this.price = height * 2;
    }


    public void display()
    {
        System.out.println("This " + colour + " candle is " + height + "cm tall and costs $" + price);
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
        price = height * 2;
    }
}
