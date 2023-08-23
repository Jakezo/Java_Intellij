package Java_Inflearn;

   

public class stu {

    public static void main(String[] args) {
        ExampleClass obj1 = new ExampleClass(); // 기본 생성자 호출, value1과 value2가 0으로 초기화되지 않음
        ExampleClass obj2 = new ExampleClass(10, 20); // 인자가 있는 생성자 호출, va


        // obj1과 obj2의 값 출력
        System.out.println("obj1의 value1: " + obj1.getValue1()); // obj1의 value1: 0
        System.out.println("obj1의 value2: " + obj1.getValue2()); // obj1의 value2: 0
        System.out.println("obj2의 value1: " + obj2.getValue1()); // obj2의 value1: 10
        System.out.println("obj2의 value2: " + obj2.getValue2()); // obj2의 value2: 20
    }
    
}
