/**
 *
 */
package com.june13_2019.ds.ADTList;

/**
 * @author Narayan
 *
 */
public interface PolynomialList{

    public Boolean isEmpty();
    //post: returns true if the polynomial has no terms

    public int PolynomialSize();
    //post: return the number of terms in a polynomial

    public Term getTerm(int pos);
    //post: returns the Term at position pos in the polynomial

    public int getTermExponent(int pos);
    //post: return the exponent of the term at position pos

    public int getTermCoefficient(int pos);
    //post: return the exponent of the term at position pos

    public int getMaxExponent();
    //post: return the highest exponent in the polynomial.

    public void addTerm(int exp, int coeff);
    //post: add (i.e. summing) a new term with exponent exp and coefficient coeff
    // to the polynomial
}
