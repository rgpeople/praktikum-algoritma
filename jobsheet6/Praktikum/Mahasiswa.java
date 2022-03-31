package jobsheet6.Praktikum;

public class Mahasiswa {
    String nama;
    int thnMasuk;
    int umur;
    double ipk;

    Mahasiswa(String n, int t, int u, double i){
        nama = n;
        thnMasuk = t;
        umur = u;
        ipk = i;
    } 

    void tampil(){
        System.out.println("Nama "+ nama);
        System.out.println("Umur: "+ umur);
        System.out.println("Tahun Masuk: "+ thnMasuk);
        System.out.println("IPK: "+ ipk);
    }
}

