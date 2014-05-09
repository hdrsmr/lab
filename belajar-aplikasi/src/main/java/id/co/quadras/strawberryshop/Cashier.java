package id.co.quadras.strawberryshop;

import java.util.List;

/**
 * Created by achmad on 5/8/2014.
 */
public class Cashier {
    public Double pay(List<Strawberry> strawberries) {
        double grandPrice = 0.0;
        for (Strawberry strawberry : strawberries) {
            grandPrice += strawberry.getPrice();
        }
        return grandPrice;
    }
}
