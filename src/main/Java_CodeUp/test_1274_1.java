package Java_CodeUp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class test_1274_1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        // 먼저 소수라고 초기화
        boolean isPrime = true;

        // n/2 까지 for문 반복 => 약수는 1을 제외하고 2가 ㅗ치소약수
        // 2부터 시작해야한다.
        for(int i=2; i<=n/2; i++){
            if(n%i ==0){
                isPrime = false;
                break;
            }
        }

        System.out.println(isPrime ? "prime":"not prime");
        br.close();
    }
}
