package lesson2;

import java.util.Random;

class ArrayUtils {
    private static final Random random = new Random();

    static int[] prepareArray() {
        int[] array = new int[random.nextInt(16) + 5];
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100);
        }
        return array;
    }

    static int[] prepareArray(int length) {
        int[] array = new int[length];
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100);
        }
        return array;
    }

    static void printArray(int[] array) {
        for (int element : array) {
            System.out.printf("%d\t", element);
        }
        System.out.println();
    }

}
