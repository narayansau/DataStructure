package com.june13_2019.ds.myLearning_Java;

public class Bicycle{

    private static final boolean String=false;
    int cadence;
    int speed;
    int gear;

    // the Bicycle class has
    // one constructor
    public Bicycle(int startCadence, int startSpeed, int startGear) {
        gear=startGear;
        cadence=startCadence;
        speed=startSpeed;
    }

    public Bicycle() {
        gear=1;
        cadence=0;
        speed=0;
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        // Create two different
        // Bicycle objects
        Bicycle bike1=new Bicycle();
        Bicycle bike2=new Bicycle();


        // Invoke methods on
        // those objects
        bike1.changeCadence( 50 );
        bike1.speedUp( 10 );
        bike1.changeGear( 2 );
        bike1.printStates();

        bike2.changeCadence( 50 );
        bike2.speedUp( 10 );
        bike2.changeGear( 2 );
        bike2.changeCadence( 40 );
        bike2.speedUp( 10 );
        bike2.changeGear( 3 );
        bike2.printStates();

        ACMEBicycle bike3=new ACMEBicycle();
        bike3.changeCadence( 50 );
        bike3.speedUp( 10 );
        bike3.changeGear( 2 );
        bike3.changeCadence( 40 );
        bike3.speedUp( 10 );
        bike3.changeGear( 3 );
        bike3.printStates();

        MountainBike bike4=new MountainBike( 10, 14, 45, 6 );
        bike4.printStates();
        bike4.setHeight( 100 );
        bike4.printStates();

        ShadowTest myShadow=new ShadowTest();

        ShadowTest.FirstLevel inner_class_method=myShadow.new FirstLevel();

        inner_class_method.methodInFirstLevel( 5 );

        EnumTest firstDay=new EnumTest( EnumDay.MONDAY );

        firstDay.tellItLikeItIs();

        //  firstDay.EnumTest(EnumDay.FRIDAY);

      /*  {
        int i = 10;
        int n = i++%5;
        System.out.println("What about n : " +
	             n);

         n = ++i%5;
        System.out.println("What about n : " +
	             n);
        int month = 8;
        String monthString;
        switch (month) {
            case 1:  monthString = "January";
                     break;
            case 2:  monthString = "February";
                     break;
            case 3:  monthString = "March";
                     break;
            case 4:  monthString = "April";
                     break;
            case 5:  monthString = "May";
                     break;
            case 6:  monthString = "June";
                     break;
            case 7:  monthString = "July";
                     break;
            case 8:  monthString = "August";System.out.print(monthString + "  ");
                    // break;
            case 9:  monthString = "September";System.out.println(monthString);
                     break;
            case 10: monthString = "October";
                     break;
            case 11: monthString = "November";
                     break;
            case 12: monthString = "December";
                     break;
            default: monthString = "Invalid month";
                     break;
        }
        System.out.println(monthString);

        java.util.ArrayList<String> futureMonths =
                new java.util.ArrayList<String>();

         month = 1 ;

        switch (month) {
            case 1:  futureMonths.add("January");
            case 2:  futureMonths.add("February");
            case 3:  futureMonths.add("March");
            case 4:  futureMonths.add("April");
            case 5:  futureMonths.add("May");
            case 6:  futureMonths.add("June");
            case 7:  futureMonths.add("July");
            case 8:  futureMonths.add("August");
            case 9:  futureMonths.add("September");
            case 10: futureMonths.add("October");
            case 11: futureMonths.add("November");
            case 12: futureMonths.add("December");
                     break;
            default: break;
        }
        if (futureMonths.isEmpty()) {
            System.out.println("Invalid month number");
        } else {
            for (String monthName : futureMonths) {
               System.out.println(monthName);

               int count = 1;
               while (count < 11)
               //while ( String j  : futureMonths)
                    {
                   	System.out.println(count);
                   	count++;
                    }
            }


        }

        } */
    }

    void changeCadence(int newValue) {
        cadence=newValue;
    }

    void changeGear(int newValue) {
        gear=newValue;
    }

    void speedUp(int increment) {
        speed=speed + increment;
    }

    void applyBrakes(int decrement) {
        speed=speed - decrement;
    }

    void printStates() {
        System.out.println( "cadence:" +
                cadence + " speed:" +
                speed + " gear:" + gear );
        System.out.printf( "I am here cadence %d:  speed %d, gear %d %n", cadence, speed, gear );
        //System.in.scanf("Give me input %d ", cadence);
    }

}
