package id.co.quadras.training;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * Created by achmad on 5/9/2014.
 */
public class ReadFromFile {
    public static void main(String[] args) {
        BufferedReader in2 = null;
        try {
            in2 = new BufferedReader(
                    new FileReader(args[0]));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        String s2;
        StringBuffer sb = new StringBuffer();
        try {
            while ((s2 = in2.readLine()) != null)
                sb.append(s2).append('\n');
            System.out.println(sb.toString());
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (null != in2)
                    in2.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}
