package jobsheet6.Praktikum;

public class latihanMainTiket {
     public static void main(String[] args) {
        latihanSistemTiket bandara = new latihanSistemTiket();
        latihanTiket t1 = new latihanTiket("Garuda Indonesia", 2500000, "Pontianak", "Jakarta");
        latihanTiket t2 = new latihanTiket("Batik Air", 850000, "Surabaya", "Palangkaraya");
        latihanTiket t3 = new latihanTiket("Air Asia", 1200000, "Jogja", "Medan");
        latihanTiket t4 = new latihanTiket("Citilink", 1550000, "Balikpapan", "Jakarta");
        latihanTiket t5 = new latihanTiket("Sriwijaya Air",900000, "Surakarta", "Bali");
        
        bandara.tambah(t1);
        bandara.tambah(t2);
        bandara.tambah(t3);
        bandara.tambah(t4);
        bandara.tambah(t5);
        
        System.out.println("==============================");
        System.out.println("=====Data Sebelum Sorting=====");
        System.out.println("==============================");
        bandara.tampil();
        System.out.println("");
        System.out.println("==================================");
        System.out.println("Data ticket setelah di sorting berdasarkan :");
        System.out.println("Sorting dengan metode Bubble sort :");
        bandara.bubbleSort();
        bandara.tampil();
        System.out.println();
        System.out.println("======================================");
        System.out.println("Sorting dengan metode Selection sort :");
        System.out.println("======================================");
        System.out.println("");
        bandara.selectionSort();
        bandara.tampil();
        System.out.println("==================================");
      }
}
