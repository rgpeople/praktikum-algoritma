package jobsheet5.Praktikum;

import java.util.Scanner;

public class PangkatMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Masukkan jumlah elemen yang dihitung: ");
        int elemen = sc.nextInt();

        Pangkat[] png = new Pangkat[elemen];
        for(int i=0; i< elemen; i++){
            png[i] = new Pangkat();
            System.out.println("Masukkan nilai yang di pangkatkan: ");
            png[i].nilai = sc.nextInt();
            System.out.println("Masukkan nilai pemangkat ke-"+(i+1)+": ");
            png[i].pangkat= sc.nextInt();
        }

        System.out.println("hasil pangkat dengan Brute Force");
        for(int i = 0; i < elemen; i++){
            System.out.println("Nilai "+png[i].nilai+" pangkat "+ png[i].pangkat+ " adalah "+ png[i].pangkatBF(png[i].nilai, png[i].pangkat));
        }
        System.out.println("hasil pangkat dengan Divide Conquer");
        for(int i = 0; i < elemen; i++){
            System.out.println("Nilai "+png[i].nilai+" pangkat "+ png[i].pangkat+ " adalah "+ png[i].pangkatDC(png[i].nilai, png[i].pangkat));
        }

        sc.close();
    }
}
