# Jobsheet 3
Faiz Atha Radhitya

2141720229

## Array of Object
# 3.1 Tujuan Praktikum

Setelah melakukan materi praktikum ini, mahasiswa mampu:
1. Memahami dan menjelaskan fungsi array yang berisikan variabel objek.
2. Mahasiswa mampu menangkap logika tentang permasalahan array of object dalam Java.
3. Mahasiswa mampu menerapkan pembuatan array of object dalam Java.

# 3.2 Membuat Array dari Object, Mengisi dan Menampilkan
Didalam praktikum ini, kita akan mempraktekkan bagaimana membuat array dari object, kemudian mengisi dan menampilkan array tersebut.

## 3.2.1 Langkah-langkah Percobaan
1. Buat Project baru, dengan nama **“ArrayObjects”**. Buat package dengan nama minggu3.

2. Buat class **PersegiPanjang**
 <img src = "image/soal1-1.png">

3. Pada fungsi main yaitu pada class **ArrayObjects**, buatlah array **PersegiPanjang** yang berisi 3 
elemen:

   <image src = "image/soal1-3.png">

4. Kemudian isikan masing-masing atributnya

    <image src = "image/soal1-4.png">

5. Cetak ke layar semua atribut dari objek **ppArray**

    <image src = "image/soal1-5.png">

6. Jalankan dan amati hasilnya.

    <image src = "image/soal1-6.png">

## 3.2.2 Verifikasi Hasil Percobaan

Cocokkan hasil compile kode program anda dengan gambar berikut ini.

  <image src = "image/soal1-7.png">

## 3.2.3 Pertanyaan

1. Berdasarkan uji coba 3.2, apakah class yang akan dibuat array of object harus selalu memiliki 
atribut dan sekaligus method?Jelaskan!

- Ya karena, atribut digunakan untuk method untuk menghasilkan output

2. Apakah class PersegiPanjang memiliki konstruktor?Jika tidak, kenapa dilakukan pemanggilan 
konstruktur pada baris program berikut :

    <image src = "image/soal2-1.png">

 Tidak dilakukan pemanggilan konstruktor, Deklarasi Array of Object

3. Apa yang dimaksud dengan kode berikut ini:

    <image src = "image/soal2-3.png">

- Instansiasi Array of Object dengan banyak array yang bisa diisi adalah 3.
4. Apa yang dimaksud dengan kode berikut ini:
    
    <image src = "image/soal2-4.png">

- Deklarasi dan Instansiasi Objek dari Array of Object untuk mengisi-nya

5. Mengapa class main dan juga class PersegiPanjang dipisahkan pada uji coba 3.2?
- Agar program bisa dijalankan dan tidak terjadi error 

# **3.3 Menerima Input Isian Array Menggunakan Looping**

Pada praktikum ini kita akan mengubah hasil program dari praktikum 3.2 sehingga program dapat 
menerima input dan menggunakan looping untuk mengisikan atribut dari semua persegi panjang yang 
ada di ppArray.


## 3.3.1 Langkah-langkah Percobaan
1. Import scanner pada class ArrayObjects

<img src = "image/soal3-1.png">

Note: Letakkan kode import dibawah kode package.


2. Pada praktikum 3.2 poin nomor 4, ganti kodenya dengan kode berikut ini, yaitu membuat objek 
Scanner untuk menerima input, kemudian melakukan looping untuk menerima input: 

<img src = "image/soal3-2.png">

3. Pada praktikum 3.2 poin nomor 5, ganti kodenya dengan berikut ini, yaitu melakukan looping 
untuk mengakses isi array ppArray dan menampilkannya ke layar:

<img src = "image/soal3-3.png">

4. Jalankan dan amati hasilnya.

# **3.3.2 Verifikasi Hasil Percobaan**

Contoh verifikasi hasil percobaan ini.

<img src = "image/soal3-4.png">

## **3.3.3 Pertanyaan**

1. Apakah array of object dapat diimplementasikan pada array 2 Dimensi?

- Bisa

2. Jika jawaban soal no satu iya, berikan contohnya! Jika tidak, jelaskan!

```sh
class MapEntity
{
    private final ICellEntity[][] cellMap;

    public MapEntity(ICellEntity[][] cellMap){
        this.cellMap = cellMap;
    }
}
```

3. Jika diketahui terdapat class Persegi yang memiliki atribut sisi bertipe integer, maka kode 
dibawah ini akan memunculkan error saat dijalankan. Mengapa?

<img src = "image/soal4-1.png">

- karena belum dideklarasikan pgArray[5].sisi nya seperti ppArray[i] = new PersegiPanjang();

4. Modifikasi kode program pada praktikum 3.3 agar length array menjadi inputan dengan Scanner!

