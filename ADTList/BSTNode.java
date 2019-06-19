package com.june13_2019.ds.ADTList;

/**
 * Binary tree node implementation: Pointers to children
 */

class BSTNode<Key, E> implements BinNode <E>{

    private Key key; // Key for this node

    private E element; // Element for this node

    private BSTNode <Key, E> left; // Pointer to left child

    private BSTNode <Key, E> right; // Pointer to right child


    /**
     * @param element
     * @param left
     * @param right
     */
    public BSTNode(E element, BSTNode <Key, E> left, BSTNode <Key, E> right) {
        this.element=element;
        this.left=left;
        this.right=right;
    }


    /**
     * @param key
     * @param element
     * @param left
     * @param right
     */
    public BSTNode(Key key, E element, BSTNode <Key, E> left, BSTNode <Key, E> right) {
        this.key=key;
        this.element=element;
        this.left=left;
        this.right=right;
    }


    /**
     * Constructors
     */
    public BSTNode() {
        left=right=null;
    }


    /**
     * @param key
     * @param element
     */
    public BSTNode(Key key, E element) {
        this.key=key;
        this.element=element;
        left=right=null;


    }


    /* (non-Javadoc)
     * @see com.june13_2019.ds.ADTList.BinNode#element()
     */
    @Override
    public E element() {
        // TODO Auto-generated method stub
        return null;
    }

    /* (non-Javadoc)
     * @see com.june13_2019.ds.ADTList.BinNode#left()
     */
    @Override
    public BinNode <E> left() {
        // TODO Auto-generated method stub
        return left;
    }

    /* (non-Javadoc)
     * @see com.june13_2019.ds.ADTList.BinNode#right()
     */
    @Override
    public BinNode <E> right() {
        // TODO Auto-generated method stub
        return right;
    }

    /**
     * @return the key
     */
    public Key getKey() {
        return key;
    }


    /* (non-Javadoc)
     * @see com.june13_2019.ds.ADTList.BinNode#isLeaf()
     */

    /**
     * @param key the key to set
     */
    public void setKey(Key key) {
        this.key=key;
    }

    public Key key() {
        return key;
    }

    /**
     * @return the left
     */
    public BSTNode <Key, E> getLeft() {
        return left;
    }

    /**
     * @param left the left to set
     */
    public void setLeft(BSTNode <Key, E> left) {
        this.left=left;
    }

    /**
     * @return the right
     */
    public BSTNode <Key, E> getRight() {
        return right;
    }

    /**
     * @param right the right to set
     */
    public void setRight(BSTNode <Key, E> right) {
        this.right=right;
    }

    /**
     * @return the element
     */
    public E getElement() {
        return element;
    }

    /* (non-Javadoc)
     * @see com.june13_2019.ds.ADTList.BinNode#setElement(java.lang.Object)
     */
    @Override
    public void setElement(E v) {
        // TODO Auto-generated method stub
        element=v;
    }

    public boolean isLeaf() {
        return (left == null) && (right == null);
    }


}























