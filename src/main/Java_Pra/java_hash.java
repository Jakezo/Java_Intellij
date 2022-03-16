package Java_Pra;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class java_hash {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[] arr = br.readLine().toCharArray(); //toCharArray() 메소드는 문자열을 char형 배열로 바꿔준다. 반환되는 배열의 길이는 문자열의 길이와 같다.
        int num=0;
        for(int i=0; i<arr.length; i++){
            num += arr[i];

        }

        System.out.println(num);


    }
}
