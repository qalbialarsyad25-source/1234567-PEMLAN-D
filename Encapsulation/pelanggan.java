
class pelanggan {
    private String nomorPelanggan;
    private String nama;
    private double saldo;
    private String pin;
    private int salahLogin = 0;
    private boolean diblokir = false;

    public pelanggan(String nomorPelanggan, String nama, double saldo, String pin) {
        this.nomorPelanggan = nomorPelanggan;
        this.nama = nama;
        this.saldo = saldo;
        this.pin = pin;
    }

    public boolean autentikasi(String nomor, String pinInput) {
        if (diblokir) {
            System.out.println("Akun diblokir!");
            return false;
        }

        if (nomor.equals(nomorPelanggan) && pinInput.equals(pin)) {
            salahLogin = 0;
            return true;
        } else {
            salahLogin++;
            System.out.println("PIN atau nomor pelanggan salah!");

            if (salahLogin >= 3) {
                diblokir = true;
                System.out.println("Akun diblokir karena 3x kesalahan!");
            }
            return false;
        }
    }

    public void topUp(double jumlah) {
        saldo += jumlah;
        System.out.println("Top up berhasil. Saldo sekarang: " + saldo);
    }

    public void pembelian(double jumlah) {
        double cashback = hitungCashback(jumlah);
        double saldoAkhir = saldo - jumlah + cashback;

        if (saldoAkhir < 10000) {
            System.out.println("Transaksi gagal! Saldo minimal harus 10000.");
        } else {
            saldo = saldoAkhir;
            System.out.println("Pembelian berhasil!");
            System.out.println("Cashback: " + cashback);
            System.out.println("Saldo sekarang: " + saldo);
        }
    }

    private double hitungCashback(double jumlah) {
        String jenis = nomorPelanggan.substring(0, 2);

        if (jenis.equals("38")) { // silver
            if (jumlah > 1000000) {
                return jumlah * 0.05;
            }
        }

        if (jenis.equals("56")) { // gold
            if (jumlah > 1000000) {
                return jumlah * 0.07;
            } else {
                return jumlah * 0.02;
            }
        }

        if (jenis.equals("74")) { // platinum
            if (jumlah > 1000000) {
                return jumlah * 0.10;
            } else {
                return jumlah * 0.05;
            }
        }

        return 0;
    }
}