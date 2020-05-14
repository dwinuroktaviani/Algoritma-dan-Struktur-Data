
package BinaryTree.TUGAS;

import BinaryTreeArray.*;

public class BinaryTreeArray {
    int[] data;
    int idxLast;
    
    public BinaryTreeArray(){
        data = new int[10];
    }
    
    void populateData(int data[],int idxLast){
        this.data = data;
        this.idxLast = idxLast;
    }
    
    void traverseInOrder(int idxStart){
        if (idxStart <= idxLast) {
            traverseInOrder(2 * idxStart + 1);
            System.out.println(data[idxStart]+" ");
            traverseInOrder(2 * idxStart + 2);
        }
    }
    // SOAL 6
    void add(int data) {
        this.data = new int[100];

        if (this.data[0] == 0) {
            this.data[0] = data;
        }

        boolean add = false;
        int curIdx = 0;

        while (!add) {
            if (data < this.data[curIdx]) {
                //go left
                if (this.data[curIdx * 2 + 1] == 0) {
                    this.data[curIdx * 2 + 1] = data;
                    add = true;
                } else {
                    curIdx = curIdx * 2 + 1;
                }
            } else {
                //go right
                if (this.data[curIdx * 2 + 2] == 0) {
                    this.data[curIdx * 2 + 2] = data;
                    add = true;
                } else {
                    curIdx = curIdx * 2 + 2;
                }
            }
        }
    }
    void  traversePreOrder(int idxStart){
        if (idxStart <= idxLast) {
           System.out.println(data[idxStart]+" ");
           traversePreOrder(2*idxStart+1);
           traversePreOrder(idxStart+1*2);
        }
    }
    
    void traversePostOrder(int idxStart){
        if (idxStart <= idxLast) {
           traversePreOrder(2*idxStart+1);
           traversePreOrder(idxStart+1*2);
           System.out.println(data[idxStart]+" ");
        }
    }
    
    
    
    
    
}
