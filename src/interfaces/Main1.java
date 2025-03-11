package interfaces;

import java.util.ArrayList;
import java.util.Random;

public class Main1 {
    public static void main(String[] args) {

        Random random = new Random();
        for (int i = 0; i<100; i++) {
            int a = random.nextInt(10);
            System.out.println(a + " ");
        }


    }
}
