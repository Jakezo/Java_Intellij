package java_study;

public class GenericBefore {
    public static void main(String[] args) {
        Object obj1 = "Hello";
        Object obj2 = 42;

        String str = (String) obj1; // Type casting to String
        int num = (int) obj2;       // Type casting to int

        System.out.println(str);    // Output: Hello
        System.out.println(num);    // Output: 42
    }
}
