package jobsheet10.Praktikum.Praktikum1;

import java.util.Scanner;

public class QueueMain {
  

    public static void menu() {
        System.out.println("Masukkan operasi yang diiinginkan");
        System.out.println("1. Enqueue");
        System.out.println("2. Dequeue");
        System.out.println("3. Print");
        System.out.println("4. Peek");
        System.out.println("5. Clear");
        System.out.println("6. Cari letak indeks");
        System.out.println("7. Cari nilai dari indeks");
        System.out.println("0. Exit");
        System.out.println("====================");
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan kapasitas queue : ");
        int n = sc.nextInt();

        Queue Q = new Queue(n);

        int pilih;

        do {
            menu();
            pilih = sc.nextInt();
            switch (pilih) {
                case 1:
                    if (Q.IsFull()) {
                        pilih = 0;
                    } else {
                        System.out.print("Masukkan data baru : ");
                        int dataMasuk = sc.nextInt();
                        Q.Enqueue(dataMasuk);
                        break;
                    }
                case 2:
                    if (Q.IsEmpty()) {
                        pilih = 0;
                    } else {
                        int dataKeluar = Q.Dequeue();
                        if (dataKeluar != 0) {
                            System.out.println("Data yang dikeluarkan : " + dataKeluar);
                            break;
                        }
                    }
                case 3:
                    Q.print();
                    break;
                case 4:
                    Q.peek();
                    break;
                case 5:
                    Q.clear();
                    break;
                case 6:
                    System.out.print("Masukkan nilai dari indeks yang dicari : ");
                    int cari = sc.nextInt();
                    Q.peekPosition(cari);
                    break;
                case 7:
                    System.out.print("Masukkan indeks yang anda cari : ");
                    int p = sc.nextInt();
                    Q.peekAt(p);
                    break;
            }
        } while (pilih == 1 || pilih == 2 || pilih == 3 || pilih == 4 || pilih == 5 || pilih == 6 || pilih == 7);
         sc.close();
    }
}
