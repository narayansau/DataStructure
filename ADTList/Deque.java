/**
 *
 */
package com.june13_2019.ds.ADTList;

/**
 * @author Narayan
 *
 */
public interface Deque<E>{

    //Returns size of the D-Q.
    public int size();

    // Return is D-Q is empty
    public boolean isEmpty();

    //Returns first element
    public E getFirst();

    // Returns last element
    public E getLast();

    //Insert an element to the first of D.Q.
    public void addFirst(E element);

    //Insert an element to the LAST of D.Q.
    public void addLast(E element);

    // Remove first element
    public E removeFirst();

    //Remove last element
    public E removeLast();


}
