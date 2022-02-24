import java.util.Scanner;

public class perulangan1 {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int nim, n;

      System.out.print("Masukkan NIM : ");
      nim = sc.nextInt();
      System.out.println("=====================");

      n = nim - 2141720229;
      if (n < 10) {
         n += 10;
      }
      System.out.println("n : " + n);

      for (int i = 0; i < n; i++) {
         int cekHari = i % 7;
         if (cekHari == 0) {
            System.out.print("Senin ");
         } else if (cekHari == 1) {
            System.out.print("Selasa ");
         } else if (cekHari == 2) {
            System.out.print("Rabu ");
         } else if (cekHari == 3) {
            System.out.print("Kamis ");
         } else if (cekHari == 4) {
            System.out.print("Jumat ");
         } else if (cekHari == 5) {
            System.out.print("Sabtu ");
         } else if (cekHari == 6) {
            System.out.print("Minggu ");
         } else {
            System.out.println();
         }
      }
   }
}