package Java_Algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class CoUp_1092_3 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());

        int common = 2;

        // 공약수를 이용한 방법

        List<Integer> list = new ArrayList<Integer>(); //공약수를 저장할 List
        while(common <= a || common <=b || common <= c ){
            boolean blA = false, blB = false, blC = false;

            if (a%common == 0) blA = true;
            if (b%common == 0) blB = true;
            if (b%common == 0) blC = true;

            // 2개이상 false 라면 공약수가 없다는 뜻임
            if ( (!blA && !blB) || (!blB && !blC) || (!blA && !blC) ) {
                common++;
                continue;
            }
            // 특정수의 공약수 일때 공약수를 list 저장하고 해당 숫자를 공약수로 나눈 값으로 바꾸기
            if(blA && blB && blC){
                a /= common;
                b /= common;
                c /= common;
                list.add(common);
            }else {
                if (blA && blB){
                    a /= common;
                    b /= common;
                    list.add(common);
                } else if (blB && blC){
                    b /= common;
                    c /= common;
                    list.add(common);
                } else if (blC && blA){
                    a /= common;
                    c /= common;
                    list.add(common);
                }
            }
        }
        int result = a*b*c;
        // 리스트에서 공약수를 하나씩 꺼내어 결과에 곱하기\
        for (int i=0; i <list.size(); i++){
            result *=list.get(i);
        }
        System.out.println(result);
        br.close();

    }
}
