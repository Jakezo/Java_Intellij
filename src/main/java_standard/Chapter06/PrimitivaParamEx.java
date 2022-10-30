package java_standard.Chapter06;

class Data { int x;}

class PrimitiveParamEx {
    public static void main(String[] args) {
        Data d = new Data();
        d.x = 10;
        System.out.println("main() : x = " + d.x);

        change(d);
        System.out.println("After change(d)");
        System.out.println("main() : x = " + d.x);
    }

//    static void change(int x) {   // 기본형 매개변수
//        x = 1000;
//        System.out.println("change() : x = " + x);
//    }
    static void change(Data d) {   // 기본형 매개변수
        d.x = 1000;
        System.out.println("change() : x = " + d.x);
    }

}
