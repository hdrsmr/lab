package id.co.quadras.strawberryshop.worker;

import id.co.quadras.strawberryshop.Strawberry;
import id.co.quadras.strawberryshop.StrawberryType;

/**
 * Created by achmad on 5/8/2014.
 */
abstract class StrawberryFood implements Strawberry {
    @Override
    public final StrawberryType getType() {
        return StrawberryType.FOOD;
    }
}
