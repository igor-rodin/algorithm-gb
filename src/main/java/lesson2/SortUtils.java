package lesson2;

class SortUtils {
    static void directSort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int index = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[index]) {
                    index = j;
                }
            }
            if (index != i) {
                int buf = array[i];
                array[i] = array[index];
                array[index] = buf;
            }
        }
    }

    static void quickSort(int[] array) {
        quickSort(array, 0, array.length - 1);
    }

    static void quickSort(int[] array, int startPosition, int endPosition) {
        int left = startPosition;
        int right = endPosition;
        int middle = array[(left + right) / 2];

        do {
            while (array[left] < middle) {
                left++;
            }
            while (array[right] > middle) {
                right--;
            }
            if (left <= right) {
                if (left < right) {
                    int buf = array[left];
                    array[left] = array[right];
                    array[right] = buf;
                }
                left++;
                right--;
            }
        }
        while (left <= right);
        if (left < endPosition) {
            quickSort(array, left, endPosition);
        }
        if (startPosition < right) {
            quickSort(array, startPosition, right);
        }
    }

}
