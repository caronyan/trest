package org.carony.trest.algo.sort;

import java.util.Arrays;

import org.carony.trest.algo.common.constants.SortOrder;
import org.carony.trest.algo.common.data.SortTestData;
import org.junit.Assert;
import org.junit.Test;

/**
 * Tests for bubble sort
 *
 * @author Caronyan
 * @date 2019-06-19
 */
public class BubbleSortTest {

    @Test
    public void bubbleSort() {
        int[] unsortedList = SortTestData.UNSORTED_SAMLE_A;
        int[] sortedList = BubbleSort.bubbleSort.sort(unsortedList, SortOrder.ASC);
        Object[] origin = {sortedList};
        Object[] newList = {new int[]{2, 3, 4, 5, 6}};
        Assert.assertTrue(Arrays.deepEquals(origin, newList));
    }

}