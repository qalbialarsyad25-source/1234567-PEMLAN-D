

public class combat {

    private combat(){

    }

    String namaBattle;

    static combat instance;;

    public static combat getInstance(){
        if(instance == null){
            instance = new combat();
        }
        return instance;
    }

    void battle(Character Hero, Character Musuh){
        if (Hero.weapon == null){
            System.out.println(Hero.Nama);
        }
    }
}
