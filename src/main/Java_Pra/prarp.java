package Java_Pra;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class prarp {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());// 총 부를 횟수
        String str = br.readLine();
        StringTokenizer st = new StringTokenizer(str, " ");

        int[] studentNo = new int[24];
        for(int i=0; i < n; i ++){
            studentNo[Integer.parseInt(st.nextToken())] += 1;

        }


    }
}
