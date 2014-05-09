package id.co.quadras.training;

import id.co.quadras.strawberryshop.Cashier;
import org.assertj.core.api.Assertions;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.Test;

import java.util.ArrayList;

/**
 * Created by achmad on 5/7/2014.
 */
public class BelajarTipeData {
    private final Logger logger = LoggerFactory.getLogger(getClass());

    @Test
    public void belajarBilanganBulat() {
        byte byteValue = 1;
        short shortValue = 2;
        int intValue = 3;
        long longValue = 4;
        byte[] arrayOfByte = new byte[6];
        arrayOfByte[0] = 1;
        arrayOfByte[1] = 1;
        arrayOfByte[2] = 1;
        arrayOfByte[3] = 1;
        arrayOfByte[4] = 1;
        byte[][] multiDimensionArray = new byte[1][2];
        logger.info("byte value: " + byteValue);
        logger.info("short value: " + shortValue);
        logger.info("int value: " + intValue);
        logger.info("long value: " + longValue);
        float f = Float.MAX_VALUE;
    }

    @Test
    public void arrayType() {
        byte[] elements = {};

    }

    @Test
    public void parse() {
        int a = Integer.parseInt("1");
        Assertions.assertThat(a).isEqualTo(1);
//        throw new Cashier();
//        throw new IllegalArgumentException("coba-coba exception");
    }

    @Test
    public void parseFalsy() {
        // Exception handling
        try {
            int a = Integer.parseInt("t");
            Assertions.assertThat(a).isEqualTo(1);
            throw new  IllegalArgumentException();
        } /*catch (NumberFormatException e) {
            logger.debug("terjadi kesalahan format angka");
        } */catch (IllegalArgumentException e) {
            logger.debug("terjadi kesalahan argument: {}", e.getMessage());
        } catch (Exception e) {
            logger.debug("terjadi kesalahan yang tidak diketahui");
        } finally {
            logger.debug("Apapun yang terjadi, ini akan dicetak");
            System.out.println("bla bla bla");
        }
    }
}
