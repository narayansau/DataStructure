/**
 *
 */
package com.june13_2019.ds.ADTList;

/**
 * @author Narayan
 * Term of Ploinomial
 *
 */
public class Term<E> extends Link <E>{
    private E coefficient;

    /**
     * @param it
     * @param nextval
     * @param coefficient
     */
    public Term(E it, Link <E> nextval, E coefficient) {
        super( it, nextval );
        this.coefficient=coefficient;
    }

    /**
     * @param it
     * @param nextval
     */
    public Term(E it, Link <E> nextval) {
        super( it, nextval );
        // TODO Auto-generated constructor stub
    }

    /**
     * @param nextval
     */
    public Term(Link <E> nextval) {
        super( nextval );
        // TODO Auto-generated constructor stub
    }

    /**
     * @return the coefficient
     */
    public E getCoefficient() {
        return coefficient;
    }

    /**
     * @param coefficient the coefficient to set
     */
    public void setCoefficient(E coefficient) {
        this.coefficient=coefficient;
    }

    /* (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        return "Term [coefficient=" + coefficient + "]";
    }


}
