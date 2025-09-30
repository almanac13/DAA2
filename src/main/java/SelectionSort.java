public class SelectionSort {

    private long comparisons = 0; // total comparisons
    private long swaps = 0;       // total swaps
    private double timeMillis = 0; // execution time in milliseconds

    /**
     * Sorts the given array using Selection Sort.
     * Tracks comparisons, swaps, and execution time.
     * @param array the array to sort
     */
    public void sort(int[] array) {
        if (array == null) {
            throw new IllegalArgumentException("Input array cannot be null");
        }

        long startTime = System.nanoTime(); // start timing
        int n = array.length;

        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;

            for (int j = i + 1; j < n; j++) {
                comparisons++;
                if (array[j] < array[minIndex]) {
                    minIndex = j;
                }
            }

            if (minIndex != i) {
                swap(array, i, minIndex);
            }
        }

        long endTime = System.nanoTime();
        timeMillis = (endTime - startTime) / 1_000_000.0; // convert to milliseconds
    }

    /**
     * Swaps two elements in the array and counts the swap.
     */
    private void swap(int[] array, int i, int j) {
        swaps++;
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    // Getters for metrics
    public long getComparisons() {
        return comparisons;
    }

    public long getSwaps() {
        return swaps;
    }

    public double getTimeMillis() {
        return timeMillis;
    }

    /** Utility method to print an array */
    public static void printArray(int[] array) {
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
