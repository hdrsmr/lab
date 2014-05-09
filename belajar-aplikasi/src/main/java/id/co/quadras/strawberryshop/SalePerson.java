package id.co.quadras.strawberryshop;

import id.co.quadras.strawberryshop.worker.*;

import java.util.*;

/**
 * Created by achmad on 5/8/2014.
 */
public class SalePerson implements StrawberryConstants {
    private final Worker browniesWorker = new BrowniesWorker();
    private final Worker spongeCakeWorker = new SpongeCakeWorker();
    private final Worker pancakeWorker = new PancakeWorker();
    private final Worker juiceWorker = new JuiceWorker();
    private final Map<Byte, Worker> workers = new HashMap<Byte, Worker>(6);
    private static final Cashier CASHIER = new Cashier();
    private static final SalePerson SALE_PERSON = new SalePerson();

    private SalePerson() {
        workers.put(STANDART_STRAWBERRY_DRINK, juiceWorker);
        workers.put(MILK_STRAWBERRY_DRINK, juiceWorker);
        workers.put(CHOCHOLATE_TOPPING_STRAWBERRY_DRINK, juiceWorker);
        workers.put(STRAWBERRY_BROWNIES, browniesWorker);
        workers.put(STRAWBERRY_PANCAKE, pancakeWorker);
        workers.put(STRAWBERRY_SPONGE_CAKE, spongeCakeWorker);
    }

    public List<Strawberry> processOrder(List<Byte> strawberryIds) {
        final ArrayList<Strawberry> strawberries = new ArrayList<Strawberry>();
//        final ArrayList<Byte> beverages = new ArrayList<Byte>();
        for (Byte id : strawberryIds) {
            //strategy pattern
            strawberries.addAll(workers.get(id).work(Arrays.asList(id)));
//            if (id == 1 || id == 2 || id == 3) {
//                beverages.add(id);
//            } else if (id == STRAWBERRY_BROWNIES) {
//                strawberries.addAll(browniesWorker.work(Arrays.asList(id), orderIds));
//            } else if (id == StrawberryConstants.STRAWBERRY_PANCAKE) {
//                strawberries.addAll(pancakeWorker.work(Arrays.asList(id), orderIds));
//            } else if (id == StrawberryConstants.STRAWBERRY_SPONGE_CAKE) {
//                strawberries.addAll(spongeCakeWorker.work(Arrays.asList(id), orderIds));
//            }
        }
//        strawberries.addAll(juiceWorker.work(beverages, orderIds));
        //1-3 adalah minuman
        //4-6 adalah makanan
        //4 adalah brownies
        //5 adalah pancake
        //6 adalah spongecake
        // lakukan percabangan mau diarahkan ke worker mana
        return strawberries;
    }

    public static Double pay(List<Strawberry> strawberries) {
        return CASHIER.pay(strawberries);
    }

    public static List<Strawberry> acceptOrder(List<Byte> strawberryIds) {
        return SALE_PERSON.acceptOrder(strawberryIds);
    }
}
