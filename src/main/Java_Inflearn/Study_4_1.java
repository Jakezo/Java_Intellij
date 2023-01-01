package Java_Inflearn;

import java.util.Scanner;

public class Study_4_1 {
    public String[] solution(String[] strData){
        int len = strData.length;
        for(int i=0; i<len; i++){
            int strLen = strData[i].length();
            String reverse="";
            for(int j=strLen-1; j>=0; j--){
                reverse= reverse +strData[i].charAt(j);
            }
            strData[i] = reverse;
        }
        return strData;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        Study_4_1 cls = new Study_4_1();

        String[] str = new String[num];
        for(int i=0; i<num; i++){
            str[i] = sc.next();
        }
        String[] result=cls.solution(str);

        for (String x:result
             ) {
            System.out.println(x);
        }
    }
}
