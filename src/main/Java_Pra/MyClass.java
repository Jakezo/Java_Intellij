package Java_Pra;

public class MyClass implements MyInterface {  // 옵션 엔터로 구현


    @Override
    public void myMethod() {
        System.out.println("MyClass.myMethod");
    }

    @Override
    public void x() {
        System.out.println("MyClass.x");
    }

    @Override
    public void y() {
        System.out.println("MyClass.y");
    }
}