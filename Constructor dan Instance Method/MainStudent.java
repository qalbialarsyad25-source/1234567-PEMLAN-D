import java.util.*;

public class MainStudent {
    public static void main(String[] args) { 
        Scanner input = new Scanner(System.in);

        System.out.println("Masukkan jumlah siswa yang akan dinilai : ");
        int jumlah = input.nextInt();
        input.nextLine();

        Student[] daftarStudents = new Student[jumlah];

        for (int i = 0; i < daftarStudents.length; i++){
            System.out.println("==== Input data Siswa ke "+(i+1)+"====");
            System.out.print("Nama : ");
            String nama = input.nextLine();
            System.out.print("Alamat : ");
            String alamat = input.nextLine();
            System.out.print("Umur : ");
            int umur = input.nextInt();
            System.out.print("Nilai Math : ");
            int math = input.nextInt();
            System.out.print("Nilai Eng : ");
            int eng = input.nextInt();
            System.out.print("Nilai Science : ");
            int science = input.nextInt();
            input.nextLine();

            daftarStudents[i] = new Student(nama, alamat, umur, math, eng, science);
        }

        for(Student s : daftarStudents){
            System.out.println("------------------------------------");
            s.displayMessage();
        }
        daftarStudents[0].jumlahObjek();
    }
}
