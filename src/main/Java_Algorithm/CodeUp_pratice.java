package Java_Algorithm;

import java.util.Scanner;

public class CodeUp_pratice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int male = 0;
        int feMale = 0;

        for(int i=0; i<5; i++){
            String gender = sc.next();
            if(!gender.equalsIgnoreCase("Male") && !gender.equalsIgnoreCase("Female")){
                System.out.println("Male 또는 FeMale 을 입력하세요!");
                i--;
            }
            if(gender.equalsIgnoreCase("Male")){
                male ++;
            }else if(gender.equalsIgnoreCase("FeMale")){
                feMale ++;
            }

        }
        System.out.println("남자는>>" + male);
        System.out.println("여자는>>" + feMale);

        sc.close();
    }
}
