package lesson2;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr = ArrayUtils.prepareArray();

        ArrayUtils.printArray(arr);
        SortUtils.directSort(arr);
        ArrayUtils.printArray(arr);


        arr = ArrayUtils.prepareArray();
        ArrayUtils.printArray(arr);
        SortUtils.quickSort(arr);
        ArrayUtils.printArray(arr);

        int[] testArray = ArrayUtils.prepareArray(100000);
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

        testArray = new int[]{9, -10, 100, 22, -5, -5, 0, 9, 22, 13};
        ArrayUtils.printArray(testArray);
        SortUtils.quickSort(testArray);
        ArrayUtils.printArray(testArray);
        int res01 = SearchUtils.binarySearch(testArray, 13);
        System.out.printf("Элемент %d %s\n",
                13, res01 >= 0 ? String.format("найден в массиве по индексу %d", res01) :
                        "не найден в массиве");

        testArray = new int[]{9, -10, 100, 22, -5, -5, 0, 9, 22, 13};
        Arrays.sort(testArray);
        ArrayUtils.printArray(testArray);
        int res02 = Arrays.binarySearch(testArray, 13);
        System.out.printf("Элемент %d %s\n",
                13, res02 >= 0 ? String.format("найден в массиве по индексу %d", res02) :
                        "не найден в массиве");

    }

}
