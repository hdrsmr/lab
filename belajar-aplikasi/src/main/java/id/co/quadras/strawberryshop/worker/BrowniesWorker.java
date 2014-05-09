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
//        final List<Strawberry> strawberries = new ArrayList<Strawberry>();
        //for each loop
//        for (Byte id : ids) {
//            if (id > 1)
//                continue;
//            strawberries.add(new StrawberryBrownies());
//        }
        return createBrownies(ids.size());
//        return strawberries;
    }

    private List<Strawberry> createBrownies(int size) {
        //size = 3
        final List<Strawberry> strawberries = new ArrayList<Strawberry>();
        //for(initialization;evaluation;increment)
//        for (;strawberries.size() < size;) {
//        for (int i = 1; i <= size; i++) {
//            logger.debug("value of i: {}" , i);
//            strawberries.add(new StrawberryBrownies());
//        }
//        logger.debug("Strawberries size : {}", strawberries.size());
        while (strawberries.size() < size) {
            strawberries.add(new StrawberryBrownies());
        }
//        logger.debug("Strawberries size : {}", strawberries.size());
//        do {
//            strawberries.add(new StrawberryBrownies());
//        }
//        while (strawberries.size() < size);
//        logger.debug("Strawberries size : {}", strawberries.size());
        return strawberries;
    }
}
