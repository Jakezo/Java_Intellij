package Java_Inflearn;

import java.util.Scanner;

public class Study_02_11_plus {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Study_02_11_plus kb = new Study_02_11_plus();
        int n = sc.nextInt();
        int[][] arr = new int[n][5];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 5; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        int answer = kb.solution(n, arr);
        System.out.println(answer);
    }

    public static int countOnes(int[] arr) {
        int count = 0;

        for (int num : arr) {
            if (num == 1) {
                count++;
            }
        }

        return count;
    }


    public int solution(int n, int[][] arr) {
        int min = 0;
        int maxValue = 0;
        int[] a = new int[n]; //카운트용

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 5; j++) {
                for (int z = 0; z < n; z++) {
                    if (i != z && arr[i][j] == arr[z][j]) {
                        a[i] = 1;
                        break;
                    }
                }
            }
            int cnt = countOnes(a);
            a=new int[n];
            if (cnt > min) {
                min = cnt;
                System.out.println("cnt = " + cnt);
                System.out.println("i = " + i);
                maxValue = i;
            }
        }


        return maxValue;
    }
}
