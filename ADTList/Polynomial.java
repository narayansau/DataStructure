/**
 *
 */
package com.june13_2019.ds.ADTList;

/**
 * @author Narayan
 *
 */
public class Polynomial{
    private Term head;
    private int numberofTerms;

    /**
     * @param head
     */
    public Polynomial(Term head) {
        this.head=head;
        numberofTerms++;
    }

    /**
     *
     */
    public Polynomial() {
        this.head=null;
        numberofTerms=0;

    }

    /**
     * @return the head
     */
    public Term getHead() {
        return head;
    }

    /**
     * @param head the head to set
     */
    public void setHead(Term head) {
        this.head=head;
    }

    /**
     * @return the numberofTerms
     */
    public int getNumberofTerms() {
        return numberofTerms;
    }


}