<img src = "image/soal4-2.png">

5. Apakah boleh Jika terjadi duplikasi instansiasi array of objek, misalkan saja instansiasi dilakukan 
pada ppArray[i] sekaligus ppArray[0]?Jelaskan !

- Tidak bisa, karena Deklarasi dan Instansiasi Array of Object, Array pertama sudah dideklarasikan di i, sehingga jika ada 0, maka akan terjadi error.

# **3.4 Operasi Matematika Atribut Object Array**

Pada praktikum ini kita akan melakukan pengoperasian matematika beberapa atribut pada 
masing-masing anggota array.

## **3.4.1 Langkah-langkah Percobaan**

1. Buat package baru “ArrayBalok”.

2. Buat class Balok

<img src = "image/soal34-1.png">

3. Pada fungsi main yaitu pada class ArrayBalok, buat array Balok yang berisi 3 elemen:

<img src = "image/soal34-3.png">

4. Kemudian tambahkan kode berikut ini untuk mengisi array blArray menggunakan konstruktor 
dari class Balok:

<img src = "image/soal34-4.png">

5. Tampilkan semua volume balok tersebut dengan cara memanggil method hitungVolume() di 
dalam looping seperti berikut ini:

<img src = "image/soal34-5.png">

6. Jalankan dan amati hasilnya.

## **3.4.2 Verifikasi Hasil Percobaan**

Cocokkan hasil compile kode program anda dengan gambar berikut ini.

<img src = "image/soal34-2.png">

## **3.4.3 Pertanyaan**

1. Dapatkah konstruktor berjumlah lebih dalam satu kelas? Jelaskan dengan contoh!

- Bisa 

- Konstruktor tanpa parameter dan dengan parameter

```sh
public class Persegi {
    public int sisi;
    
    public Persegi(int s){
        sisi = s;
    }

    public Persegi(){
        this.sisi;
    }
```

2. Jika diketahui terdapat class Segitiga seperti berikut ini

<img src = "image/soal343-1.png">

Tambahkan konstruktor pada class Segitiga tersebut yang berisi parameter int a, int t
yang masing-masing digunakan untuk mengisikan atribut alas dan tinggi.

3. Tambahkan method hitungLuas() dan hitungKeliling() pada class Segitiga
tersebut.

4. Pada fungsi main, buat array Segitiga sgArray yang berisi 4 elemen, isikan masing-masing 
atributnya sebagai berikut:

```sh
sgArray ke-0 alas: 10, tinggi: 4
sgArray ke-1 alas: 20, tinggi: 10
sgArray ke-2 alas: 15, tinggi: 6
sgArray ke-3 alas: 25, tinggi: 10
```

5. Kemudian menggunakan looping, cetak luas dan keliling dengan cara memanggil method 
hitungLuas() dan hitungKeliling().

<image src = "image/soal5.png">

# **3.5 Latihan Praktikum**
1. Buatlah program yang dapat menghitung luas permukaan dan volume beberapa bangun ruang 
(minimal 3, jenis bangun luas bebas). Buatlah 3 (tiga) class sesuai dengan jumlah jenis bangun 
ruang. Dan buat satu main class untuk membuat array of objek yang menginputkan atribut-atribut 
yang ada menggunakan konstruktor semua bangun ruang tersebut. 
Keterangan : Buat looping untuk menginputkan masing-masing atributnya, kemudian tampilkan 
luas permukaan dan volume dari tiap jenis bangun ruang tersebut.

Prisma
```java
package jobsheet3.Praktikum;

public class prisma {
    public int alas, tinggiSegitiga, tinggiPrisma;

    public prisma(int a, int ti, int tp){
        alas = a;
        tinggiSegitiga = ti;
        tinggiPrisma = tp;
    }

    public int volume(){
        return ((alas * tinggiSegitiga) / 2) * tinggiPrisma;
    }

    public int luasPermukaan(){
        return (alas * tinggiSegitiga) + ((3 * alas) * tinggiPrisma);
    }   
}
```

Balok
```java
package jobsheet3.Praktikum;

public class balok {
    public int panjang, lebar, tinggi;

    public balok(int p, int l, int t) {
        panjang = p;
        lebar = l;
        tinggi = t;
    }

    public int volume() {
        return panjang * lebar * tinggi;
    }

    public int luasPermukaan() {
        return 2 * (panjang * lebar + panjang * tinggi + lebar * tinggi);

    }
}
```

Kubus
```java
package jobsheet3.Praktikum;

public class kubus {
    public int sisi;

    public kubus(int s) {
        sisi = s;
    }

    public int volume() {
        return sisi * sisi * sisi;
    }

    public int luasPermukaan() {
        return 6 * (sisi * sisi * sisi);
    }
}
```

