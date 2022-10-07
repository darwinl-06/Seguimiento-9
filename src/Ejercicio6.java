import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;

public class Ejercicio6 {

    public static void main(String[] args) {
        Scanner lt=new Scanner(System.in);
        int t=lt.nextInt();
        while(t>0){
            int n,k;
            n=lt.nextInt();
            k=lt.nextInt();
            ArrayList<Long> water=new ArrayList<>();
            for(int i=0;i<n;i++){
                water.add((long)lt.nextInt());
            }
            long sum=0;
            water.sort(Collections.reverseOrder());
            for(int i=0;i<=k;i++){
                sum+=water.get(i);
                water.set(i, 0L);
            }
            System.out.println(sum);
            t--;
        }
    }

}
