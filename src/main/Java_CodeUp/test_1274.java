package Java_CodeUp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 소수란, 약수가 자기 자신 두개 뿐인 수를 말한다
// 어떤 수가 입력되면 그 수가 소수인지 판단하시오
public class test_1274 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int add=0;

        int isSosu= Integer.parseInt(br.readLine());
        int arr[] = new int[isSosu];

        for(int i=1; i<=isSosu; i++){
            if(isSosu%i ==0){
                arr[add]=i;
                add++;
            }
        }

        for(int j=0; j<add; j++){
            if((arr[0]==1)&&(arr[1]==isSosu) ){
                System.out.println("prime");
                break;
            }else{
                System.out.println("not prime");
                break;
            }
        }

    }
}
