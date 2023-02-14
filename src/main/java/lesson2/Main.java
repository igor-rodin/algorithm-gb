package lesson2;

import java.util.Arrays;

public class Main {

    public static final int ARRAY_SIZE = 20_000;

    public static void main(String[] args) {
        int[] arr = new int[] {4, 1, 3, 9, 7, -9};
        ArrayUtils.printArray(arr);
        SortUtils.heapSort(arr);
        ArrayUtils.printArray(arr);

        int[] testArray = ArrayUtils.prepareArray(ARRAY_SIZE);

        System.out.printf("Размер массива: %d\n", ARRAY_SIZE);
        long startTime = System.currentTimeMillis();
        SortUtils.directSort(testArray.clone());
        long endTime = System.currentTimeMillis();
        long processingTime = endTime - startTime;
        System.out.printf("Время работы сортировки выбором: %d мс.\n", processingTime);

        startTime = System.currentTimeMillis();
        SortUtils.quickSort(testArray.clone());
        endTime = System.currentTimeMillis();
        processingTime = endTime - startTime;
        System.out.printf("Время работы быстрой сортировки: %d мс.\n", processingTime);

        startTime = System.currentTimeMillis();
        SortUtils.heapSort(testArray.clone());
        endTime = System.currentTimeMillis();
        processingTime = endTime - startTime;
        System.out.printf("Время работы пирамидальной сортировки: %d мс.\n", processingTime);

//        testArray = new int[]{9, -10, 100, 22, -5, -5, 0, 9, 22, 13};
//        ArrayUtils.printArray(testArray);
//        SortUtils.quickSort(testArray);
//        ArrayUtils.printArray(testArray);
//        int res01 = SearchUtils.binarySearch(testArray, 13);
//        System.out.printf("Элемент %d %s\n",
//                13, res01 >= 0 ? String.format("найден в массиве по индексу %d", res01) :
//                        "не найден в массиве");
//
//        testArray = new int[]{9, -10, 100, 22, -5, -5, 0, 9, 22, 13};
//        Arrays.sort(testArray);
//        ArrayUtils.printArray(testArray);
//        int res02 = Arrays.binarySearch(testArray, 13);
//        System.out.printf("Элемент %d %s\n",
//                13, res02 >= 0 ? String.format("найден в массиве по индексу %d", res02) :
//                        "не найден в массиве");

    }

}
