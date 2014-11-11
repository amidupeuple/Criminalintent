package com.example.criminalintent;

import org.junit.Assert;
import org.junit.Test;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class CrimeTest {

    @Test
    public void testParsing() throws Exception {
        DateFormat f = DateFormat.getDateInstance();
        Date d = f.parse("Tue Nov 11 18:33:09 GMT+03:00 2014");
        System.out.print(d.getTime());
    }
}