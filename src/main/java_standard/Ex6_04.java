package java_standard;

public class Ex6_04 {
    public static void main(String[] args) {

        MyMath mm = new MyMath();


        mm.printGugudan(3); // 구구단 3단을 출력
    }
    // %n 은 줄바꿈

}
class MyMath {
    void printGugudan(int dan){
        for(int i=1; i <=9; i++){
            System.out.printf("%d * %d = %d%n",dan,i,dan*i);
        }
    }

    long add(long a, long b){
        long result = a + b;
        return result;
    }
}