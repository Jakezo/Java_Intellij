package JavaStudy;

public class JavaStudy_01 {
    public static void main(String[] args) {

        int[] ball = new int[45];

        for(int i=0; i< ball.length; i++)
            ball[i] = i+1;
        int temp;
        int j;

        for(int i=0; i< 6; i++) {
            j = (int)(Math.random() * 45); // 0~ 44 범위의 임의의 값을 얻는다
            temp = ball[i];
            ball[i] = ball[j];
            ball[j] = temp;
        }

        for(int i=0; i<10; i++){
            System.out.println((i+1)+"번째 로또번호" +  ball[i]);
        }
    }
}
