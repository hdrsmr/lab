package id.co.quadras.strawberryshop.worker;

import id.co.quadras.strawberryshop.Strawberry;

import java.util.List;

/**
 * Created by achmad on 5/8/2014.
 */
public interface Worker {
    List<Strawberry> work(List<Byte> ids);
}
