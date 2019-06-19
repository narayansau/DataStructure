/**
 *
 */
package com.june13_2019.ds.ADTList;

/**
 * @author Narayan
 *
 */
public class binaryTreeInt{

    private BTNodeInt root;

    /**
     * @param root
     */
    public binaryTreeInt() {
        root=null;
    }

    public boolean isEmpty() {
        return root == null;
    }

    public void insert(int data) {
        root=insert( root, data );
    }

    private BTNodeInt insert(BTNodeInt node, int data) {
        if (node == null)
            node=new BTNodeInt( data );
        else {
            if (node.getRight() == null)
                node.right=insert( node.right, data );
            else
                node.left=insert( node.left, data );
        }
        return node;

    }

    //Insert like Binary Search Tree

    public void insertBST(int value) {

        root=insertBST( root, value );
    }

    private BTNodeInt insertBST(BTNodeInt node, int data) {


        if (node == null)
            node=new BTNodeInt( data );

        else if (data < node.getData())

            node.left=insertBST( node.left, data );

        else

            node.right=insertBST( node.right, data );


        return node;
    }

    // Count all nodes
    /* Function to count number of nodes */
    public int countNodes() {
        return countNodes( root );
    }

    private int countNodes(BTNodeInt root) {
        if (root == null) return 0;
        else {
            int count=1;
            count+=countNodes( root.getLeft() );
            count+=countNodes( root.getRight() );
            return count;
        }
    }

    // Search an element

    public boolean search(int val) {
        return search( root, val );
    }

    private boolean search(BTNodeInt root, int val) {
        //if ( root.getData() == val) {

        if (root.matchData( val )) {
            //System.out.println( "value :" + val + " Found");
            return true;
        }

        if (root.getLeft() != null)
            if (search( root.getLeft(), val ))
                return true;

        if (root.getRight() != null)
            if (search( root.getRight(), val ))
                return true;
        //System.out.println( "value :" + val + " Not Found");
        return false;

    }

    // Inorder traversal

    public void inorder() {
        inorder( root );

    }

    private void inorder(BTNodeInt root) {
        if (root != null) {
            inorder( root.left );
            System.out.print( root.getData() + " : " );
            inorder( root.right );

        }

    }

    // preorder traversal

    public void preorder() {
        preorder( root );

    }

    private void preorder(BTNodeInt root) {
        if (root != null) {
            System.out.print( root.getData() + " : " );
            preorder( root.left );

            preorder( root.right );

        }

    }

    // postorder traversal

    public void postorder() {
        postorder( root );

    }

    private void postorder(BTNodeInt root) {
        if (root != null) {

            postorder( root.left );

            postorder( root.right );
            System.out.print( root.getData() + " : " );

        }

    }

}
