package Java_CodeUp;
/*다음과 같은 n*m 배열 구조를 출력해보자.

입력이 3 4인 경우 다음과 같이 출력한다.
1 3 6 9
2 5 8 11
4 7 10 12

입력이 4 5인 경우는 다음과 같이 출력한다.
1 3 6 10 14
2 5 9 13 17
4 8 12 16 19
7 11 15 18 20

입력이 n m인 경우의 2차원 배열을 출력해보자.
00, 10, 01 , 20, 11,03,22,13,04
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class test_1476_1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(),",");
        StringBuffer sb = new StringBuffer();


        int num1 = Integer.parseInt(st.nextToken());
        int num2 = Integer.parseInt(st.nextToken());

        int[][] arr = new int[num1][num2];
        // 기본 n 차원 배열 출력

        //초기값 설정
        int number =1;
        for(int i=0; i<=num1+num2-2; i++){
            // 열반복
            for(int j=0; j<num2; j++ ){
                for(int x=0; x<num1; x++){
                    if (j+x ==i){
                        arr[x][j]= number++;
                        break;
                    }
                }
            }
        }


        for (int[] i:arr) {
            for(int j : i){
                sb.append(j).append(" ");
            }
            sb.append("\n");
        }
        System.out.print(sb);

        br.close();


    }
}
