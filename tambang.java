import java.util.*;

public class tambang {
    public static void main(String [] args){
        Scanner input = new Scanner (System.in);
        int N = input.nextInt();

        int[] tambang = {2,5,7};
        int gerakan = Integer.MAX_VALUE;

        int[] jarak = new int[N+1];
        for(int i = 1; i <= N; i++){
            jarak[i] = gerakan;
        }

        jarak[0] = 0;

        for(int i = 1; i <= N; i++){
            for(int goa : tambang){
                if(i - goa >= 0 && jarak[i - goa] != gerakan){
                    jarak[i] = Math.min(jarak[i], jarak[i - goa] + 1);
                }
            }
        }

        if(jarak[N] == gerakan){
            System.out.println(0);
        } else{
            System.out.println(jarak[N]);
        }
    }
}
