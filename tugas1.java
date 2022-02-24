public class tugas1 {
        public static void main(String[] args) {
            String nama[] = {"Ani", "Budi", "Bina", "Cita"};
            int kG[] = {4,15,6,11};
        
            Double tarif = 0.0;
            for(int i = 0; i < kG.length; i++){
                if(kG[i]>10){
                    tarif = (Double)(tarif+kG[i]*4500) - kG[i]*4500*0.05;
                }
                tarif = tarif + kG[i]*4500;
            }
            System.out.println("Pendapatan total Smile Laundry : " + tarif);
            
            }
        }
        

