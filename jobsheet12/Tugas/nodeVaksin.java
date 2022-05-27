package jobsheet12.Tugas;

public class nodeVaksin {
    String nama;
    int no;
    nodeVaksin prev, next;

    nodeVaksin(nodeVaksin prev, int no, String nama, nodeVaksin next) {
        this.prev = prev;
        this.nama = nama;
        this.no = no;
        this.next = next;
    }
}
