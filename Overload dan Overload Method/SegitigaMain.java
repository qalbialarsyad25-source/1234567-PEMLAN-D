public class SegitigaMain {
    public static void main(String[] args) { 
        // Instansiasi objek pertama
        Segitigaa s1 = new Segitigaa(3); 
        s1.setTinggi(10); 
        s1.displayMessage(); 

        // Instansiasi objek kedua
        Segitigaa s2 = new Segitigaa(4, 10); 
        s2.displayMessage(); 

        // Jawaban Nomor 3: Instansiasi objek Lstring (SegitigaString)
        Segitigaa Lstring = new Segitigaa("5", "12");
        System.out.println("Objek dari String (Lstring):");
        Lstring.displayMessage();
    } 
}