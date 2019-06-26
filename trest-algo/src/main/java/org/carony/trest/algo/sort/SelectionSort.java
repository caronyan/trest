package org.carony.trest.algo.sort;

import org.carony.trest.algo.common.constants.SortOrder;

/**
 * selection sort
 *
 * @author Caronyan
 * @date 2019-06-18
 */
public class SelectionSort {

    /**
     * implementation of selection sort
     */
    public static ISort selectionSort = (originalList, sortOrder) -> {
        for (int i = 0; i < originalList.length; i++) {
            int elem = i;
            for (int j = i + 1; j < originalList.length; j++) {
                if ((originalList[j] < originalList[i] && sortOrder.equals(SortOrder.ASC))
                    || (originalList[j] > originalList[i] && sortOrder.equals(SortOrder.DESC))) {
                    elem = j;
                }
            }

            if (elem != i) {
                int temp = originalList[i];
                originalList[i] = originalList[elem];
                originalList[elem] = temp;
            }
        }
        return originalList;
    };
}
