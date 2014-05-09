package id.co.quadras.strawberryshop.worker;

import id.co.quadras.strawberryshop.Strawberry;
import id.co.quadras.strawberryshop.StrawberryConstants;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by achmad on 5/8/2014.
 */
public class JuiceWorker implements Worker, StrawberryConstants {
    @Override
    public List<Strawberry> work(List<Byte> ids) {
        final ArrayList<Strawberry> strawberries = new ArrayList<Strawberry>();
        for (Byte id : ids) {
            if (id < 0)
//                throw new IllegalArgumentException("Hoi, id gak valid!!!");
                throw new InvalidStrawberryIdException();
            if (id == STANDART_STRAWBERRY_DRINK)
                strawberries.add(new StandartStrawberryDrink());
            else if (id == MILK_STRAWBERRY_DRINK)
                strawberries.add(new MilkStrawberryDrink());
            else
                strawberries.add(new ChocolateToppingMilkStrawberryDrink());
        }
        return strawberries;
    }
}
