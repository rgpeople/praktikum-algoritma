package jobsheet5.Praktikum;


    public class Latihan {
        public int vote, jumlahVote, jumlahKandidat = 4;
        public String kandidat;
        public int nilai, acc, control = 0;
        public int[] array = new int[10000];
    
        public int hitungHasil(int js, int k1, int k2, int k3, int k4){
            if(nilai == 5){
                nilai = 1;
            }
            if (nilai == 1 && k1 > 0){
                array[control] = nilai;
                control++;
                nilai++;
                return hitungHasil(js, k1 - 1, k2, k3, k4);
            }else if (nilai == 2 && k2 > 0){
                array[control] = nilai;
                control++;
                nilai++;
                return hitungHasil(js, k1, k2 - 1, k3, k4);
            }else if (nilai == 3 && k3 > 0){
                array[control] = nilai;
                control++;
                nilai++;
                return hitungHasil(js, k1, k2, k3 - 1, k4);
            }else if (nilai == 4 && k4 > 0){
                array[control] = nilai;
                control++;
                nilai++;
                return hitungHasil(js, k1, k2, k3, k4 - 1);
            }else if (k1 == 0 && k2 == 0 && k3 == 0 && k4 == 0){
                if (array[acc] == array[acc+1] && acc+1 < js){
                    return array[acc];
    
                }else if (acc + 2 < js){
                    acc += 2;
                    return hitungHasil(js, k1, k2, k3, k4);
                }else{
                    return 0;
                }
            }else{
                nilai++;
                return hitungHasil(js, k1, k2, k3, k4);
            }
        }
    }

