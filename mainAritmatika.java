import java.util.Scanner; 

public class mainAritmatika { 
    public static void main(String[] args) { 
        Scanner in = new Scanner(System.in); 
        aritmatika a = new aritmatika();

        System.out.print("masukkan nilai 1 : "); 
        int nil1 = in.nextInt(); 
        System.out.print("masukkan nilai 2 : "); 
        int nil2 = in.nextInt(); 

        //memanggil method static 
        aritmatika.hitungPengurangan(nil1, nil2); 
        System.out.print("masukkan nilai 1 : "); 
        nil1 = in.nextInt(); 
        System.out.print("masukkan nilai 2 : "); 
        nil2 = in.nextInt(); 

        //memanggil method static 
        aritmatika.hitungPerkalian(nil1, nil2); 
        System.out.print("masukkan nilai 1 : "); 
        int value1 = in.nextInt(); 
        System.out.print("masukkan nilai 2 : "); 
        int value2 = in.nextInt(); 

         //memanggil method NONstatic harus melalui objek  Aritmatika a = new Aritmatika(); 
        a.hitungPembagian(nil2, nil2);
        a.hitungPenjumlahan(value1, value2); 
    } 
}
