public class app {
    public static void main(String[]args) throws Exception{
        
        Character Hero = new Character("Hero", 100 );
        Character Musuh = new Character("Musuh", 100);
        Weapon Kapak = new Weapon("Kapak", 5);
        Weapon tongkat = new Weapon("tongkat", 3);

        Hero.weapon = Kapak;
        Musuh.weapon = tongkat;

        Hero.totalCharacter = 10;
        Musuh.totalCharacter = 20;
        // hasilnya tetap sama karena disimpan di class atau memori yang sama sehingga ketika diubah line terakhir yang akan diambil di
        // kasus ini line musuh terakhir maka hasilnya 20 20 untuk total karakter

        System.out.println("Sebelum serangan");
        System.out.println(Hero.Nama + " HP " + Hero.getHp());
        System.out.println(Musuh.Nama + " HP " + Musuh.getHp());
        System.out.println("Total Character: " + Character.getTotalCharacter());
        System.out.println("Total Character: " + Character.totalCharacter);

        Hero.Attack(Musuh);
        Musuh.Attack(Hero);

        System.out.println("Setelah Serangan");
        System.out.println(Hero.Nama + " HP " + Hero.getHp());
        System.out.println(Musuh.Nama + " HP " + Musuh.getHp());
    }
}
