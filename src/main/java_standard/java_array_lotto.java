package java_standard;

public class java_array_lotto  {
    public static void main(String[] args) {

        int[] ball = new int[45];

        for(int i=0; i<ball.length; i++){
            ball[i]=i;
        }
        for(int i=0; i <6; i++){
            int j = (int) (Math.random()*45);

            int temp = ball[i];
            ball[i] = ball[j];
            ball[j] = temp;
        }
        for(int i=0; i<6; i++){
            System.out.print(ball[i] +" ");
        }
    }
}
