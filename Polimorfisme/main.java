public class main {
    public static void main(String[]args){

        Kue[] daftarKue = new Kue[20];
        daftarKue[0] = new kuePesanan("Lapis", 2000, 2);
        daftarKue[1] = new kueJadi("Donat", 1500, 10);
        daftarKue[2] = new kuePesanan("Brownies", 3000, 1.5);
        daftarKue[3] = new kueJadi("Klepon", 1000, 20);
        daftarKue[4] = new kuePesanan("Bolu", 2500, 2);
        daftarKue[5] = new kueJadi("Onde-onde", 1200, 15);
        daftarKue[6] = new kuePesanan("Tart", 5000, 1);
        daftarKue[7] = new kueJadi("Pastel", 2000, 8);
        daftarKue[8] = new kuePesanan("Puding", 1800, 2.5);
        daftarKue[9] = new kueJadi("Risoles", 1500, 12);
        daftarKue[10] = new kuePesanan("Cheesecake", 6000, 1);
        daftarKue[11] = new kueJadi("Lemper", 1000, 25);
        daftarKue[12] = new kuePesanan("Kukus", 2200, 2);
        daftarKue[13] = new kueJadi("Bakpia", 1300, 18);
        daftarKue[14] = new kuePesanan("Muffin", 2700, 1.2);
        daftarKue[15] = new kueJadi("Bika Ambon", 2500, 6);
        daftarKue[16] = new kuePesanan("Pie", 3500, 1.3);
        daftarKue[17] = new kueJadi("Serabi", 1200, 10);
        daftarKue[18] = new kuePesanan("Tiramisu", 7000, 1);
        daftarKue[19] = new kueJadi("Putu", 1000, 14);

        for (Kue k : daftarKue){
            System.out.println(k);
        }
    }
}
