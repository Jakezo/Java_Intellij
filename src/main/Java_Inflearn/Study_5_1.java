package Java_Inflearn;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Study_5_1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Study_5_1 T = new Study_5_1();

        int n = sc.nextInt();
        String str = sc.next();

        System.out.println(T.solution(n,str));

        sc.close();
    }

    private char solution(int n, String str) {
        char answer=' ';
        HashMap<Character,Integer> hash = new HashMap<>();
        for (char c : str.toCharArray()) {
            hash.put(c, hash.getOrDefault(c, 0) + 1);
        }
        int max = Integer.MIN_VALUE;
        for (char key : hash.keySet()) {
            if(hash.get(key) > max){
                max = hash.get(key);
                answer = key;
            }
        }


        return answer;
    }
}
