package Java_Pra;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class ttest3_1 {
    static double len = 0;
    public static void recur(HashMap <Double, Double> dp, double n){
        len++;
        if(dp.containsKey(n)){ // 맵에서 보낸 키값이 있으면
            System.out.println(dp.get(n)); // key값 n 의 value 얻기
            len +=(dp.get(n)-1);
            return;   // 메모이제이션 (Dp 동적계획법)
        }
        if(n == 1){
            return;
        }else if(n%2 == 0){
            recur(dp, n/2);
        }else{
            recur(dp, 3*n+1);
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        double max = 0;
        double start = Double.parseDouble(st.nextToken());
        double end = Double.parseDouble(st.nextToken());
        HashMap <Double,Double> dp = new HashMap<>();
        double ck = 0;
        dp.put(1.0, 1.0);
        for(double i = start; i <=end; i++){
            len = 0;
            recur(dp, i);
            dp.put(i, len);
            if(len > max){
                max = len;
                ck = i;
            }
        }
        System.out.println(String.format("%.0f", ck) + " " + String.format("%.0f", max));


    }

}
