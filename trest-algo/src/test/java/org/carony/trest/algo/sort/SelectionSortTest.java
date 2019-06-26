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
 * @date 2019-06-26
 */
public class SelectionSortTest {

    @Test
    public void selectionSortAsc() {
        int[] unsortedList = SortTestData.UNSORTED_SAMLE_A;
        int[] sortedList = SelectionSort.selectionSort.sort(unsortedList, SortOrder.ASC);
        Object[] origin = {sortedList};
        Object[] newList = {SortTestData.SORTED_SAMPLE_A_ASC};
        Assert.assertTrue(Arrays.deepEquals(origin, newList));
    }

    @Test
    public void selectionSortDesc() {
        int[] unsortedList = SortTestData.UNSORTED_SAMLE_A;
        int[] sortedList = SelectionSort.selectionSort.sort(unsortedList, SortOrder.DESC);
        Object[] origin = {sortedList};
        Object[] newList = {SortTestData.SORTED_SAMPLE_A_DESC};
        Assert.assertTrue(Arrays.deepEquals(origin, newList));
    }
}