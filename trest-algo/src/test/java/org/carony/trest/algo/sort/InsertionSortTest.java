package org.carony.trest.algo.sort;

import java.util.Arrays;

import org.carony.trest.algo.common.constants.SortOrder;
import org.carony.trest.algo.common.data.SortTestData;
import org.junit.Assert;
import org.junit.Test;

/**
 * @author Caronyan
 * @date 2019-06-28
 */
public class InsertionSortTest {

    @Test
    public void insertionSortAsc() {
        int[] unsortedList = SortTestData.UNSORTED_SAMLE_A;
        int[] sortedList = InsertionSort.insertionSort.sort(unsortedList, SortOrder.ASC);
        Object[] origin = {sortedList};
        Object[] newList = {SortTestData.SORTED_SAMPLE_A_ASC};
        Assert.assertTrue(Arrays.deepEquals(origin, newList));
    }
}