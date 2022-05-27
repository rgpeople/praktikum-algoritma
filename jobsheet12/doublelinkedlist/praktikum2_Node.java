package jobsheet12.doublelinkedlist;

public class praktikum2_Node {
    int data;
    praktikum2_Node prev;
    praktikum2_Node next;

    praktikum2_Node(praktikum2_Node prev, int data, praktikum2_Node next) {
        this.prev = prev;
        this.data = data;
        this.next = next;
    }
}
