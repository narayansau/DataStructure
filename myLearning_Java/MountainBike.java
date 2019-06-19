/**
 *
 */
package com.june13_2019.ds.myLearning_Java;

/**
 * @author Narayan
 *
 */
public class MountainBike extends Bicycle{

    /**
     *
     */

    // the MountainBike subclass has
    // one field
    public int seatHeight;

    // the MountainBike subclass has
    // one constructor
    public MountainBike(int startHeight, int startCadence,
                        int startSpeed, int startGear) {
        super( startCadence, startSpeed, startGear );
        seatHeight=startHeight;
    }   
	
	/*public MountainBike() {
		// TODO Auto-generated constructor stub
		super();
		seatHeight = 1;
		
	}*/

    // the MountainBike subclass has
    // one method
    public void setHeight(int newValue) {
        seatHeight=newValue;
    }

    void printStates() {
        System.out.print( "Including Super : " );
        super.printStates();
        System.out.println( " SeatHeight :" + seatHeight );


    }

}
