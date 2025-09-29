import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class SelectionSortTest {

    @Test
    void testEmptyArray() {
        int[] arr = {};
        SelectionSort sorter = new SelectionSort();
        sorter.sort(arr);
        assertArrayEquals(new int[]{}, arr);
    }

    @Test
    void testSingleElement() {
        int[] arr = {5};
        SelectionSort sorter = new SelectionSort();
        sorter.sort(arr);
        assertArrayEquals(new int[]{5}, arr);
    }

    @Test
    void testDuplicates() {
        int[] arr = {3, 2, 2, 1};
        SelectionSort sorter = new SelectionSort();
        sorter.sort(arr);
        assertArrayEquals(new int[]{1, 2, 2, 3}, arr);
    }

    @Test
    void testAlreadySorted() {
        int[] arr = {1, 2, 3, 4};
        SelectionSort sorter = new SelectionSort();
        sorter.sort(arr);
        assertArrayEquals(new int[]{1, 2, 3, 4}, arr);
    }

    @Test
    void testReversed() {
        int[] arr = {5, 4, 3, 2, 1};
        SelectionSort sorter = new SelectionSort();
        sorter.sort(arr);
        assertArrayEquals(new int[]{1, 2, 3, 4, 5}, arr);
    }
}
