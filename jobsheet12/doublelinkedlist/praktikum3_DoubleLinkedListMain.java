package jobsheet12.doublelinkedlist;

public class praktikum3_DoubleLinkedListMain {
    public static void main(String[] args) throws Exception {
        praktikum3_DoubleLinkedList dll = new praktikum3_DoubleLinkedList();
        dll.print();
        System.out.println("Size : " + dll.size);
        System.out.println("===============================");
        dll.addFirst(3);
        dll.addLast(4);
        dll.addFirst(7);
        dll.print();
        System.out.println("Size : " + dll.size);
        System.out.println("===============================");
        dll.add(40, 1);
        dll.print();
        System.out.println("Size : " + dll.size);
        System.out.println("===============================");
        System.out.println("Data awal pada Linked List adalah :" + dll.getFirst());
        System.out.println("Data akhir pada Linked List adalah :" + dll.getLast());
        System.out.println("Data indeks ke-1 pada Linked List adalah :" + dll.get(1));
    }
}
