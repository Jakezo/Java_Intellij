package Java_Pra;

public class fibonacci {
    public static int fibo(int n){
        if(n <=1)
            return n;
        else
            return fibo(n -2) + fibo(n-1);
    }

    public static void main(String[] args) {
        System.out.println(fibo(15));

    }
}
