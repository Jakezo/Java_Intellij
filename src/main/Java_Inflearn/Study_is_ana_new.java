package Java_Inflearn;

import java.util.HashMap;
import java.util.Scanner;

public class Study_is_ana_new {

    public String test(String A, String B) {
        String answer ="YES";
        HashMap<Character, Integer> map = new HashMap();

        for(char x : A.toCharArray()) {
            map.put(x, map.getOrDefault(x, 0) + 1);
        }


        for(char x : B.toCharArray()) { // 하나하나식 줄여나간다
            if(!map.containsKey(x) || map.get(x) ==0) {
                answer = "NO";
            }else {
                map.put(x, map.get(x)-1);
            }
        }
        return answer;
    }

    public static void main(String[] args){
        Study_is_ana_new t = new Study_is_ana_new();
        Scanner kb = new Scanner(System.in);

        String strA = kb.next();
        String strB = kb.next();

        System.out.println(t.test(strA, strB));
    }
}