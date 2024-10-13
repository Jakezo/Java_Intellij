package java_study;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MethodReferenceExample {
    public static void main(String[] args) {
        // 리스트에 있는 모든 요소들을 출력하는 레퍼런스
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie");

        //메서드 레퍼런스 사용
        names.forEach(System.out::println);
        // 사용자 정의 메서드를 메서드 레퍼런스로 사용
        names.forEach(MethodReferenceExample::printName);
    }

    // 메서드 레퍼런스로 사용할 메서드 정의
    public static void printName(String name) {
        System.out.println("Name: " + name);
    }
}
