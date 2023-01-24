/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hackerrankjava;

import java.text.DateFormat;
import java.text.DateFormatSymbols;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;

/**
 *
 * @author anhta
 */
public class JavaDateAndTime {

    public static void main(String[] args) {
        /*https://www.tutorialspoint.com/display-day-name-of-week-using-java-calendar*/
        System.out.println(findDay(01, 20, 2023));//mmDDyyyy
        System.out.println(findDay());

    }

    public static String findDay(int month, int day, int year) {
//        month--;
//        Date date = new Date(day, month, year);
//        Calendar calendar = Calendar.getInstance();
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Calendar calendar = new GregorianCalendar(year, month-1, day);

        String[] days = new String[]{"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
        return (days[calendar.get(Calendar.DAY_OF_WEEK) - 1]).toUpperCase();
//        return (sdf.format(calendar.getTime()));
    }

    public static String findDay() {
//        Date date = new Date(day, month, year);
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(new Date());

        String[] days = new String[]{"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
        return (days[calendar.get(Calendar.DAY_OF_WEEK) - 1]).toUpperCase();
    }
}
