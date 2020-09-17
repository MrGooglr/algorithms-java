package algorithms.sorting;


public class BubbleSort {
    /*
     * The alogorithm do work in asscending order here We are going to bubble up the
     * larger elements to the top (or to the right) of a given array data structure.
     * 
     * Time complexity Worst-Case : O(n^2) Stability : Bubble sort is a Stable
     * algorithm as duplicate items preserve the position after sort.
     */

    public static void main(String[] args) {

        final int[] array = utils.Utilities.getGeneratedIntArray(10);

        System.out.println("Unsorted Array -->");
        utils.Utilities.printArray(array);

        System.out.println();

        // Calling bubbleSorter

        final int[] sortedArray = sortArrayUsingBubbleSort(array);

        System.out.println("Sorted Array -->");
        utils.Utilities.printArray(sortedArray);
    }

    public static int[] sortArrayUsingBubbleSort(int[] givenArray) {
        /*
         * As Bubble Sort is an in-place sort, one array is sufficient. Iterations are
         * needed to be done per element hence n^2 is the complexity
         */

        for (int i = 0; i < givenArray.length; i++) {
            for (int j = 0; j < givenArray.length - (i + 1); j++) {
                // Just because we're not using >= it's stable.
                if (givenArray[j] > givenArray[j + 1]) {
                    utils.Utilities.swapper(givenArray, j, j + 1);
                }
            }
        }
        return givenArray;
    }

}
