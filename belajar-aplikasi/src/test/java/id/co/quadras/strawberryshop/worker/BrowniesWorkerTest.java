package id.co.quadras.strawberryshop.worker;

import id.co.quadras.strawberryshop.Strawberry;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class BrowniesWorkerTest {

    @Test
    public void testWork() throws Exception {
        final ArrayList<Byte> ids = new ArrayList<Byte>();
        ids.add((byte) 1);
        ids.add((byte) 1);
        ids.add((byte) 1);
        final List<Strawberry> strawberries = new BrowniesWorker().work(ids);
        assertThat(strawberries).hasSize(3);
    }
}