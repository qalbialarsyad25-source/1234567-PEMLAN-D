import java.util.*;

public class mainrek {
    public static void main (String[] args){
        Scanner input = new Scanner (System.in);
        rekening a = new rekening();

        System.out.print("Masukkan nama akun anda : ");
        String acount = input.nextLine();
        a.SetAkun(acount);

        System.out.print("Masukkan nama anda : ");
        String name = input.nextLine();
        a.Nama(name);

        System.out.print("Masukkan nomor rekening anda : ");
        String norek = input.nextLine();
        a.Norek(norek);

        System.out.print("Masukkan password anda : ");
        String sandi = input.nextLine();
        a.pass(sandi);

        System.out.print("Masukkan saldo anda : ");
        double uang = input.nextDouble();
        a.setSaldo(uang);

        a.Tampilan();

    }
}
