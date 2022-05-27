package jobsheet12.doublelinkedlist;

public class praktikum3_Node {
    
    int data;
    praktikum3_Node prev;
    praktikum3_Node next;

    praktikum3_Node(praktikum3_Node prev, int data, praktikum3_Node next) {
        this.prev = prev;
        this.data = data;
        this.next = next;
    }
}
