package jobsheet15.Praktikum;

public class prak2_Node {
    int data;
    Node prev, next;
 
    prak2_Node(Node prev, int data, Node next){
        this.prev = prev;
        this.data = data;
        this.next = next;
    }
}
