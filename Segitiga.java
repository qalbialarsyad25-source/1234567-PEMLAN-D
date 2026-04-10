
public class Segitiga {
    double alas;
    double tinggi;

    //belajar tipe data reference dan tipe data primitive, membuat ilustrasi dari tipe data reference dan primitive
    //membahas penjelasan mengenai fungsi constructor 
    //kalau berkaitan dengan class itu pasti tipe data reference dan kalau tidak itu menunjukkan tipe data primitive
    //atribut, class dan penjelasan ketika terdapat 2 class kosong dan terisi dengan atribut
    //Standarisasi penulisan atau penamaan class
    //penjelasan mengenai ketika double dimasukkan ke integer dan sebaliknya, size dari double dan integer
    //Penamaan Underscore pada penamaan object class dan variabel
    //penjelasan mengenai null

    Segitiga(){}
    Segitiga(double alas, double tinggi){
        this.alas = alas;
        this.tinggi = tinggi;
    }

    double HitungLuas(){
        return 0.5 * this.alas * this.tinggi;
    }
    public static void main(String[] args) {

        int x = 10;
        int y = 20;
        int z = 30;

        x = y;
        y=50;

        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
        
        // Segitiga wow = new Segitiga(10, 10);
        // Segitiga wiw = new Segitiga(6, 10);
        // Segitiga wew = new Segitiga(8, 10);

        // wiw = wow;
        // wiw.alas = 20;
        // wow.alas = 40;

        // System.out.println(wow.HitungLuas());
        // System.out.println(wiw.HitungLuas());
        // System.out.println(wew.HitungLuas());
    }
}

