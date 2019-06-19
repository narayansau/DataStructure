/**
 *
 */
package com.june13_2019.ds.ADTList;

/**
 * @author Narayan
 *
 */
public class BTNodeInt{

    BTNodeInt left, right;
    int data;

    /**
     * @param left
     * @param right
     * @param data
     */
    public BTNodeInt(BTNodeInt left, BTNodeInt right, int data) {
        this.left=left;
        this.right=right;
        this.data=data;
    }

    /**
     * @param data
     */
    public BTNodeInt(int data) {
        this.data=data;
        left=right=null;
    }

    /**
     *
     */
    public BTNodeInt() {
        data=0;
        right=left=null;
    }

    /**
     * @return the left
     */
    public BTNodeInt getLeft() {
        return left;
    }

    /**
     * @param left the left to set
     */
    public void setLeft(BTNodeInt left) {
        this.left=left;
    }

    /**
     * @return the right
     */
    public BTNodeInt getRight() {
        return right;
    }

    /**
     * @param right the right to set
     */
    public void setRight(BTNodeInt right) {
        this.right=right;
    }

    /**
     * @return the data
     */
    public int getData() {
        return data;
    }

    /**
     * @param data the data to set
     */
    public void setData(int data) {
        this.data=data;
    }

    public boolean matchData(int data) {
        return (this.data == data);

    }


}
