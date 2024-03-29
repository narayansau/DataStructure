/**
 *
 */
package com.june13_2019.ds.ADTList;

/**
 * @author Narayan
 *
 */
public class maxHeap{
    private static final int FRONT=1;
    private int[] Heap;
    private int size;
    private int maxsize;

    /**
     * @param maxsize
     */
    public maxHeap(int maxsize) {
        this.maxsize=maxsize;
        this.size=0;
        Heap=new int[this.maxsize + 1];
        Heap[0]=Integer.MAX_VALUE;
    }

    public static void main(String... arg) {
        System.out.println( "The Max Heap is " );
        maxHeap maxHeap=new maxHeap( 15 );
        maxHeap.insert( 5 );
        maxHeap.insert( 3 );
        maxHeap.insert( 17 );
        maxHeap.insert( 10 );
        maxHeap.insert( 84 );
        maxHeap.insert( 19 );
        maxHeap.insert( 6 );
        maxHeap.insert( 22 );
        maxHeap.insert( 9 );
        maxHeap.insert( 100 );
        maxHeap.maxHeap();

        maxHeap.print();
        System.out.println( "The max val is : \n\n" + maxHeap.remove() );

        for (int i=0; i < maxHeap.getHeapsize(); i++)
            System.out.print( ":" + maxHeap.getHeapElement( i ) + " : " );
    }

    private int parent(int pos) {
        return pos / 2;
    }

    private int leftChild(int pos) {
        return (2 * pos);
    }

    private int rightChild(int pos) {
        return (2 * pos) + 1;
    }

    private boolean isLeaf(int pos) {
        if (pos >= (size / 2) && pos <= size) {
            return true;
        }
        return false;
    }

    private void swap(int fpos, int spos) {
        int tmp;
        tmp=Heap[fpos];
        Heap[fpos]=Heap[spos];
        Heap[spos]=tmp;
    }

    private void maxHeapify(int pos) {
        if (!isLeaf( pos )) {
            if (Heap[pos] < Heap[leftChild( pos )] || Heap[pos] < Heap[rightChild( pos )]) {
                if (Heap[leftChild( pos )] > Heap[rightChild( pos )]) {
                    swap( pos, leftChild( pos ) );
                    maxHeapify( leftChild( pos ) );
                } else {
                    swap( pos, rightChild( pos ) );
                    maxHeapify( rightChild( pos ) );
                }
            }
        }
    }

    public void insert(int element) {
        Heap[++size]=element;
        int current=size;

        while (Heap[current] > Heap[parent( current )]) {
            swap( current, parent( current ) );
            current=parent( current );
        }
    }

    public void print() {
        for (int i=1; i <= size / 2; i++) {
            System.out.print( " PARENT : " + Heap[i] + " LEFT CHILD : " + Heap[2 * i]
                    + " RIGHT CHILD :" + Heap[2 * i + 1] );
            System.out.println();
        }
    }

    public int getHeapElement(int i) {
        return Heap[i];

    }

    public int getHeapsize() {
        return size;

    }

    public void maxHeap() {
        for (int pos=(size / 2); pos >= 1; pos--) {
            maxHeapify( pos );
        }
    }

    public int remove() {
        int popped=Heap[FRONT];
        Heap[FRONT]=Heap[size--];
        maxHeapify( FRONT );
        return popped;
    }


}
