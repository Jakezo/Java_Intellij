package Java_Inflearn;

import java.util.HashMap;
import java.util.Scanner;

public class Study_is_ana {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Study_is_ana T = new Study_is_ana();

        String x = sc.next();

        String y = sc.next();

        System.out.println(solution(x,y));

    }

    private static String solution(String x, String y) {
        String answer="";
        boolean isAnagram=false;
        HashMap<Character, Integer> mapX = new HashMap<>();
        HashMap<Character, Integer> mapY = new HashMap<>();

        for(char xc : x.toCharArray()){
            mapX.put(xc, mapX.getOrDefault(xc, 0) + 1);
        }


        for(char xy : y.toCharArray()){
            mapX.put(xy, mapY.getOrDefault(xy, 0) + 1);
        }
//        // Compare frequency maps
//        for (Character c : mapX.keySet()) {
//            if (!mapY.containsKey(c) || !mapX.get(c).equals(mapY.get(c ))) {
//                isAnagram = false;
//                break;
//            }
//        }

        isAnagram = mapX.entrySet().stream()
                .allMatch(entry -> mapY.containsKey(entry.getKey()) && entry.getValue().equals(mapY.get(entry.getKey())));

        answer =isAnagram ? "YES" : "NO";

        return answer;
    }
}
