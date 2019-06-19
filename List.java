package com.june13_2019.ds;

public interface List<E>{


    /**
     * @return True if "K" is in list "L", false otherwise
     */
    public static boolean find(List <Integer> L, int K) {
        int it;
        for (L.moveToStart(); L.currPos() < L.length(); L.next()) {
            it=L.getValue();
            if (K == it) return true; // Found K
        }
        return false; // K not found
    }

    public void clear();

    /**
     * Remove all contents from the list, so it is once again
     * empty. Client is responsible for reclaiming storage
     * used by the list elements.
     */


    public void insert(E item);

    /**
     * Insert an element at the current location. The client
     * must ensure that the list’s capacity is not exceeded.
     *
     * @param item The element to be inserted.
     */


    public void append(E item);

    /**
     * Append an element at the end of the list. The client
     * must ensure that the list’s capacity is not exceeded.
     *
     * @param item The element to be appended.
     */


    public E remove();
    /** Set the current position to the start of the list */

    /**
     * Remove and return the current element.
     *
     * @return The element that was removed.
     */


    public void moveToStart();

    /**
     * Set the current position to the end of the list
     */

    public void moveToEnd();

    /**
     * Move the current position one step left. No change
     * if already at beginning.
     */

    public void prev();

    /**
     * Move the current position one step right. No change
     * if already at end.
     */

    public void next();

    /**
     * @return The number of elements in the list.
     */

    public int length();

    /**
     * @return The position of the current element.
     */

    public int currPos();

    /**
     * Set current position.
     *
     * @param pos The position to make current.
     */

    public void moveToPos(int pos);

    /**
     * @return The current element.
     */

    public E getValue();


}

