package Ex10_Q2;

/**
 * Created by jc299390 on 5/09/16.
 */
public class ScentedCandle extends Candle {
    ScentedCandle(String colour, double height){
        Candle(colour, height);
        price = height * 3;
    }

    @Override
    public void setHeight(double height) {
        this.height = height;
        price = height * 3;
    }

}
