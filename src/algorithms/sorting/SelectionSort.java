package algorithms.sorting;

public class SelectionSort {
    /*
     * Selection sort works while selecting the largest element and putting that in
     * the last.
     * 
     * Worst-case : O(n^2) Unstable Sort and it's in-place.
     */

    public static void main(String[] args) {

        final int[] array = utils.Utilities.getGeneratedIntArray(10);

        System.out.println("Unsorted Array -->");
        utils.Utilities.printArray(array);

        System.out.println();

        // Calling selectionSorter

        final int[] sortedArray = sortArrayUsingSelectionSort(array);

        System.out.println("Sorted Array -->");
        utils.Utilities.printArray(sortedArray);
    }

    public static int[] sortArrayUsingSelectionSort(int[] givenArray) {

        /* Selection sort is in-place sorting algorithm and it's unstable */

        for (int lastUnsortedIndex = givenArray.length - 1; lastUnsortedIndex >= 0; lastUnsortedIndex--) {
            int max = givenArray[0];
            int maxIndexHolder = 0;
            for (int i = 1; i <= lastUnsortedIndex; i++) {
                if (max < givenArray[i]) {
                    max = givenArray[i];
                    maxIndexHolder = i;
                }
            }
            // Less swapping than Bubble Sort.
            utils.Utilities.swapper(givenArray, maxIndexHolder, lastUnsortedIndex);
        }
        return givenArray;
    }

}
