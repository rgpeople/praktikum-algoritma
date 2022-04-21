package Jobsheet9.Praktikum;

import java.util.Scanner;

public class StackMainEdit {
    public static void main(String[] args) {
        Stack stk = new Stack(5);
    
        Scanner sc = new Scanner(System.in);
        Scanner sd = new Scanner(System.in);
    
        char pilih;
        do{
            System.out.println("------------------------------------");
            System.out.println("             PILIHAN MENU           ");
            System.out.println("------------------------------------");
            System.out.println(" 1. Push\n 2. Pop\n 3. Peek\n 4. Print\n");
            int pilihan;
            System.out.print("Pilih Menu (masukkan angka 1-4): ");
            pilihan = sd.nextInt();
        
            switch (pilihan){
                case 1:
                    do{
                        System.out.print("Jenis\t\t: ");
                        String jenis = sc.nextLine();
                        System.out.print("Warna\t\t: ");
                        String warna = sc.nextLine();
                        System.out.print("Merk\t\t: ");
                        String merk = sc.nextLine();
                        System.out.print("Ukuran\t\t: ");
                        String ukuran = sc.nextLine();
                        System.out.print("Harga\t\t: ");
                        double harga = sd.nextInt();
                        System.out.println("");
        
                        Pakaian p = new Pakaian(jenis, warna, merk, ukuran, harga);
                        System.out.print("Apakah anda akan menambahkan data baru ke stack (y/n)? ");
                        pilih = sc.next().charAt(0);
                        sc.nextLine();
                        stk.push(p);
                    }
                    while (pilih == 'y');
                    break;
            
                case 2:
                    stk.pop();
                    break;
            
                case 3:
                    stk.peek();
                    break;
            
                case 4:
                    stk.print();
                    break;
                
                default:
                    System.out.println("Input yang anda masukkan salah");
                    System.exit(0);
            }if(pilihan == 5){
                pilih ='t';
            }else{
                System.out.print("Kembali ke menu Utama (y/t) ");
                pilih = sc.next().charAt(0);
            }
        }while (pilih == 'y');
        
        sc.close();
        sd.close();
    }
}

