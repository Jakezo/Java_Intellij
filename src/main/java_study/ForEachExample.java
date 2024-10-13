package java_study;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ForEachExample {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Alice", "Bob", "Charlie");

        //forEach에서 사용할 Consumer 정의
        Consumer<String> action = name -> System.out.println("Name:w " + name);

        //forEach 메서드의 내부 동작
        for (String name : names) {
            action.accept(name);
        }
    }
}
