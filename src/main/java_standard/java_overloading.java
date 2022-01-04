package java_standard;

public class java_overloading {
    public static void main(String[] args) {
        MyMath3 m3 = new MyMath3();
        System.out.println("m3.add(3,3)결과:" + m3.add(3,3) );
        System.out.println("m3.add(3L,3)결과:" + m3.add(3L,3) );
        System.out.println("m3.add(3L,3L)결과:" + m3.add(3L,3L) );

        int[] a ={10,20,30};
        System.out.println("mm.add(a) 결과: "+m3.add(a));
    }
}

class MyMath3 {
    int add(int a, int b){
        System.out.print("int add(int a, int b) -");
        return a+b;
    }
    long add(int a, long b){
        System.out.print("long add(int a, long b) -");
        return a+b;
    }
    long add(long a, long b){
        System.out.print("long add(long a, long b)=");
        return a+b;
    }
    int add(int[] a){
        System.out.print("int add(int[]) a) -");
        int result = 0;
        for(int i=0; i < a.length; i++){
            result += a[i];
        }
        return result;
    }
}
