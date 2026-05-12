import java.io.File;

public class TampilFile {
    public static void main (String [] args){
        File direktori = new File(".");
        File[] daftarFile = direktori.listFiles();

        if (daftarFile != null){
            System.out.println("Daftar File dalam direktori");
            for (File file : daftarFile) {
                System.out.println(file.getName());
            }
        } else {
            System.out.println("Direktori tidak ditemukan");
        }
    }
}
