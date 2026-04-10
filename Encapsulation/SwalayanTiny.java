import java.util.*;

public class SwalayanTiny {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        pelanggan p = new pelanggan("5612345678", "Andi", 2000000, "1234");
        
        System.out.print("Masukkan Nomor Pelanggan: ");
        String nomor = input.nextLine();

        System.out.print("Masukkan PIN: ");
        String pin = input.nextLine();

        if (p.autentikasi(nomor, pin)) {

            System.out.println("1. Pembelian");
            System.out.println("2. Top Up");

            System.out.print("Pilih menu: ");
            int menu = input.nextInt();

            if (menu == 1) {
                System.out.print("Masukkan jumlah pembelian: ");
                double beli = input.nextDouble();
                p.pembelian(beli);

            } else if (menu == 2) {
                System.out.print("Masukkan jumlah top up: ");
                double topup = input.nextDouble();
                p.topUp(topup);
            }
        }

    }
}