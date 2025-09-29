import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int n = scanner.nextInt();

        int[] array = new int[n];
        Random random = new Random();
        for (int i = 0; i < n; i++) {
            array[i] = random.nextInt(100); // random numbers 0-99
        }

        System.out.print("Original array: ");
        SelectionSort.printArray(array);

        SelectionSort sorter = new SelectionSort();
        sorter.sort(array);

        System.out.print("Sorted array:   ");
        SelectionSort.printArray(array);

        System.out.println("Comparisons: " + sorter.getComparisons());
        System.out.println("Swaps: " + sorter.getSwaps());
        System.out.println("Time: " + sorter.getTimeMillis() + " ms");
    }//1
}
