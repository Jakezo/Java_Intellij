package Java_Pra;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class fibonacciTest {
    static long arr[] = new long[1000];

    public static long fibonacci2(int i){
        if(i <= 1){
            return i;
        }else if(arr[i] !=0 ){
            return arr[i];
        }else {
            return arr[i] = fibonacci2(i-1)+fibonacci2(i-2);
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        //int n1 = Integer.parseInt(br.readLine());
        //int n2 = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine(),",");
        int n1 = Integer.parseInt(st.nextToken());
        int n2 = Integer.parseInt(st.nextToken());

        StringBuilder sb = new StringBuilder();

        sb.append("처음 fibo>> "+fibonacci2(n1));
        sb.append(" 다음 fibo>> " + fibonacci2(n2));

        System.out.println(sb);
    }
}
