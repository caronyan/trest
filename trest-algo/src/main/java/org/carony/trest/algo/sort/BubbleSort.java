package org.carony.trest.algo.sort;

/**
 * bubble sort
 *
 * @author Caronyan
 * @date 2019-06-18
 */
public class BubbleSort {

    /**
     * implementation of bubble sort
     */
    public static ISort bubbleSort = (originalList, sortOrder) -> {
        for (int i = 0; i < originalList.length; i++) {
            for (int j = 0; j < originalList.length - 1 - i; j++) {
                if (originalList[j] > originalList[j + 1]) {
                    int temp = originalList[j];
                    originalList[j] = originalList[j+1];
                    originalList[j+1] = temp;
                }
            }
        }
        return originalList;
    };

}
