public abstract class Kue{
    private String nama;
    public double harga;

    public Kue(String nama, double harga){
        this.nama = nama;
        this.harga = harga;
    }

    public void setNama(String nama){
        this.nama = nama;
    }

    public String getNama(){
        return nama;
    }

    public abstract double hitungHarga();

    @Override
    public String toString(){
        return String.format(
            "Nama           : %s\n" +
            "Harga          : %.2f\n",
            nama,harga
        );
    }
}