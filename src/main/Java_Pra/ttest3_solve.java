package Java_Pra;

import java.io.*;
import java.util.*;

public class ttest3_solve {
    static double len = 0;
    public static void recur(HashMap <Double, Double> dp, double n){
        len++;
        if(dp.containsKey(n)){
            System.out.println(dp.get(n));
            len += (dp.get(n)-1);
            return;
        }
        if(n == 1){
            return;
        }else if(n%2 == 0){
            recur(dp,n/2);
        }else{
            recur(dp, 3*n+1);
        }
    }
    public static void main(String[] args) throws NumberFormatException,IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        double max = 0;
        double start = Double.parseDouble(st.nextToken());
        double end = Double.parseDouble(st.nextToken());
        HashMap <Double, Double> dp = new HashMap<>();
        double ck = 0;
        dp.put(1.0, 1.0);
        for(double i = start; i<=end;i++){
            len = 0;
            recur(dp, i);
            dp.put(i, len);
            System.out.println(dp);
            if(len > max) {
                max = len;
                ck = i;
            }
        }

        System.out.println(String.format("%.0f", ck) + " " + String.format("%.0f", max));

    }
}