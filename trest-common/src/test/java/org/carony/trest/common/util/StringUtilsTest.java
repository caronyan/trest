package org.carony.trest.common.util;

import java.util.HashMap;
import java.util.Map;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author Caronyan
 * @date 2019-06-17
 */
public class StringUtilsTest {

    @Test
    public void getUrlParamStrFromMap() {
        Map<String, String> paramMap = new HashMap<>(2);
        paramMap.put("param1", "1");
        paramMap.put("param2", "2");
        String paramStr = StringUtils.getUrlParamStrFromMap(paramMap);
        Assert.assertEquals("?param1=1&param2=2", paramStr);
    }
}