package jobsheet6.Praktikum;

public class latihanSistemTiket {
    latihanTiket tkt[] = new latihanTiket[5];
    int tik;
    
    void tambah(latihanTiket t) {
        if (tik < tkt.length) {
            tkt[tik] = t;
            tik++;
        } else {
            System.out.println("Maaf Data Penuh");
        }
    }
    
    void tampil(){
        for (latihanTiket t : tkt){
            t.tampil();
        }
    }
    
    void bubbleSort(){
        for (int i = 0; i < tkt.length - 1; i++){
            for (int j = 1; j < tkt.length - i; j++){
                if (tkt[j].harga > tkt[j-1].harga){
                    latihanTiket swp = tkt[j]; //swap
                    tkt[j] = tkt[j-1];
                    tkt[j-1] = swp;
                }
            }
        }
    }
    
    void selectionSort(){
        for(int i=0;i<tkt.length-1;i++){
            int idxMin = i;
            for(int j=i+1;j<tkt.length;j++){
                if(tkt[j].harga<tkt[idxMin].harga){
                    idxMin = j;
                }
            }latihanTiket tmp = tkt[idxMin];
            tkt[idxMin] = tkt[i];
            tkt[i] = tmp;
        }
    }
}
