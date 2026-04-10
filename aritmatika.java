
public class aritmatika {
    public void hitungPenjumlahan(int a,int b){ 
        hitungPerkalian(a, b);
        int nilai = a+b; 
        System.out.println("nilai penjumlahan adalah : "+nilai); 
    }

    public static void hitungPerkalian(int a, int b){  
        int nilai = a*b; 
        System.out.println("nilai perkalian adalah : "+nilai);  
    }   

    public static void hitungPengurangan(int a, int b){  
        int nilai = a-b; 
        System.out.println("nilai pengurangan adalah : "+nilai); 
    } 

    public void  hitungPembagian(double a, double b){
        double nilai = a/b;
        System.out.println("nilai pemabagian adalah : "+nilai);
    }
}
