package java_study;

import java.util.Arrays;
import java.util.List;

public class LambdaExample {
    public static void main(String[] args) {
        //리스트에 있는 모든 요소를 출력하는 람다 표현식
        List<String> names = Arrays.asList("Alice","Bob","Carl");

        //람다 표현식 사용
        names.forEach(makeName -> System.out.println(makeName));


        //더 복잡한 람다 표현식
        names.forEach(makeName ->{
            if(makeName.startsWith("B")) {
                System.out.println("Starts with B = " + makeName);
            }
        });
    }
}
