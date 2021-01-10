package algorithms.sorting;

public class InsertionSort {
    /*
     * Insertion sort works with logic that we need to insert the appropriate
     * unsorted values to the sorted partion. We initially assume to be the arr[0]
     * as sorted partion and arr[1] to arr[arr.length] in unsorted partion. We make
     * sorted partion grow with each iteration.
     * 
     * Worst-case : O(n^2) Stable Sort and it's in-place.
     */

    public static void main(String[] args) {

        final int[] array = utils.Utilities.getGeneratedIntArray(10);

        System.out.println("Unsorted Array -->");
        utils.Utilities.printArray(array);

        System.out.println();

        // Calling selectionSorter

        final int[] sortedArray = sortArrayUsingInsertionSort(array);

        System.out.println("Sorted Array -->");
        utils.Utilities.printArray(sortedArray);
    }

    public static int[] sortArrayUsingInsertionSort(int[] givenArray) {

        /* Insertion sort is in-place sorting algorithm and it's stable */

        for (int firstUnsortedIndex = 1; firstUnsortedIndex < givenArray.length; firstUnsortedIndex++) {

            int temp = givenArray[firstUnsortedIndex];

            int sortedPortion;

            for (sortedPortion = firstUnsortedIndex; sortedPortion > 0
                    && givenArray[sortedPortion - 1] > temp; sortedPortion--) {
                givenArray[sortedPortion] = givenArray[sortedPortion - 1];
            }
            givenArray[sortedPortion] = temp;
        }

        return givenArray;
    }
}
