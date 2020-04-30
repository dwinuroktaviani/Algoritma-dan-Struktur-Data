
package doubleLinkedList;

public class doubleLinkedListMain {
    public static void main(String[] args) throws Exception {
        //PRAKTIKUM 1
        
        doubleLinkedList dll = new doubleLinkedList();
        System.out.println("PRAKTIKUM 1");
        dll.print();
        System.out.println("Size : " + dll.size());
        System.out.println("====================================");
        dll.addFirst(3); 
        dll.addLast(4); 
        dll.addFirst(7); 
        dll.print(); 
        System.out.println("Size : " + dll.size());
        System.out.println("====================================");
        dll.add(40, 1);
        dll.print();
        System.out.println("Size : " + dll.size());
        System.out.println("====================================");
        dll.clear(); 
        dll.print();
        System.out.println("Size : " + dll.size());
        
        //PRAKTIKUM 2
        System.out.println("PRAKTIKUM 2");
        dll.addLast(50);
        dll.addLast(40);
        dll.addLast(10);
        dll.addLast(20);
        dll.print();
        System.out.println("Size : " + dll.size()); 
        System.out.println("====================================");
        dll.removeFirst();
        dll.print();
        System.out.println("Size : " + dll.size());
        System.out.println("====================================");
        dll.removeLast();
        dll.print();
        System.out.println("Size : " + dll.size());
        System.out.println("====================================");
        dll.remove(1);
        dll.print();
        System.out.println("Size : " + dll.size());
        
        
        //PRAKTIKUM 3
        System.out.println("PRAKTIKUM 3");
        System.out.println("data pada awal linked list adalah :" + dll.getFirst()); 
        System.out.println("data pada akhir linked list adalah :" + dll.getLast()); 
        System.out.println("data yang diambil dari method get(int index) adalah" + dll.get(1));

    }
}
