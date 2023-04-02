package Java_Inflearn;
import java.util.Scanner;

public class Study_12 {
    public String solution(int num, String str) {
        String answer = "";

        for (int i = 0; i < num; i++) {
            int tmpNum = 0;
            int fir = 7;
            for (int x = (7 * i); x < 7 * i + 7; x++) {

                fir--;
                if (String.valueOf(str.charAt(x)).equals("#")) {
                    tmpNum += Math.pow(2, fir);
                }

            }

            answer += (char) tmpNum;
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Study_12 t = new Study_12();

        int num = sc.nextInt();
        String str = sc.next();

        String answer = t.solution(num, str);

        sc.close();

        System.out.println(answer);

    }

}
