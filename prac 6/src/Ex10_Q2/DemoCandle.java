package Ex10_Q2;

/**
 * Created by jc299390 on 5/09/16.
 */
public class DemoCandle {
    public static void main(String args[]) {
        String colour = "Blue";
        Double height = 22.5;
        ScentedCandle candle42 = new ScentedCandle(colour, height);
        candle42.display();
        candle42.setHeight(39.5);
        candle42.display();
    }
}