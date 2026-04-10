public class Student{
    private static int counter;
    private String name; 
    private String address; 
    private int age; 
    private double mathGrade; 
    private double englishGrade; 
    private double scienceGrade;    
    private double average; 

    public Student(){ 
        this.name = ""; 
        this.address = ""; 
        this.age = 0; 
        this.counter++;
    }

    public Student(String n, String a, int ag, double math, double english, double science){ 
        this.name = n; 
        this.address = a; 
        this.age = ag; 
        this.mathGrade = math;
        this.englishGrade = english;
        this.scienceGrade = science;
        this.counter++;
    }

    public void setName(String n){
        name = n;
    }

    public void setAddress(String a){ 
        address = a; 
    }

    public void setAge(int ag){ 
        age = ag; 
    }

    public void setMath(int math){ 
        mathGrade = math; 
    }

    public void setEnglish(int english){ 
        englishGrade = english; 
    }

    public void setScience(int science){ 
        scienceGrade = science; 
    }

    public void jumlahObjek(){
        System.out.println("Total objek adalah : "+counter);
    }

    private double getAverage(){ 
        double result = 0; 
        result = (mathGrade+scienceGrade+englishGrade)/3; 
        return result; 
    }

    private boolean getNilaiAkhir(){
        boolean akhir = false;
        if (getAverage() >= 61){
            return akhir = true;
        } else {
            return akhir;
        }
    }

    public void displayMessage(){ 
        System.out.println("Siswa dengan nama "+name); 
        System.out.println("beralamat di "+address); 
        System.out.println("berumur "+age); 
        System.out.println("mempunyai nilai rata rata "+getAverage()); 
        System.out.println("Nilai akhir siswa "+getNilaiAkhir());
    } 
}
