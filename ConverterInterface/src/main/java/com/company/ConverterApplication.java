package com.company;

public class ConverterApplication {
    public static void main(String[] args) {

        Converter converterIf = new ConverterIf();


        System.out.println("********* Converter # to Month/Week If/Else *************");

        String monthYear = converterIf.convertMonth(1);
        System.out.println(monthYear);

        String monthError = converterIf.convertMonth(13);
        System.out.println(monthError);

        String weekDay = converterIf.convertDay(4);
        System.out.println(weekDay);

        String weekDayError = converterIf.convertDay(8);
        System.out.println(weekDayError);

        System.out.println("********* Converter # to Month/Week Switch *************");

        String monthSw = converterIf.convertMonth(3);
        System.out.println(monthSw);

        String monthSwError = converterIf.convertMonth(15);
        System.out.println(monthSwError);

        String weekDaySw = converterIf.convertDay(5);
        System.out.println(weekDaySw);

        String weekDaySwError = converterIf.convertDay(12);
        System.out.println(weekDaySwError);


    }
}
