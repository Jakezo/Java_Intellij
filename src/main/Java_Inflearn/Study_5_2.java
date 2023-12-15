package Java_Inflearn;

import java.util.HashMap;
import java.util.Scanner;

public class Study_5_2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Study_5_2 T = new Study_5_2();

        String x = sc.next();
        String y = sc.next();

        System.out.println(T.solution(x,y));

        sc.close();
    }

    private String solution(String x, String y) {
        boolean isAnagram=true;
        String answer;
        HashMap<Character,Integer> mapX = new HashMap<>();
        HashMap<Character,Integer> mapY = new HashMap<>();

        for (char c : x.toCharArray()) {
            mapX.put(c, mapX.getOrDefault(c, 0) + 1);
        }
        for (char c : y.toCharArray()) {
            mapY.put(c, mapY.getOrDefault(c, 0) + 1);
        }
//        for (Character c : mapX.keySet()) {
//           if(mapY.containsKey(c)){
//               if(mapX.get(c) == mapY.get(c)){
//               }else {
//                   yn=false;
//                   break;
//               }
//           }else{
//               yn=false;
//            break;
//           }
//        }

        // Compare frequency maps
        for (Character c : mapX.keySet()) {
            if (!mapY.containsKey(c) || !mapX.get(c).equals(mapY.get(c))) {
                isAnagram = false;
                break;
            }
        }

    answer =isAnagram ? "YES" : "NO";

        return answer;
    }
}
