
    /**
     * SelectionSort class implements the Selection Sort algorithm.
     * It tracks comparisons, swaps, and execution time in milliseconds.
     */
    public class SelectionSort {

        private int comparisons = 0;
        private int swaps = 0;
        private double timeMillis = 0; // execution time in milliseconds

        /**
         * Sorts the given array using Selection Sort and measures execution time.
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

            long endTime = System.nanoTime(); // end timing
            timeMillis = (endTime - startTime) / 1_000_000.0; // convert to ms
        }

        private void swap(int[] array, int i, int j) {
            swaps++;
            int temp = array[i];
            array[i] = array[j];
            array[j] = temp;
        }

        public int getComparisons() {
            return comparisons;
        }

        public int getSwaps() {
            return swaps;
        }

        public double getTimeMillis() {
            return timeMillis;
        }

        public static void printArray(int[] array) {
            for (int num : array) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }


