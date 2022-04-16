import java.io.*;
import java.util.StringTokenizer;

/** 입력 Permalink
두 실수를 입력받는다.

출력 Permalink
두 실수의 곱을 소수 둘째자리까지 출력한다.
* */

public class tesst {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));


        Double num1 = Double.parseDouble(st.nextToken());
        Double num2 = Double.parseDouble(st.nextToken());

        // 소수 둘째자리까지 표현하기 위한 format

        bw.append(String.format("%.1f", num1*num2));
        bw.flush();
        bw.close();
        br.close();



    }
}
