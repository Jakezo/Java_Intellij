package Java_Pra;

class Tv{
    //Tv 의 속성(멤버변수)
    String color;
    boolean power;
    int channel;

    // Tv 의 기능(메서드)
    void power() {
        power = !power; // tv를 키거나 끄는 메소드
    }
    void channelUp() {
        ++channel;
    }
    void channelDown() {
        --channel;  // Tv 의 채널을 낮추는 기능을 하는 메서드
    }
}
public class TvTest2 {
    public static void main(String[] args) {
        Tv t1 = new Tv(); //
        Tv t2 = new Tv(); //
        System.out.println("t1의 cannel 값은" + t1.channel +"입니다.");
        t1.channel = 1;

        int a = (int)Math.sqrt(4.0);
        System.out.println(a);

    }
}
