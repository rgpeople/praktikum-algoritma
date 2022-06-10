package jobsheet14.Tugas;

public class BinaryTreeArrayMain {
    public static void main(String[] args) {
        BinaryTreeArray bta = new BinaryTreeArray();
        int[] data = {6,4,8,3,5,7,9,0,0,0};
        int idxLast = 6;
        bta.populateData(data, idxLast);
        bta.traverseinOrder(0);
        
        System.out.println("");
        System.out.println("Jawaban Nomor 5");
        bta.add(88);
        bta.add(66);
        System.out.println("method traverse Pre Order");
        bta.traversePreOrder(0);
        System.out.println("");
        System.out.println("method traverse Post Order");
        bta.traversePostOrder(0);
        System.out.println("");
    } 
}
