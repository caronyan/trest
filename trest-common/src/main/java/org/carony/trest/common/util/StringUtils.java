package org.carony.trest.common.util;

import java.util.Map;
import java.util.stream.Collectors;

/**
 * @author Caronyan
 * @date 2019-06-12
 */
public class StringUtils {

    /**
     * generate url param string from param map
     *
     * @param paramMap key-value of params
     * @return param string
     */
    public static String getUrlParamStrFromMap(Map<String, String> paramMap) {
        return paramMap.entrySet().isEmpty() ? ""
            : ("?" + String.join("&",
                paramMap.entrySet().stream()
                    .map(paramMapEntry -> String.format("%s=%s", paramMapEntry.getKey(), paramMapEntry.getValue()))
                    .collect(Collectors.toList())));
    }

}
