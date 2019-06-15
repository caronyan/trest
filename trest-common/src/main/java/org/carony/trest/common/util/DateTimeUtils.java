package org.carony.trest.common.util;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Date;

/**
 * Date time Toolbox
 *
 * @author Caronyan
 * @date 2019-06-12
 */
public class DateTimeUtils {

    /**
     * formatter for date
     */
    private static final DateTimeFormatter DATE_FORMATTER = DateTimeFormatter.ofPattern("yyyy-MM-dd");

    /**
     * formatter for data time
     */
    private static final DateTimeFormatter DATE_TIME_FORMATTER = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

    /**
     * formatter for date compact
     */
    private static final DateTimeFormatter DATE_COMPACT_FORMATTER = DateTimeFormatter.ofPattern("yyyyMMdd");

    /**
     * get "yyyy-MM-dd" format date string from specific time stamp
     *
     * @param timeStamp specific time stamp
     * @return date string
     */
    public static String unixTime2DateStr(long timeStamp) {
        LocalDateTime dateTime = LocalDateTime.ofInstant(Instant.ofEpochSecond(timeStamp), ZoneId.systemDefault());
        return dateTime.format(DATE_FORMATTER);
    }

    /**
     * get "yyyy-MM-dd HH:mm:ss" format date time string from specific time stamp
     *
     * @param timeStamp specific time stamp
     * @return date time string
     */
    public static String unixTime2DateTmeStr(long timeStamp) {
        LocalDateTime dateTime = LocalDateTime.ofInstant(Instant.ofEpochSecond(timeStamp), ZoneId.systemDefault());
        return dateTime.format(DATE_TIME_FORMATTER);
    }

    /**
     * get "yyyyMMdd" format date string from specific time stamp
     *
     * @param timeStamp specific time stamp
     * @return date compact string
     */
    public static String unixTime2DateCompactStr(long timeStamp) {
        LocalDateTime dateTime = LocalDateTime.ofInstant(Instant.ofEpochSecond(timeStamp), ZoneId.systemDefault());
        return dateTime.format(DATE_COMPACT_FORMATTER);
    }

    /**
     * get unix timestamp from Java Date
     *
     * @param date specific date
     * @return unix timestamp
     */
    public static long date2UnixTime(Date date) {
        return date.getTime() / 1000;
    }

    /**
     * get Java Date from unix timestamp
     *
     * @param timeStamp unix timestamp
     * @return Java Date
     */
    public static Date unixTime2Date(long timeStamp) {
        return new Date(timeStamp * 1000);
    }

    /**
     * get Java Date from date compact string
     *
     * @param compactDateStr date compact string
     * @return Java Date
     */
    public static Date compactStr2Date(String compactDateStr) {
        LocalDate date = LocalDate.parse(compactDateStr, DATE_COMPACT_FORMATTER);
        return Date.from(date.atStartOfDay(ZoneId.systemDefault()).toInstant());
    }

    /**
     * get Java Date from date string
     *
     * @param dateStr date string
     * @return Java Date
     */
    public static Date dateStr2Date(String dateStr) {
        LocalDate date = LocalDate.parse(dateStr, DATE_FORMATTER);
        return Date.from(date.atStartOfDay(ZoneId.systemDefault()).toInstant());
    }

    /**
     * get Java Date from date time string
     *
     * @param dateTimeStr date time string
     * @return Java Date
     */
    public static Date dateTimeStr2Date(String dateTimeStr) {
        LocalDateTime dateTime = LocalDateTime.parse(dateTimeStr, DATE_TIME_FORMATTER);
        return Date.from(dateTime.atZone(ZoneId.systemDefault()).toInstant());
    }

    /**
     * get start of specific date
     * ex.1999-01-01 00:00:00
     *
     * @param date specific date
     * @return start of specific date
     */
    public static Date getStartOfDate(Date date) {
        LocalDateTime dateTime =
                LocalDateTime.ofInstant(Instant.ofEpochSecond(date.getTime() / 1000), ZoneId.systemDefault());
        LocalDateTime startOfDate = dateTime.with(LocalTime.MIN);
        return Date.from(startOfDate.atZone(ZoneId.systemDefault()).toInstant());
    }

    /**
     * get end of specific date
     * ex.1999-01-01 23:59:59
     *
     * @param date specific date
     * @return end of specific date
     */
    public static Date getEndOfDate(Date date) {
        LocalDateTime dateTime =
                LocalDateTime.ofInstant(Instant.ofEpochSecond(date.getTime() / 1000), ZoneId.systemDefault());
        // ignore nanos
        LocalDateTime endOfDate = dateTime.with(LocalTime.MAX).truncatedTo(ChronoUnit.SECONDS);
        return Date.from(endOfDate.atZone(ZoneId.systemDefault()).toInstant());
    }

}
