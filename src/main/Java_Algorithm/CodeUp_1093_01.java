package Java_Algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class CodeUp_1093_01 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n  = Integer.parseInt(br.readLine()); // 총 부를 회수
        String str = br.readLine();
        StringTokenizer st = new StringTokenizer(str," ");

        int[] studentNo = new int[24];
        for(int i=0; i <n; i++){
            studentNo[Integer.parseInt(st.nextToken())] +=1; // 불린 번호의 index 에 1 추가하기
        }
        for (int i=1; i< studentNo.length; i++) {
            sb.append(studentNo[i]).append(" "); // 각 index별 총 불린 횟수 출력
        }
        System.out.println(sb);

    }
}