Hasil

<image src = "image/tugas1.png">


2. Sebuah perusahaan jual beli tanah membutuhkan sebuah program yang dapat memberitahu luas 
tanah. Program tersebut dapat menerima input jumlah tanah yang akan dihitung dan atribut
panjang dan lebar masing-masing dari tanah yang diinputkan. Program dapat menampilkan luas 
tanah masing-masing tanah yang diinputkan tadi dan juga tanah terluas dari ketiga tanah yang ada. 

jualbelitanah
```java
package jobsheet3;

public class jbTanah {
    public int panjang, lebar;

    public int luasTanah() {
        return panjang * lebar;
    }

    public int tanahTerluas(int luas[]) {
        int terluas = 0;
        int y = 0;
        for (int i = 0; i < luas.length; i++)
            if (luas[i] > terluas) {
                terluas = luas[i];
                y = i;
            }
        return y;
    }
}
```
Tanah
```java
package jobsheet3.Praktikum;

import java.util.Scanner;

public class Tanah {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan jumlah tanah : ");
        int n = sc.nextInt();
        jbTanah[] tnArray = new jbTanah[n];
        System.out.println();
        for (int i = 0; i < n; i++) {
            tnArray[i] = new jbTanah();
            System.out.println("Tanah " + (i + 1));
            System.out.print("Panjang : ");
            tnArray[i].panjang = sc.nextInt();
            System.out.print("Lebar : ");
            tnArray[i].lebar = sc.nextInt();
        }
        System.out.println();
        for (int i = 0; i < n; i++) {
            System.out.println("Luas Tanah " + (i + 1) + ": " + tnArray[i].luasTanah());
        }
    }

}
```

mainTanah
```java
public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan jumlah tanah : ");
        int n = sc.nextInt();
        jbTanah[] tnArray = new jbTanah[n];
        System.out.println();
        for (int i = 0; i < n; i++) {
            tnArray[i] = new jbTanah();
            System.out.println("Tanah " + (i + 1));
            System.out.print("Panjang : ");
            tnArray[i].panjang = sc.nextInt();
            System.out.print("Lebar : ");
            tnArray[i].lebar = sc.nextInt();
        }
        System.out.println();
        for (int i = 0; i < n; i++) {
            System.out.println("Luas Tanah " + (i + 1) + ": " + tnArray[i].luasTanah());
        }
        System.out.println();
        int y = 0;
        int luas[] = new int[n];
        for (int i = 0; i < n; i++) {
            luas[i] = tnArray[i].luasTanah();
        }
        y = tnArray[0].tanahTerluas(luas);
        System.out.println("Tanah terluas : Tanah " + (y + 1));

}
}
```

Hasil
<image src = "image/tugas2.png">

3. Sebuah kampus membutuhkan program untuk menampilkan informasi mahasiswa berupa nama, 
nim, jenis kelamin dan juga IPK mahasiswa. Program dapat menerima input semua informasi 
tersebut, kemudian menampilkanya kembali ke user. Implementasikan program tersebut jika 
dimisalkan terdapat 3 data mahasiswa yang tersedia.

Mahasiswa

```java
package jobsheet3.Praktikum;

import java.util.Scanner;

public class Mahasiswa {
    Scanner sc = new Scanner(System.in);
    String nama;
    int NIM;
    char kelamin;
    double ipk;

    void tampil() {
        System.out.println("nama : " + nama);
        System.out.println("nim : " + NIM);
        System.out.println("Jenis kelamin : " + kelamin);
        System.out.println("Nilai IPK : " + ipk);
    }

    void input() {
        System.out.print("Masukkan nama : ");
        nama = sc.nextLine();
        System.out.print("Masukkan nim : ");
        NIM = sc.nextInt();
        System.out.print("Masukkan jenis kelamin : ");
        kelamin = sc.next().charAt(0);
        System.out.print("Masukkan Nilai IPK : ");
        ipk = sc.nextDouble();
    }
}
```

Mahasiswa Main
```java
package jobsheet3.Praktikum;

public class mahasiswaMain {
    public static void main(String[] args) {
        Mahasiswa[] mhs = new Mahasiswa[3];

        for (int i = 0; i < mhs.length; i++) {
            mhs[i] = new Mahasiswa();
            System.out.println("Masukkan data mahasiswa ke-" + (i + 1));
            mhs[i].input();
            System.out.println();
        }
        System.out.println();

        for (int i = 0; i < mhs.length; i++) {
            System.out.println("Data Mahasisswa ke-" + (i + 1));
            mhs[i].tampil();
        }
    }
}
```

Hasil

<image src = "image/tugas2.png">