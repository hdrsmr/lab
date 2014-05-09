package id.co.quadras.strawberryshop.worker;

import id.co.quadras.strawberryshop.Strawberry;
import id.co.quadras.strawberryshop.StrawberryConstants;
import org.assertj.core.api.Assertions;
import org.assertj.core.api.Condition;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.testng.Assert.*;

/**
 * Unit test for JuiceWorker
 */
public class JuiceWorkerTest {
    final JuiceWorker juiceWorker = new JuiceWorker();

    @Test
    public void standartStrawberryOnly() throws Exception {
        final List<Strawberry> strawberries = juiceWorker.work(Arrays.asList((byte) 1, (byte) 1));
        assertThat(strawberries).hasSize(2);
        assertThat(strawberries).areExactly(2, new Condition<Strawberry>() {
            @Override
            public boolean matches(Strawberry value) {
                return StrawberryConstants.STANDART_STRAWBERRY_DRINK == value.getId();
            }
        });
    }

    @Test(expectedExceptions = InvalidStrawberryIdException.class)
    public void raiseException() {
        juiceWorker.work(Arrays.asList((byte) -1));
    }

    @Test(/*expectedExceptions = InvalidStrawberryIdException.class*/)
    public void raiseExceptionWithHandling() {
        try {
            juiceWorker.work(Arrays.asList((byte) -1));
        }catch (InvalidStrawberryIdException e){
            System.out.println("MOHON PILIH ID YANG BENAR!");
        }
    }

    @Test(/*expectedExceptions = InvalidStrawberryIdException.class*/)
    public void raiseExceptionWrong() {
        juiceWorker.work(Arrays.asList((byte) 9));
    }


    @Test
    public void standartStrawberryAndMilkStrawberry() throws Exception {
        final List<Strawberry> strawberries = juiceWorker.work(Arrays.asList((byte) 1, (byte) 2));
        assertThat(strawberries).hasSize(2);
        assertThat(strawberries).areExactly(1, new Condition<Strawberry>() {
            @Override
            public boolean matches(Strawberry value) {
                return StrawberryConstants.STANDART_STRAWBERRY_DRINK == value.getId();
            }
        });
        assertThat(strawberries).areExactly(1, new Condition<Strawberry>() {
            @Override
            public boolean matches(Strawberry value) {
                return StrawberryConstants.MILK_STRAWBERRY_DRINK == value.getId();
            }
        });
    }

    @Test
    public void standartStrawberryAndMilkStrawberryAndChoco(){
        final List<Strawberry> strawberries = juiceWorker.work(Arrays.asList((byte) 1, (byte) 2, (byte) 3));
        assertThat(strawberries).hasSize(3);
        assertThat(strawberries).areExactly(1, new Condition<Strawberry>() {
            @Override
            public boolean matches(Strawberry value) {
                return StrawberryConstants.STANDART_STRAWBERRY_DRINK == value.getId();
            }
        });
        assertThat(strawberries).areExactly(1, new Condition<Strawberry>() {
            @Override
            public boolean matches(Strawberry value) {
                return StrawberryConstants.MILK_STRAWBERRY_DRINK == value.getId();
            }
        });
        assertThat(strawberries).areExactly(1, new Condition<Strawberry>() {
            @Override
            public boolean matches(Strawberry value) {
                return StrawberryConstants.CHOCHOLATE_TOPPING_STRAWBERRY_DRINK == value.getId();
            }
        });
    }
}