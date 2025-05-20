
public class DoubleLinkedListsMain14 {

    public static void main(String[] args) throws Exception {
        DoubleLinkedLists14 dll = new DoubleLinkedLists14();

        dll.print();
        System.out.println("size : " + dll.size());
        System.out.println("================================");
        dll.addFirst(3);
        dll.addFirst(4);
        dll.addFirst(7);
        dll.print();
        System.out.println("size : " + dll.size());
        System.out.println("================================");
        dll.add(40, 1);
        dll.print();
        System.out.println("size : " + dll.size());
        System.out.println("================================");
        System.out.println("Size : " + dll.size());
        dll.clear();
        dll.print();
        System.out.println("size : " + dll.size());
        System.out.println("==============================");
        System.out.println("==============================");

        //praktikum2
        dll.addLast(50);
        dll.addLast(40);
        dll.addLast(10);
        dll.addLast(20);
        dll.print();
        System.out.println("size : " + dll.size());
        System.out.println("==============================");

        dll.removeFirst();
        dll.print();
        System.out.println("size : " + dll.size());
        System.out.println("==============================");

        dll.removeLast();
        dll.print();
        System.out.println("size : " + dll.size());
        System.out.println("==============================");

        dll.remove(1);
        dll.print();
        System.out.println("size : " + dll.size());
        System.out.println("==============================");
        System.out.println("==============================");

        //praktikum3
        dll.print();
        System.out.println("size : " + dll.size());
        System.out.println("==============================");
        dll.addFirst(3);
        dll.addLast(4);
        dll.addFirst(7);
        dll.print();
        System.out.println("size : " + dll.size());
        System.out.println("==============================");
        dll.add(40, 1);
        dll.print();
        System.out.println("size : " + dll.size());
        System.out.println("==============================");
        
        System.out.println("Data awal Linked List adalah : " + dll.getFirst());
        System.out.println("Data akhir Linked List adalah : " + dll.getLast());
        System.out.println("Data indeks ke-1 : " + dll.get(1));
    }
}
