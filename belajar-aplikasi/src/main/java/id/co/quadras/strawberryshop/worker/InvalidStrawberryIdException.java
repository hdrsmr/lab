package id.co.quadras.strawberryshop.worker;

/**
 * Created by achmad on 5/9/2014.
 */
public class InvalidStrawberryIdException extends IllegalArgumentException {
    public InvalidStrawberryIdException() {
        super("ID GAK VALID BUNG!");
    }
}
