import java.util.Scanner;

public class tugas2 {

    static Scanner sc = new Scanner(System.in);
    static int kecepatan, jarak, waktu;
    static void kecepatan(){
        System.out.print("Berapa jaraknya : ");
        jarak = sc.nextInt();
        System.out.print("Berapa waktunya : ");
        waktu = sc.nextInt();
        kecepatan = jarak / waktu;
        System.out.println("kecepatan :" + kecepatan);
    }
    static void jarak(){
        System.out.print("Berapa waktunya : ");
        waktu = sc.nextInt();
        System.out.print("Berapa volumenya : ");
        kecepatan = sc.nextInt();
        jarak = kecepatan * waktu;
        System.out.println("jarak :" + jarak);
    }
    static void waktu(){
        System.out.print("Berapa volumenya : ");
        kecepatan = sc.nextInt();
        System.out.print("Berapa jaraknya : ");
        jarak = sc.nextInt();
        waktu = jarak / kecepatan;
        System.out.println("waktu :" + waktu);
    }
    public static void main(String[] args){
        char s = 'y';
        do{
            boolean succes = true;
            do{
                System.out.println("Pilih perhitungan yang kamu inginkan");
                System.out.println("1. Kecepatan");
                System.out.println("2. Jarak");
                System.out.println("3. Waktu");
                System.out.print("Pilih perhitungan yang anda inginkan di atas (1/2/3) ");
                int jenis = sc.nextInt();
        switch(jenis){
            case 1:
            kecepatan();
            break;
            case 2:
            jarak();
            break;
            case 3:
            waktu();
            break;
            default:
            break;
            }
        }while(!succes);
            System.out.print("\nIngin kembali ke menu utama? (Y/T) ");
            s = sc.next().charAt(0);
    }while(s=='Y'||s=='y');
}
}