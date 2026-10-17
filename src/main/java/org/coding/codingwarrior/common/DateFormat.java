package org.coding.codingwarrior.common;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author nageshasriramappa
 **/
public class DateFormat {

    public static void main(String[] args) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("MM-dd-yy");
        System.out.println(simpleDateFormat.format(new Date()));
    }
}
