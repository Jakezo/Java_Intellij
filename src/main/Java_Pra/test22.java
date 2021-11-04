package Java_Pra;

public class test22 {
    public static void main(String[] args) {

        String a = "aa";
        String b = "bb";

        System.out.printf("a | value: %-4s, address: %s\n", a, a.hashCode());
        System.out.printf("b | value: %-4s, address: %s\n", b, b.hashCode());

        a = a + b;

        System.out.printf("a | value: %-4s, address: %s\n", a, a.hashCode());
        System.out.printf("b | value: %-4s, address: %s\n", b, b.hashCode());
    }
}
