/**
 *
 */
package com.june13_2019.ds.myLearning_Java;

/**
 * @author Narayan
 *
 */
public interface BiCycle1{

    //  wheel revolutions per minute
    void changeCadence(int newValue);

    void changeGear(int newValue);

    void speedUp(int increment);

    void applyBrakes(int decrement);
}
