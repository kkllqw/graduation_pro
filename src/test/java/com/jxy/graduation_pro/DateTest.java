package com.jxy.graduation_pro;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateTest {
    public static void main(String[] args) throws ParseException {
        Date date =new Date();
        System.out.println(date);
        Calendar calendar = Calendar.getInstance();
        int x = calendar.get(Calendar.YEAR);
        System.out.println(x);
        System.out.println(calendar.get(Calendar.MONTH));
        System.out.println(calendar.get(Calendar.DAY_OF_MONTH));
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        String format = simpleDateFormat.format(date);
        System.out.println(format);
        System.out.println(simpleDateFormat.parse(format));
    }
}
