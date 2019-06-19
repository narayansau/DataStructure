package com.june13_2019.ds.myLearning_Java;


public class EnumTest{

    static EnumDay day;

    public EnumTest(EnumDay day) {
        this.day=day;
    }

    public void tellItLikeItIs() {
        switch (day) {
            case MONDAY:
                System.out.println( "Mondays are bad." );
                break;

            case FRIDAY:
                System.out.println( "Fridays are better." );
                break;

            case SATURDAY:
            case SUNDAY:
                System.out.println( "Weekends are best." );
                break;

            default:
                System.out.println( "Midweek days are so-so." );
                break;

        }
    }


}