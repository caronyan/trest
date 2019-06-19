package org.carony.trest.algo.sort;

import java.util.List;

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
     * @param originalList original list to be sorted
     * @param sortOrder sort order
     * @return sorted list
     */
    List<? extends Number> sort(List<? extends Number> originalList, SortOrder sortOrder);
}
