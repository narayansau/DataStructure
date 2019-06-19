/**
 *
 */
package com.june13_2019.ds.ADTList;

/**
 * @author Narayan
 *
 */
public class myBinaryTreeInt{

    /**
     * @param args
     */
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        binaryTreeInt myBinaryTree=new binaryTreeInt();

        binaryTreeInt myBST=new binaryTreeInt();

        myBinaryTree.insert( 10 );
        for (int i=1; i < 10; i++) myBinaryTree.insert( i * i );

        if (myBinaryTree.search( 30 ))
            System.out.println( " Data Found " );
        else
            System.out.println( " Data  Not Found " );

        System.out.println( " NUmber of nodes  " +
                myBinaryTree.countNodes() );
        System.out.print( "In Order Traversal : " );
        myBinaryTree.inorder();
        System.out.print( "\nPre Order Traversal : " );
        myBinaryTree.preorder();
        System.out.print( "\nPost Order Traversal : " );
        myBinaryTree.postorder();

        myBST.insertBST( 10 );
        for (int i=1; i < 10; i++) myBST.insertBST( i * i );

        if (myBST.search( 36 ))
            System.out.println( " \nData Found in myBST " );
        else
            System.out.println( "\n Data  Not Found in myBST" );

        System.out.println( "\n MyBST NUmber of nodes  " +
                myBST.countNodes() );
        System.out.print( "In Order Traversal : " );
        myBST.inorder();
        System.out.print( "\nPre Order Traversal : " );
        myBST.preorder();
        System.out.print( "\nPost Order Traversal : " );
        myBST.postorder();

    }

}
