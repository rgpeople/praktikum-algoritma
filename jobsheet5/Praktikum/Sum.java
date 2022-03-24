package jobsheet5.Praktikum;

public class Sum {
    public int elemen;
    public double keuntungan[];
    public double total;

    Sum(int elemen){
        this.elemen = elemen;
        this.keuntungan =new double[elemen];
        this.total = 0;
    }

    double totalBF(double arr[]){
        for(int i = 0; i < elemen; i++){
        total = total+ arr[i];
    }
    return total;
    }   

    double totalDC(double arr[], int l, int r){
        if(l ==r){
            return arr[1];
        }
        else if(l<r){
            int mid = (l+r)/2;
            double lsum=totalDC(arr,l,mid-l);
            double rsum=totalDC(arr,r,mid+l);
            return lsum+rsum+arr[mid];
        }  
        
        return 0;
    }
}
