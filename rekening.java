
public class rekening {
    private String nama;
    private String akun;
    private String norek;
    private String pass;
    private double saldo;
    String validasi = "Tidak Valid";
    Boolean passbenar = false;

    public void SetAkun(String a){
        this.akun = a;
    }

    public void Nama(String a){
        if (a.length() < 4){
            this.nama = "Tidak Valid";
        }
        this.nama = a;
    }

    public void Norek(String b){
        if(b.length() < 8){
            System.out.println(validasi);
            this.norek = "Tidak Valid";
        } else {
            this.norek = b;
        }
        
    }

    public void pass(String a){
        this.pass = a;
        boolean HurufBesar = pass.matches(".*[A-Z].*");
        if(pass.length() >= 8 && HurufBesar){
            passbenar = true;
            this.pass = a;
        } else {
            System.out.println(validasi);
            this.pass = "-";
        }
    }

    public void setSaldo(double a){
        if (a < 0 || "-".equals(this.pass)){
            System.out.println(validasi);
            this.saldo = 0;
        } else {
            this.saldo = a;
        }
    }

    public void Tampilan(){
        System.out.println("Akun    : " + akun);
        System.out.println("Nama    : "+ nama);
        System.out.println("Norek   : "+ norek);
        System.out.println("Pass    : "+ pass);
        System.out.println("Saldo anda : "+ saldo);
    }
}
