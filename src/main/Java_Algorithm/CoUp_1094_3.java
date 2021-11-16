package Java_Algorithm;

import java.io.*;
import java.util.StringTokenizer;

// code up 문제 개선
public class CoUp_1094_3 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int num[] = new int[23];

        while(st.hasMoreTokens()){
            int temp = Integer.parseInt(st.nextToken());
            num[temp-1] +=1;
        }
        for(int i : num){
            bw.write(i+" ");
        }
        bw.flush();
        bw.close();
        br.close();

    }
}
