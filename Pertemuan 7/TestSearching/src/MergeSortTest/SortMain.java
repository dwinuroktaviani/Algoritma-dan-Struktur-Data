
package MergeSortTest;

public class SortMain {
    public static void main(String[] args) {
     int data[] = {10,40,30,50,70,20,100,90};
     System.out.println("sorting dengan merge sort");
     MergeSorting mSort = new MergeSorting();
     System.out.println("dataa awal");
     mSort.printArray(data);
     mSort.mergesort(data);
     System.out.println("Setalah diurutkan");
     mSort.printArray(data);
    }
}
