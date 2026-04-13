public class kuePesanan extends Kue{
    private double berat;

    public kuePesanan(String nama, double harga, double berat){
        super(nama, harga);
        this.berat = berat;
    }

    public void setBerat(double berat){
        this.berat = berat;
    }

    public double getBerat(){
        return berat;
    }

    public double hitungHarga(){
        double total = harga * getBerat();
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
