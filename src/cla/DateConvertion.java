/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cla;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author Acer 4738
 */
public class DateConvertion {
    public static String convertDate(String date, String fromPattern, String toPattern)throws Exception{        
        SimpleDateFormat sdf = new SimpleDateFormat(fromPattern);
        Date dates = sdf.parse(date);
        SimpleDateFormat sdf2 = new SimpleDateFormat(toPattern);
        return sdf2.format(dates);
    }
    
    public static String convertDate(Object date)throws Exception{        
        SimpleDateFormat sdf = new SimpleDateFormat("dd / mm / yyyy");
        Date dates = sdf.parse(date.toString());
        SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy/mm/dd");
        return sdf2.format(dates);
    }
}
