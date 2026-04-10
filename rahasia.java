import java.util.*;

public class rahasia {
    public static void main(String[] args){
        Scanner input = new Scanner (System.in);
        int n = input.nextInt();

        int[] langkah = {3, 6, 9};
        int besar = Integer.MAX_VALUE;

        int[] jarak = new int[n+1];
        for(int i = 1; i<= n; i++){
            jarak[i] = besar;
        }

        jarak[0] = 0;

        for(int i = 1; i <= n; i++){
            for(int langka : langkah){
                if(i - langka >= 0 && jarak[i - langka] != besar){
                    jarak[i] = Math.min(jarak[i], jarak[i - langka] + 1);
                }
            }
        }

        if(jarak[n] == besar){
            System.out.println(0);
        } else {
            System.out.println(jarak[n]);
        }

        input.close();
    }
}
