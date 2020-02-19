
package task;

import java.util.Scanner;

public class Task {

public static void main(String args[]) {
       int arr[]; //mendeklarasikan array
       arr = new int[5]; // menentukan kapasitas array
/*
Baris di atas akan menghasilkan efek yang sama dengan baris berikut:
int arr[] = new int[5];
*/
       arr[0] = 1; //mengisi element ke-0 dengan nilai 1
       arr[1] = 21;//mengisi element ke-1 dengan nilai 21
       for (int i=0;i<arr.length;i++) {
          System.out.println("arr["+i+"] = "+arr[i]);       }
     }
}