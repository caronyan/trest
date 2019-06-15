package org.carony.trest.common.util;

import org.junit.Assert;
import org.junit.Test;

import java.util.Date;

/**
 * Tests for Date time Toolbox
 *
 * @author Caronyan
 * @date 2019-06-15
 */
public class DateTimeUtilsTest {

    /**
     * time stamp of "2019-06-15 03:06:09"
     */
    private static final long SAMPLE_TIME_STAMP = 1560539169L;

    /**
     * Java Date of "2019-06-15 03:06:09"
     */
    private static final Date SAMPLE_DATE_TIME = new Date(SAMPLE_TIME_STAMP * 1000);

    /**
     * Java Date of "2019-06-15 00:00:00"
     */
    private static final Date SAMPLE_DATE = new Date(1560528000L * 1000);

    /**
     * Java Date of "2019-06-15 23:59:59"
     */
    private static final Date SAMPLE_DATE_END = new Date(1560614399L * 1000);

    @Test
    public void unixTime2DateStr() {
        String dateStr = DateTimeUtils.unixTime2DateStr(SAMPLE_TIME_STAMP);
        Assert.assertEquals("2019-06-15", dateStr);
    }

    @Test
    public void unixTime2DateTmeStr() {
        String dateTimeStr = DateTimeUtils.unixTime2DateTmeStr(SAMPLE_TIME_STAMP);
        Assert.assertEquals("2019-06-15 03:06:09", dateTimeStr);
    }

    @Test
    public void unixTime2DateCompactStr() {
        String dateCompactStr = DateTimeUtils.unixTime2DateCompactStr(SAMPLE_TIME_STAMP);
        Assert.assertEquals("20190615", dateCompactStr);
    }

    @Test
    public void date2UnixTime() {
        long unixTime =  DateTimeUtils.date2UnixTime(SAMPLE_DATE_TIME);
        Assert.assertEquals(SAMPLE_TIME_STAMP, unixTime);
    }

    @Test
    public void unixTime2Date() {
        Date date = DateTimeUtils.unixTime2Date(SAMPLE_TIME_STAMP);
        Assert.assertEquals(SAMPLE_DATE_TIME, date);
    }

    @Test
    public void compactStr2Date() {
        Date date = DateTimeUtils.compactStr2Date("20190615");
        Assert.assertEquals(SAMPLE_DATE, date);
    }

    @Test
    public void dateStr2Date() {
        Date date = DateTimeUtils.dateStr2Date("2019-06-15");
        Assert.assertEquals(SAMPLE_DATE, date);
    }

    @Test
    public void dateTimeStr2Date() {
        Date date = DateTimeUtils.dateTimeStr2Date("2019-06-15 03:06:09");
        Assert.assertEquals(SAMPLE_DATE_TIME, date);
    }

    @Test
    public void getStartOfDate() {
        Date startDate = DateTimeUtils.getStartOfDate(SAMPLE_DATE_TIME);
        Assert.assertEquals(SAMPLE_DATE, startDate);
    }

    @Test
    public void getEndOfDate() {
        Date endDate = DateTimeUtils.getEndOfDate(SAMPLE_DATE_TIME);
        Assert.assertEquals(SAMPLE_DATE_END, endDate);
    }
}
