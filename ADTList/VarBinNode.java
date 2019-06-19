/**
 *
 */
package com.june13_2019.ds.ADTList;

/**
 * @author Narayan
 *
 */
public interface VarBinNode{
    public boolean isLeaf();
}

class VarLeafNode implements VarBinNode{ // Leaf node
    private String operand; // Operand value

    public VarLeafNode(String val) {
        operand=val;
    }

    public boolean isLeaf() {
        return true;
    }

    public String value() {
        return operand;
    }
};

/** Internal node */
class VarIntlNode implements VarBinNode{
    private VarBinNode left; // Left child
    private VarBinNode right; // Right child
    private Character operator; // Operator value

    public VarIntlNode(Character op, VarBinNode l, VarBinNode r) {
        operator=op;
        left=l;
        right=r;
    }

    /** Preorder traversal */

    public static void traverse(VarBinNode rt) {
    }

    public boolean isLeaf() {
        return false;
    }

    public VarBinNode leftchild() {
        return left;
    }

    public VarBinNode rightchild() {
        return right;
    }

    public Character value() {
        return operator;
    }
}