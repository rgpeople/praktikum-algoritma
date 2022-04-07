package Jobsheet7.Praktikum;

import java.util.Scanner;

public class MahasiswaMain {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        Scanner sl = new Scanner(System.in);

        PencarianMhs data = new PencarianMhs();
        int jumMhs = 5;

        System.out.println("-------------------------------------------------------");
        System.out.println("Masukkan data Mahasiswa secara urut dari Nim terkecil : ");
        for (int i = 0; i < jumMhs; i++) {
            System.out.println("---------------------------");
            System.out.print("NIM  : ");
            int nim = s.nextInt();
            System.out.print("Nama : ");
            String nama = sl.nextLine();
            System.out.print("Umur : ");
            int umur = s.nextInt();
            System.out.print("IPK  : ");
            double ipk = s.nextDouble();

            Mahasiswa m = new Mahasiswa(nim, nama, umur, ipk);
            data.tambah(m);
        }

        System.out.println("---------------------------------------------------------");
        System.out.println("Data Keseluruhan Mahasiswa");
        data.tampil();

        System.out.println("_________________________________________________________");
        System.out.println("_________________________________________________________");
        System.out.println("Pencarian Data");
        System.out.println("Masukkan NIM Mahasiswa yang di cari : ");
        System.out.println("NIM   : ");
        int cari = s.nextInt();
        System.out.println("Menggunakan Sequential Search");
        int posisi = data.FindSeqSearch(cari);
        data.TampilPosisi(cari, posisi);
        data.TampilData(cari, posisi);

        System.out.println("=======================================================");
        System.out.println("Menggunakan Binary Search");
        posisi = data.FindBinarySearch(cari, 0, jumMhs - 1);
        data.TampilPosisi(cari, posisi);
        data.TampilData(cari, posisi);

        s.close();
        sl.close();

    }
}
