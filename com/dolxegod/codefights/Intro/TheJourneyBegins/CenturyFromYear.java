package com.dolxegod.codefights.Intro.TheJourneyBegins;

public class CenturyFromYear {
    public static void main(String[] args) {
        System.out.println(centuryFromYear(1905));
        System.out.println(centuryFromYear(1700));
        System.out.println(centuryFromYear(1988));
        System.out.println(centuryFromYear(2000));
        System.out.println(centuryFromYear(2001));
    }

    public static int centuryFromYear(int year){
        int result;
        if(1<= year && 2018 >= year){
            if(year % 100 == 0){
                return year/100;
            } else{
                return (year/100)+1;
            }
        }
        return 0;
    }
}
