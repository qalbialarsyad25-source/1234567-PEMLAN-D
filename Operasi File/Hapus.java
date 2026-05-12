import java.io.File;

public class Hapus {
    public static void main(String[] args) {
        File direktori = new File("Data");
        if (direktori.exists() && direktori.isDirectory()) {
            File[] daftarFile = direktori.listFiles();
            if (daftarFile != null) {
                for (File file : daftarFile) {
                    if (file.isFile()) {
                        if (file.delete()) {
                            System.out.println("File dihapus: " + file.getName());
                        } else {
                            System.out.println("Gagal menghapus: " + file.getName());
                        }
                    }
                }
            }

            if (direktori.delete()) {
                System.out.println("Direktori berhasil dihapus.");
            } else {
                System.out.println("Direktori gagal dihapus.");
            }

        } else {
            System.out.println("Direktori tidak ditemukan.");
        }
    }
}