public class Segitigaa {
    int alas, tinggi; 

    public Segitigaa(int alas) { 
        this.alas = alas; 
    }

    public Segitigaa(int alas, int tinggi) { 
        this.alas = alas; 
        this.tinggi = tinggi; 
    } 

    public Segitigaa(String alas, String tinggi) {
        this.alas = parseStringToInt(alas);
        this.tinggi = parseStringToInt(tinggi);
    }

    private int parseStringToInt(String data) {
        return Integer.parseInt(data);
    }

    public void setAlas(int alas) { 
        this.alas = alas; 
    } 

    public void setTinggi(int tinggi) { 
        this.tinggi = tinggi; 
    }

    public int getAlas() { 
        return alas; 
    }

    public int getTinggi() { 
        return tinggi; 
    }

    public double hitungLuas() { 
        double hasil = (double)(getTinggi() * getAlas()) / 2; 
        return hasil; 
    }

    public void displayMessage() {
        System.out.println("Alas: " + alas + ", Tinggi: " + tinggi);
        System.out.println("Hasil Luas Segitiga : " + hitungLuas()); 
        System.out.println("---------------------------");
    } 
}