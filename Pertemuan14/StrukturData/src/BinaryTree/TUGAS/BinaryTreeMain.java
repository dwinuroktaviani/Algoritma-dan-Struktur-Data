
package BinaryTree.TUGAS;

import java.util.Scanner;
// SOAL 5 SOAL 5
public class BinaryTreeMain {
    static void menu() {
        System.out.println("=================================");
        System.out.println("BINARY SEARCH TREE DENGAN MENU ");
        System.out.println("=================================");
        System.out.println("Pilihan Menu ");
        System.out.println("1.	Add Node");
        System.out.println("2.	Delete Node");
        System.out.println("3.	Find Node");
        System.out.println("4.	Traverse inOrder");
        System.out.println("5.	Traverse preOrder");
        System.out.println("6.	Traverse postOrder");
        System.out.println("7.	Exit");
        System.out.println("=================================");
        System.out.print("Masukkan Pilihan Menu Yang Dicari : ");
    }
    
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        BinaryTree b = new BinaryTree();
        int key = 0;
        do {
            menu();
            key = sc.nextInt();
            switch (key) {
                case 1:
                    System.out.println("=================================");
                    System.out.print("Insert Node : ");
                    int data = sc.nextInt();
                    b.add(data);
                    System.out.println();
                    break;
                case 2:
                    System.out.println("=================================");
                    System.out.print("Delete Node : ");
                    data = sc.nextInt();
                    b.delete(data);
                    System.out.println();
                    break;
                case 3:
                    System.out.println("=================================");
                    System.out.print("Find Node : ");
                    data = sc.nextInt();
                    System.out.println("Cek apakah ada node " + data + " : " + b.find(data));

                    if (null == b.root) {
                        System.out.println("Node " + data
                                + " tidak terdapat dalam Binary Tree");
                    } else {
                        System.out.println("Node " + data
                                + " terdapat dalam Binary Tree");
                    }

                    System.out.println();
                    break;
                case 4:
                    System.out.println("=================================");
                    System.out.print("Traverse inOrder");
                    b.traverseInOrder(b.root);
                    break;
                case 5 :
                    System.out.println("=================================");
                    System.out.print("Traverse preOrder");
                    b.traversePreOrder(b.root);
                    break;
                case 6 :
                    System.out.println("=================================");
                    System.out.print("Traverse postOrder");
                    b.traversePostOrder(b.root);
                    break;
                case 7 :
                    System.exit(0);
            }
        } while (key != 8);
    }
}
