import java.util.Random;

public class BenchmarkRunner {
    public static void main(String[] args) {
        int[] sizes = {100, 1000, 10000, 100000}; // input sizes
        String[] types = {"random", "sorted", "reversed", "nearly-sorted"};

        for (int size : sizes) {
            for (String type : types) {
                int[] array = generateArray(size, type);
                SelectionSort sorter = new SelectionSort();
                sorter.sort(array);

                System.out.println("Size: " + size + ", Type: " + type);
                System.out.println("Comparisons: " + sorter.getComparisons());
                System.out.println("Swaps: " + sorter.getSwaps());
                System.out.println("Time: " + sorter.getTimeMillis() + " ms");
                System.out.println("---------------------------");
            }
        }
    }

    private static int[] generateArray(int n, String type) {
        int[] array = new int[n];
        Random random = new Random();

        switch (type) {
            case "random":
                for (int i = 0; i < n; i++) array[i] = random.nextInt(100);
                break;
            case "sorted":
                for (int i = 0; i < n; i++) array[i] = i;
                break;
            case "reversed":
                for (int i = 0; i < n; i++) array[i] = n - i;
                break;
            case "nearly-sorted":
                for (int i = 0; i < n; i++) array[i] = i;
                for (int i = 0; i < n / 10; i++) { // swap 10% elements randomly
                    int j = random.nextInt(n);
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
                break;
        }
        return array;
    }
}
