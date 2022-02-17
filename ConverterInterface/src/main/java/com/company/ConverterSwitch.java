package com.company;

public class ConverterSwitch implements Converter{

    //    Convert the given number into its corresponding month.
    //     by using the  switch statement
    @Override
    public String convertMonth(int monthNumber) {

        switch (monthNumber) {
            case 1:
                return "January";
            case 2:
                return "February";
            case 3:
                return "March";
            case 4:
                return "April";
            case 5:
                return "May";
            case 6:
                return "June";
            case 7:
                return "July";
            case 8:
                return "August";
            case 9:
                return "September";
            case 10:
                return "October";
            case 11:
                return "November";
            case 12:
                return "December";
            default :
                return "The " + monthNumber + " does not have a corresponding month";
        }

    }

    @Override
    public String convertDay(int dayNumber) {
        switch (dayNumber) {
            case 1:
               return "Your " + dayNumber + " is Sunday";
            case 2:
               return "Your " + dayNumber + " is Monday";
            case 3:
               return "Your " + dayNumber + " is Tuesday";
            case 4:
               return "Your " + dayNumber + " is Wednesday";
            case 5:
               return "Your " + dayNumber + " is Thursday";
            case 6:
               return "Your " + dayNumber + " is Friday";
            case 7:
               return "Your " + dayNumber + " is Saturday";
            default:
               return "The " + dayNumber + " does not have a corresponding weekday";
        }
    }
}
