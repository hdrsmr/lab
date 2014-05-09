package id.co.quadras.strawberryshop;

import id.co.quadras.strawberryshop.worker.*;

import java.util.*;

/**
 * Created by achmad on 5/8/2014.
 */
public class SalePerson implements StrawberryConstants {
    private final Map<Byte, Worker> workers = new HashMap<Byte, Worker>(6);
    private static final Cashier CASHIER = new Cashier();
    private static final SalePerson SALE_PERSON = new SalePerson();

    private SalePerson() {
        final Worker juiceWorker = new JuiceWorker();
        workers.put(STANDART_STRAWBERRY_DRINK, juiceWorker);
        workers.put(MILK_STRAWBERRY_DRINK, juiceWorker);
        workers.put(CHOCHOLATE_TOPPING_STRAWBERRY_DRINK, juiceWorker);
        workers.put(STRAWBERRY_BROWNIES, new BrowniesWorker());
        workers.put(STRAWBERRY_PANCAKE, new PancakeWorker());
        workers.put(STRAWBERRY_SPONGE_CAKE, new SpongeCakeWorker());
    }

    public List<Strawberry> processOrder(List<Byte> strawberryIds) {
        final List<Strawberry> strawberries = new ArrayList<Strawberry>();
        for (Byte id : strawberryIds) {
            strawberries.add(workers.get(id).work(id));
        }
        return strawberries;
    }

    public static Double pay(List<Strawberry> strawberries) {
        return CASHIER.pay(strawberries);
    }

    public static List<Strawberry> acceptOrder(List<Byte> strawberryIds) {
        return SALE_PERSON.processOrder(strawberryIds);
    }
}
