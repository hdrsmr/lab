package id.co.quadras.strawberryshop.worker;

import id.co.quadras.strawberryshop.Strawberry;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by achmad on 5/8/2014.
 */
public class BrowniesWorker implements Worker {
    private final Logger logger = LoggerFactory.getLogger(getClass());

    @Override
    public List<Strawberry> work(List<Byte> ids) {
        final List<Strawberry> strawberries = new ArrayList<Strawberry>();
        for (Byte id : ids) {
            strawberries.add(work(id));
        }
        return strawberries;
    }

    @Override
    public Strawberry work(Byte id) {
        return new StrawberryBrownies();
    }
}
