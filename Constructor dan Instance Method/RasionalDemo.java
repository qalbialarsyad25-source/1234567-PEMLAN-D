public class RasionalDemo {
    public static void main(String[] args){ 
        Rasional R1 = new Rasional(1,2); 
        Rasional R2 = new Rasional(1,3); 
        
        System.out.println("R1 < R2     : "+R1.kurangdari(R2));
        System.out.println("R1 >= R2    : "+R1.lebihdariSama(R2));

        System.out.println("R1 Awal : ");
        R1.cetak();

        System.out.println("R1 dikurangi R2 : ");
        R1.minus(R2);
        R1.Sederhana();
        R1.cetak();

        System.out.println("R1 dikali R2 : ");
        R1.perkalian(R2);
        R1.cetak();
    }
}
