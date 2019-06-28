package org.carony.trest.algo.sort;

/**
 * insertion sort
 *
 * @author Caronyan
 * @date 2019-06-18
 */
public class InsertionSort {

    /**
     * implementation of insertion sort
     */
    public static ISort insertionSort = (originalList, sortOrder) -> {

        for (int i = 1; i < originalList.length; i++) {
            if (originalList[i-1] > originalList[i]) {
                int key = originalList[i];
                int j = i;
                while (j > 0 && originalList[j-1] > key) {
                    originalList[j] = originalList[j-1];
                    j--;
                }
                originalList[j] = key;
            }
        }

        return originalList;
    };
}
