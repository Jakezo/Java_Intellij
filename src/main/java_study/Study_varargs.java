package java_study;

public class Study_varargs {
    public void callMethod() {

        // 파라미터가 없음
        test();

        // 파라미터가 한개
        test("A");

        // 파라미터가 두개
        test("A", "B");

        // 배열로 전달
        test(new String[]{"A", "B", "C"});
    }

    public void test(String... param) {
        System.out.println("--------------------");
        for (String s : param) {
            System.out.println("s = " + s);
        }
        System.out.println("+++++++++++++=");

    }

    public static void main(String[] args) {

        Study_varargs kb = new Study_varargs();
        kb.callMethod();
    }
}
