public class Jaket {
    private int jumlah;
    private int harga;

    public Jaket(int jumlah, int harga) {
        this.jumlah = jumlah;
        this.harga = harga;
    }

    public void cekDiskon(char tipe) {
        if (tipe == 'A' && jumlah > 100) {
            harga = 95000;
        } else if (tipe == 'B' && jumlah > 100) {
            harga = 120000;
        } else if (tipe == 'C' && jumlah > 100) {
            harga = 160000;
        }
    }

    public int getTotal() {
        return jumlah * harga;
    }

    public int getJumlah() {
        return jumlah;
    }
}