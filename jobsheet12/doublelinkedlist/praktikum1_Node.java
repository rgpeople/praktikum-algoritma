package jobsheet12.doublelinkedlist;

public class praktikum1_Node {
    int data;
    praktikum1_Node prev;
    praktikum1_Node next;

    praktikum1_Node(praktikum1_Node prev, int data, praktikum1_Node next) {

        this.prev = prev;
        this.data = data;
        this.next = next;
    }
}
