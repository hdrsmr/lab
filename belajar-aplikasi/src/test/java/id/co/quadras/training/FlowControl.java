package id.co.quadras.training;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.Test;

/**
 * Created by achmad on 5/8/2014.
 */
public class FlowControl {
    private static final Logger logger = LoggerFactory.getLogger(FlowControl.class);

    @Test
    public void simple() {
        if (true)
            logger.debug("done");
        else
            logger.debug("else");
    }

    @Test
    public void nested() {
        if (true) {
            if (true)
                logger.debug("done");
            else
                logger.debug("another else in if");
        } else
            logger.debug("else");
    }

    @Test
    public void nestedAgain() {
        if (true) {
            if (false)
                logger.debug("done");
            else
                logger.debug("another else in if");
        } else
            logger.debug("else");
    }

    @Test
    public void callVararga() {
//        nonVarargs("a", "b", "b");
        useVarargs("a", "b", "c");
        useVarargs(1, "a", "b", "c");
//        useVarargs("a", "b", "c",1);
        useVarargs(new String[]{},9);
    }

    void nonVarargs(String a) {

    }

    void useVarargs(String... strings) {

    }

    void useVarargs(Integer a, String... strings) {

    }

//    void useVarargs(String... strings, Integer a) {
//
//    }

    void useVarargs(String[] strings, int i) {

    }


}
