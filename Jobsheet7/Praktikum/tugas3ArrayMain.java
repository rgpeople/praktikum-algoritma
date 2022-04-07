package Jobsheet7.Praktikum;

public class tugas3ArrayMain {
    public static void main(String[] args) {
        int bil[] = {12, 17, 2, 1, 70, 50, 90, 17, 2, 90};
        
        tugas3Array arr = new tugas3Array(bil);
        
        int jum = 10;
        int max = 0;
        System.out.println("===============================");
        System.out.println("--------------DATA-------------");
        arr.tampil();
        arr.bubbleSort();
        System.out.println("===============================");
        System.out.println("Setelah di sorting");
        arr.tampil();
        arr.nilaiTerbesar();
        arr.FindBinarySearch(max, 0, jum - 1);
        arr.tampilPosisi(max);
    }
}
