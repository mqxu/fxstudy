package com.niit.fxstudy.utils;

import cn.hutool.core.date.*;
import cn.hutool.core.io.FileTypeUtil;
import cn.hutool.core.io.FileUtil;
import cn.hutool.core.lang.Console;

import java.io.File;
import java.util.Calendar;
import java.util.Date;

public class HutoolUtilTest {
    public static void main(String[] args) {
        //文件工具使用
        File file = FileUtil.file("d:/test.png");
        String type = FileTypeUtil.getType(file);
        Console.log(type);


        //日期时间工具使用
        Date date = DateUtil.date();
        Console.log(date);
        Date date2 = DateUtil.date(Calendar.getInstance());
        Console.log(date2);
        Date date3 = DateUtil.date(System.currentTimeMillis());
        Console.log(date3);
        String now = DateUtil.now();
        Console.log(now);
        String today = DateUtil.today();
        Console.log(today);
        DateTime dateTime = new DateTime("2018-11-18 12:34:23", DatePattern.NORM_DATETIME_FORMAT);
        int year = dateTime.year();
        Season season = dateTime.seasonEnum();
        Month month = dateTime.monthEnum();
        int day = dateTime.dayOfMonth();
        System.out.println(year+"年"+month+"月"+day+"日");
        System.out.println(season);
    }
}
