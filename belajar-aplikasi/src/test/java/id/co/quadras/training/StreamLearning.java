package id.co.quadras.training;

import org.testng.annotations.Test;

import java.io.IOException;

/**
 * Created by achmad on 5/9/2014.
 */
public class StreamLearning {
    @Test
    public void getInputFromConsole() {
        try {
            final int read = System.in.read();
            System.out.println("from user: " + read);
            System.exit(0);
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }

    public static void main(String[] args) {
        try {
            final int read = System.in.read();
            System.out.println("from user: " + (char)read);
            System.exit(0);
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
