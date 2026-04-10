
class Character {
    int hp;
    String Nama;
    Weapon weapon;
    static int totalCharacter = 0;

    //Didalam variavel static hanya bisa berisi variabel yang static juga(Memanggil variabel diluar method static)
    //kalua membuat variabel non static di dalam method static itu tidak masalah
    //Non static bisa dimasukkan ke dalam method atau varibale static tapi tidak berlaku sebaliknya
        
    public Character(String Nama, int hp){
        this.Nama = Nama;
        this.hp = hp;
        totalCharacter++;
    }

    public static int getTotalCharacter(){
        return totalCharacter;
    }

    void Attack(Character musuh){
        if(this.weapon == null){
            System.out.println(this.Nama + " tidak memiliki senjata untuk menyerang");
            return;
        } 
        System.out.println(this.Nama + " Menyerang " + musuh.Nama + " dengan " + weapon.nama);
        musuh.hp -= weapon.damage;
    }

    public int getHp(){
        return hp;
    }
}
