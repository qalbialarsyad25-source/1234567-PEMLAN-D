public class Mobil {
    private String noPlat;
    private String warna;
    private String manufaktur;
    private double waktu;
    private double kecepatan;
    
    public void setNoPlat(String s){
        noPlat = s;
    }
    
    public void setWarna(String s){
        warna = s;
    }
    
    public void setManufaktur(String s){
        manufaktur = s;
    }
    
    public void setKecepatan(int i){
        kecepatan = i;
    }

    public void setWaktu(double a){
        waktu = a;
    }

    public double ubahSekon(){
        return waktu * 3600;
    }

    public double Rubahkecepatan(){
        return kecepatan * 5.0/18.0;
    }

    public double Hitungjarak(){
        double jarak = kecepatan * waktu;
        jarak = jarak/1000;
        return jarak;
    }
        
    public void displayMessage(){
        System.out.println("Mobil anda adalah bermerek " + manufaktur);
        System.out.println("mempunyai nomor plat " + noPlat);
        System.out.println("serta memililki warna " + warna);
        System.out.printf("%-10s%.2f%-10s%n","dan mampu menempuh kecepatan ",Rubahkecepatan()," m/s");
        System.out.println("Waktunya adalah " + ubahSekon());
        System.out.println("jarak yang ditempuh " + Hitungjarak() + " m");
    }      
}