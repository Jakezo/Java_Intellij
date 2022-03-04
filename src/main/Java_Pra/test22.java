package Java_Pra;

public class test22 {
    public static void main(String[] args) {

        String a = "1";
        String b = "bb";

        System.out.printf("a | value: %-4s, address: %4s\n", a, a.hashCode());
        System.out.printf("b | value: %-4s, address: %s\n", b, b.hashCode());
        System.out.println(a.hashCode());

        System.out.printf("bbbb>%-4s,%9s\n",a,a);

        a = a + b;

        System.out.printf("a | value: %-4s, address: %s\n", a, a.hashCode());
        System.out.printf("b | value: %-4s, address: %s\n", b, b.hashCode());
    }
}
