package id.co.quadras.customer;

import id.co.quadras.strawberryshop.Cashier;
import id.co.quadras.strawberryshop.SalePerson;
import id.co.quadras.strawberryshop.Strawberry;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by achmad on 5/8/2014.
 */
public class CustomerApp {
    public static void main(String[] args) {
        final List<Strawberry> strawberries = SalePerson.acceptOrder(new ArrayList<Byte>());
        final Double price = SalePerson.pay(strawberries);

    }
}
