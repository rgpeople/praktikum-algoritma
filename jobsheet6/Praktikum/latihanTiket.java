package jobsheet6.Praktikum;

public class latihanTiket {
    String maskapai;
    String asal;
    String tujuan;
    int harga;
    
    latihanTiket(String m, int h, String a, String t){
        maskapai = m;
        harga = h;
        asal = a;
        tujuan = t;
    }
    
    void tampil(){
        System.out.println("============================");
        System.out.println("======JUANDA AIRPORT=======");
        System.out.println("============================");
        System.out.println("Nama Maskapai: " + maskapai);
        System.out.println("Harga: Rp." + harga+",-");
        System.out.println("Asal: " + asal);
        System.out.println("Tujuan: " + tujuan);
    }
}
