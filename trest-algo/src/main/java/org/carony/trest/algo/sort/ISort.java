package org.carony.trest.algo.sort;

import org.carony.trest.algo.common.constants.SortOrder;

/**
 * generic sort interface
 *
 * @author Caronyan
 * @date 2019-06-19
 */
@FunctionalInterface
public interface ISort {
    /**
     * generic sort interface
     *
     * @param originalList original list to be sorted
     * @param sortOrder sort order
     * @return sorted list
     */
    int[] sort(int[] originalList, SortOrder sortOrder);
}
