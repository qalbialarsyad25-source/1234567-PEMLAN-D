import java.util.Scanner;

public class MainJacket {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan jumlah Jaket A: ");
        int jumlahA = input.nextInt();

        System.out.print("Masukkan jumlah Jaket B: ");
        int jumlahB = input.nextInt();

        System.out.print("Masukkan jumlah Jaket C: ");
        int jumlahC = input.nextInt();

        Jaket jaketA = new Jaket(jumlahA, 100000);
        Jaket jaketB = new Jaket(jumlahB, 125000);
        Jaket jaketC = new Jaket(jumlahC, 175000);

        jaketA.cekDiskon('A');
        jaketB.cekDiskon('B');
        jaketC.cekDiskon('C');

        int totalA = jaketA.getTotal();
        int totalB = jaketB.getTotal();
        int totalC = jaketC.getTotal();

        int totalSemua = totalA + totalB + totalC;

        System.out.println("\n=== Rincian Harga ===");
        System.out.println("Total Jaket A: Rp " + totalA);
        System.out.println("Total Jaket B: Rp " + totalB);
        System.out.println("Total Jaket C: Rp " + totalC);
        System.out.println("-------------------------");
        System.out.println("Total Bayar: Rp " + totalSemua);

        input.close();
    }
}