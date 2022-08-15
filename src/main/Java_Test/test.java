package Java_Test;

public class test {
    public static void main(String[] args) {
        double s = 1.1;
        double d = 0.1;

        double result = s+d;

        // 1.2 가아님..
        String resultValue ="";

        if(result == 1.2){
            resultValue = "1.2 다";
        }else{
            resultValue="1.2가아니다 ";
        }

        System.out.println(resultValue+"그 값은 :"+result+"이다");
    }
}
