package Java_Pra;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FlowEx28 {
    public static void main(String[] args) throws IOException {

        int input = 0;
        int answer = 0;

        answer = (int)(Math.random() * 100) + 1; // 1~ 100 사이의 임의의 수를 저장 math.random 은  double 형 난수 반환
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        do {
            System.out.println("1과 100 사이의 정수를 입력하세요");
            String tmp = br.readLine();
            input = Integer.parseInt(tmp);

            if(input > answer){
                System.out.println("더 작은수로 시도");
            }else if(input < answer ){
                System.out.println("더 큰수로 시도");
            }
        } while (input !=answer);
        System.out.println("정답입니다");
        br.close();

    }
}
