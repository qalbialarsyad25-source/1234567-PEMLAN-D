public class kueJadi extends Kue {
    private double jumlah;

    public kueJadi(String nama, double harga, double jumlah){
        super(nama, harga);
        this.jumlah = jumlah;
    }

    public void setJumlah(double jumlah){
        this.jumlah = jumlah;
    }

    public double getJumlah(){
        return jumlah;
    }

    public double hitungHarga(){
        double total = harga * getJumlah() * 2;
        return total;
    }

    @Override
    public String toString(){
        return String.format(
            super.toString() +
            "Total Harga    : %.2f\n",
            hitungHarga()
        );
    }
}
