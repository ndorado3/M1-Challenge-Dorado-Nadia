package com.company;

public class ConverterIf implements Converter {

    //    Convert the given number into its corresponding month.
    //    by using if/else statements

    @Override
    public String convertMonth(int monthNumber) {
        String month[] = {"January", "February", "March", "April", "May" ,"June", "July", "August", "September", "October", "November", "December"};
        if (monthNumber < 1 || monthNumber > 12)
        {
            return "The number " + monthNumber + " does not correspond to a month";
        }
        else {
            return month[monthNumber -1];
        }
    }

    //  Convert the given number into its corresponding day of the week.
    //  by using if/else statements
    @Override
    public String convertDay(int dayNumber) {
        if (dayNumber == 1) {
            return "Sunday";
        } else if (dayNumber == 2) {
            return "Monday";
        } else if (dayNumber == 3) {
            return "Tuesday";
        } else if (dayNumber == 4) {
            return "Wednesday";
        } else if (dayNumber == 5) {
            return "Thursday";
        } else if (dayNumber == 6) {
            return "Friday";
        }else if (dayNumber == 7) {
            return "Saturday";
        }else {
            return "The number " + dayNumber + " does not correspond to a weekday";
        }
    }
}
