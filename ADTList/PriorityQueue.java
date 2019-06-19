/**
 *
 */
package com.june13_2019.ds.ADTList;

/**
 * @author Narayan
 *
 */
public interface PriorityQueue<K, V>{
    public int size();

    public boolean isEmpty();

    public Entry <K, V> min();

    public Entry <K, V> insert(K key, V value);

    public Entry <K, V> removemin();


}
