package com.csist.class16cchun.mymediaplayer;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 时间工具类
 * Created by admin on 2017/11/30.
 */

public class DateUtils {
    /**
     * 获取系统当前时间
     * @return yyyy-MM-dd HH:mm:ss 时间
     */
    public static String getDate() {
        Date currentTime = new Date();
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String dateString = dateFormat.format(currentTime);
        return dateString;
    }

    /**
     * 获取系统当前日期
     * @return yyyy-MM-dd 日期
     */
    public static String getDay() {
        Date currentTime = new Date();
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        String dateString = dateFormat.format(currentTime);

        return dateString;
    }
}
