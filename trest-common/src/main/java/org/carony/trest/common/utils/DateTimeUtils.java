package org.carony.trest.common.utils;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
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
     * get "yyyy-MM-dd" format date string from specific time stamp
     *
     * @param timeStamp specific time stamp
     * @return date string
     */
    public static String unixTime2DateStr(int timeStamp) {
        LocalDateTime dateTime = LocalDateTime.ofInstant(Instant.ofEpochSecond(timeStamp), ZoneId.systemDefault());
        return dateTime.format(DATE_FORMATTER);
    }

    /**
     * get "yyyy-MM-dd HH:mm:ss" format date time string from specific time stamp
     *
     * @param timeStamp specific time stamp
     * @return date time string
     */
    public static String unixTime2DateTmeStr(int timeStamp) {
        LocalDateTime dateTime = LocalDateTime.ofInstant(Instant.ofEpochSecond(timeStamp), ZoneId.systemDefault());
        return dateTime.format(DATE_TIME_FORMATTER);
    }

    /**
     * get start of specific date
     * ex.yyyy-MM-dd 00:00:00
     *
     * @param date specific date
     * @return start of specific date
     */
    public static Date getStartOfDate(Date date) {
        LocalDateTime dateTime =
                LocalDateTime.ofInstant(Instant.ofEpochSecond(date.getTime()), ZoneId.systemDefault());
        LocalDateTime startOfDate = dateTime.with(LocalTime.MIN);
        return Date.from(startOfDate.atZone(ZoneId.systemDefault()).toInstant());
    }

    /**
     * get end of specific date
     * ex.yyyy-MM-dd 23:59:59
     *
     * @param date specific date
     * @return end of specific date
     */
    public static Date getEndOfDate(Date date) {
        LocalDateTime dateTime =
                LocalDateTime.ofInstant(Instant.ofEpochSecond(date.getTime()), ZoneId.systemDefault());
        LocalDateTime startOfDate = dateTime.with(LocalTime.MAX);
        return Date.from(startOfDate.atZone(ZoneId.systemDefault()).toInstant());
    }
}
