package lesson2;

class SearchUtils {
    static int binarySearch(int[] array, int value) {
        return binarySearch(array, value, 0, array.length - 1);
    }

    static int binarySearch(int[] array, int value, int min, int max) {
        if (max < min) return -1;
        int middle = (min + max) / 2;
        if (array[middle] == value) {
            return middle;
        } else if (array[middle] > value) {
            return binarySearch(array, value, min, middle - 1);
        } else {
            return binarySearch(array, value, middle + 1, max);
        }
    }
}
