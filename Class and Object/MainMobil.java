import java.util.*;

public class MainMobil {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        //instan objek bernama m1
        Mobil m1 = new Mobil();

        System.out.println("Masukkan kecepatan mobil pertama");
        int kecepatan0 = input.nextInt();
        input.nextLine();
        System.out.println("Masukkan Manufaktur mobil pertama");
        String Manufaktur0 = input.nextLine();
        System.out.println("Masukkan NoPlat mobil pertama");
        String Noplat0 = input.nextLine();
        System.out.println("Masukkan warna mobil pertama");
        String warna0 = input.nextLine();
        System.out.println("Masukkan Waktu");
        double waktu0 = input.nextDouble();

        m1.setKecepatan(kecepatan0);
        m1.setManufaktur(Manufaktur0);
        m1.setNoPlat(Noplat0);
        m1.setWarna(warna0);
        m1.setWaktu(waktu0);
        m1.displayMessage();

        System.out.println("================");

        //instan objek baru bernama m2
        Mobil m2 = new Mobil();

        System.out.println("Masukkan kecepatan mobil kedua");
        int kecepatan1 = input.nextInt();
        input.nextLine();
        System.out.println("Masukkan Manufaktur mobil kedua");
        String Manufaktur1 = input.nextLine();
        System.out.println("Masukkan NoPlat mobil kedua");
        String Noplat1 = input.nextLine();
        System.out.println("Masukkan warna mobil kedua");
        String warna1 = input.nextLine();
        System.out.println("Masukkan Waktu");
        double waktu1 = input.nextDouble();

        m2.setKecepatan(kecepatan1);
        m2.setManufaktur(Manufaktur1);
        m2.setNoPlat(Noplat1);
        m2.setWarna(warna1);
        m2.setWaktu(waktu1);
        m2.displayMessage();

        System.out.println("================");

        //merubah warna dari objek m1
        System.out.println("mobil pada objek m1 di rubah menjadi warna");
        String ubahwarna = input.nextLine();
        m1.setWarna(ubahwarna);
        
        //menampilkan hasil perubahan
        m1.displayMessage();
    }
}