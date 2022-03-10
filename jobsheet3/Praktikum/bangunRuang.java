package jobsheet3.Praktikum;

import java.util.Scanner;

public class bangunRuang {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukan banyak kubus : ");
        int k = sc.nextInt();
        int s;
        kubus[] kbArray = new kubus[k];
        System.out.println("-----------------------");
        for (int i = 0; i < kbArray.length; i++) {
            System.out.print("Masukan sisi ke-" + (i + 1) + ": ");
            s = sc.nextInt();
            kbArray[i] = new kubus(s);
        }
        for (int i = 0; i < kbArray.length; i++) {
            System.out.println();
            System.out.println("Kubus ke - " + (i + 1));
            System.out.println("Sisi : " + kbArray[i].sisi);
            System.out.println("Volume ke-" + (i + 1) + ": " + kbArray[i].volume());
            System.out.println("Luas permukaan ke-" + (i + 1) + ": " + kbArray[i].luasPermukaan());
        }
        System.out.println();
        System.out.println("Masukan banyak balok : ");
        int b = sc.nextInt();
        int p, l, t;
        balok[] bArray = new balok[b];
        System.out.println("------------------------");
        for (int i = 0; i < bArray.length; i++) {
            System.out.print("Masukan panjang " + (i + 1) + ": ");
            p = sc.nextInt();
            System.out.print("Masukan lebar " + (i + 1) + ": ");
            l = sc.nextInt();
            System.out.print("Masukan tinggi " + (i + 1) + ": ");
            t = sc.nextInt();
            bArray[i] = new balok(p, l, t);
        }
        for (int i = 0; i < bArray.length; i++) {
            System.out.println();
            System.out.println("Balok ke - " + (i + 1));
            System.out.println("Panjang : " + bArray[i].panjang);
            System.out.println("Lebar : " + bArray[i].lebar);
            System.out.println("Tinggi : " + bArray[i].tinggi);
            System.out.println("Volume ke- " + (i + 1) + ": " + bArray[i].volume());
            System.out.println("Luas perukaan ke- " + (i + 1) + ": " + bArray[i].luasPermukaan());
        }
        
        System.out.println();
        System.out.print("Masukkan banyak Prisma: ");
        int pr = sc.nextInt();
        int a, ti, tp;
        prisma[] prArray = new prisma[pr];
        System.out.println("--------------------------");
        for(int i = 0; i < prArray.length; i++){
            System.out.print("Masukkan alas " + (i + 1) + ": ");
            a = sc.nextInt();
            System.out.print("Masukkan tinggi " + (i + 1) + ": ");
            ti = sc.nextInt();
            System.out.print("Masukkan tinggi prisma " + (i + 1) + ": ");
            tp = sc.nextInt();
            prArray[i] = new prisma(a, ti, tp);
        }
        for(int i = 0; i < prArray.length; i++){
            System.out.println();
            System.out.println("Prisma ke-" + (i + 1));
            System.out.println("============");
            System.out.println("Alas : " + prArray[i].alas);
            System.out.println("Tinggi : " + prArray[i].tinggiSegitiga);
            System.out.println("Tinggi Prisma : " + prArray[i].tinggiPrisma);
            System.out.println("Volume ke-" + (i + 1) + ": " + prArray[i].volume());
            System.out.println("Luas Permukaan ke-" + (i + 1) + ": " + prArray[i].luasPermukaan());
        }
        System.out.println();
    }
}