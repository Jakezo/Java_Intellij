package Java_Inflearn;

import java.util.HashMap;
import java.util.Scanner;

public class Study_0404 {

    public static void main(String[] args) {

        Study_0404 K = new Study_0404();
        Scanner sc = new Scanner(System.in);

        String S = sc.next();
        String T = sc.next();

        int answer = K.solution(S, T);
        System.out.println(answer);
    }

    private int solution(String s, String t) {

        char[] arrS =s.toCharArray();


        char[] arrT = t.toCharArray();

        HashMap<Character, Integer> freqMap = new HashMap<>();

//        for (int i = 0; i < arrT.length; i++) {
//            hashT.put(arrT[i], hashT.getOrDefault(arrT[i], 0) + 1);
//        }

        for (char c : arrT) {
            freqMap.put(c, freqMap.getOrDefault(c, 0) + 1);
        }

        int answer =0;
        int lt=0;
        HashMap<Character, Integer> freqMapWindow = new HashMap<>();
        for (int rt = 0; rt < arrS.length; rt++) {
            char currentChar = arrS[rt];
            freqMapWindow.put(currentChar, freqMapWindow.getOrDefault(currentChar, 0) + 1);

            if(rt -lt == arrT.length-1){
                if(freqMapWindow.equals(freqMap)){
                    answer++;
                }
                char leftChar = arrS[lt];
                freqMapWindow.put(leftChar, freqMapWindow.get(leftChar) -1);
                if(freqMapWindow.get(leftChar) ==0){
                    freqMapWindow.remove(leftChar);
                }
                lt++;
            }
        }
        return answer;
    }
}
