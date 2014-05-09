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
            strawberries.add(work(id));
        }
        return strawberries;
    }

    public Strawberry work(Byte id) {
        if (id < 1)
            throw new InvalidStrawberryIdException();
        if (id == STANDART_STRAWBERRY_DRINK)
            return new StandartStrawberryDrink();
        else if (id == MILK_STRAWBERRY_DRINK)
            return new MilkStrawberryDrink();
        else
            return new ChocolateToppingMilkStrawberryDrink();
    }
}
