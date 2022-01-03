package java_standard;

 class MtMath2 {

    long a, b;

    // 인스턴스변수 a,b만을 이용해서 작업하므로 매개변수가 필요없다.
    long add() {
        return a + b;
    }

    long subtract() {
        return a - b;
    }

    long multiply() {
        return a * b;
    }

    double divide() {
        return a / b;
    }

    //인스턴스변수와 관계없이 매개변수만으로 작업이 가능하다.
    static long add(long a, long b) {
        return a + b;  // a, b 는 지역변수
    }

    static long subtract(long a, long b) {
        return a - b;
    }

    static long multiply(long a, long b) {
        return a * b;
    }

    static double divice(double a, double b) {
        return a / b;
    }
}
    public class MtMathTest2 {
        public static void main(String[] args) {
            // 클래스메서드 호출. 인스턴스 생성없이 호출가능
            System.out.println(MtMath2.add(200L,100L));
            System.out.println(MtMath2.multiply(100L,100L));
            System.out.println(MtMath2.divice(10,5));

            MtMath2 mt = new MtMath2();// 인스턴스 생성

            mt.a = 200L;
            mt.b =100L;
            //인스턴스메스드는 객체생성 후에만 호출 가능함
            System.out.println(mt.add());
            System.out.println(mt.divide());
            System.out.println(mt.multiply());



        }
}
