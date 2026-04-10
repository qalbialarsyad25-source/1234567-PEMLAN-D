class buku {
    int JumlahLembar;
    double durasi;

    public buku(int a, double c){
        this.JumlahLembar = a;
        this.durasi = c;
    } 

    public double Pengerjaan(){
        int totalhalaman = JumlahLembar*2; 
        double TotalPengerjaan = totalhalaman / durasi;
        return TotalPengerjaan;
    }

    public void tampilan(){
        System.out.println("Total hari : "+ Pengerjaan() +" dengan jumlah lembar : "+ this.JumlahLembar);
    }
}
