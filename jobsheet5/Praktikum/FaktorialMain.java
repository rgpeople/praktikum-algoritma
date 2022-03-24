package jobsheet5.Praktikum;

import java.util.Scanner;

public class FaktorialMain {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
        System.out.println("====================");
        System.out.println("Input nilai yang di faktorialkan: ");
        int elemen = sc.nextInt();

        Faktorial[] fk = new Faktorial[elemen];
        for(int i=0; i < elemen; i++){
            fk[i] = new Faktorial();
            System.out.println("Data ke-"+(i+1)+": ");
            fk[i].nilai = sc.nextInt();
        }
        
        System.out.println("+++++++++++++++++++++");
        System.out.println("Hasil Faktorial dengan Brute Force");
        for(int i=0; i < elemen; i++){
            System.out.println("Hasil faktorial dari nilai " + fk[i].nilai+" adalah "+ fk[i].faktorialBF(fk[i].nilai));
        }

        System.out.println("+++++++++++++++++++++");
        System.out.println("Hasil Faktorial dengan Divide Conquer");
        for(int i=0; i < elemen; i++){
            System.out.println("Hasil faktorial dari nilai " + fk[i].nilai+" adalah "+ fk[i].faktorialDC(fk[i].nilai));
    }
    sc.close();
}}
