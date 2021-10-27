package Java_Pra;

public class MyMathTest {
    public static void main(String[] args) {

        MyMath mm = new MyMath();
        long result1 = mm.add(5L, 3L);
        System.out.println(result1);

        double result4 = mm.divide(5, 3L);

        System.out.println(result4);
    }

    static class MyMath{
        long add(long a, long b){
            long result = a + b;
            return result;
            // return a + b;
        }
        long substract(long a, long b){
            return a - b;
        }
        long multiply(long a, long b) {
            return a * b;
        }
        double divide(double a, double b){
            return a/ b;
        }

    }
}

