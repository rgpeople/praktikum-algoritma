package jobsheet3;

public class segitiga {
    public int alas, tinggi, c;


    public segitiga (int a, int t){
        alas = a;
        tinggi = t;
    }

    public int hitungLuas(){
        return alas*tinggi/2;
    }

    public void cariSisi(){
        c = ((alas*alas)+(tinggi*tinggi));
        Systeatm.out.println("Panjang sisi miring adalah = "+(Math.sqrt(c)));
    }
    
    public Double hitungKeliling(){
        return alas+tinggi+(Math.sqrt(c));
    }
}
