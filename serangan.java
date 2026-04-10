import java.util.*;

public class serangan {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();

        int[] serangan = {4,7,11};
        int attack = Integer.MAX_VALUE;

        int[] hp = new int[n+1];
        for(int i = 1; i <= n; i++){
            hp[i] = attack;
        } 

        hp[0] = 0;

        for(int i = 1; i <= n; i++){
            for(int a : serangan){
                if(i - a >= 0 && hp[i - a] != attack){
                    hp[i] = Math.min(hp[i], hp[i - a]+1);
                }
            }
        }

        if (hp[n] == attack){
            System.out.println("-1");
        } else{
            System.out.println(hp[n]);
        }
    }
}
