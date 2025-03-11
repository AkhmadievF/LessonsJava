import interfaces.Timer;

import java.util.Random;

public class Main {
    static int randomValue;
    static boolean isTrueValue = false;
    public static void main(String[] args) {

        Random random = new Random();
        randomValue = random.nextInt(0, 1_000_000_000);
        System.out.println(randomValue);


        Thread guessValue = new Thread(new Runnable() {
            @Override
            public void run() {

                while (!isTrueValue) {
                    int trueValue = random.nextInt(0, 1_000_000_000);
                    if (randomValue == trueValue) {
                        isTrueValue = true;
                        System.out.println("Загаданное число: " + randomValue + ", отгаданное число: " + trueValue);
                    }
                }

            }
        });
        guessValue.start();


        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 600; i++) {
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    if (isTrueValue) {
                        System.out.println("Я угадал ваше число за: " + i + " секунд");
                        return;
                    }
                    System.out.println(i);
                }
            }
        });
        thread.start();


        }
    }



