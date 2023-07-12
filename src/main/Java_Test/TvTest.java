package Java_Test;

class Tv {
    // Tv 의 속성 (멤버변수)
    String color;
    boolean power;
    int channel;

    void power(){
        power = !power;
    }
    void channelUp(){
        ++channel;
    }
    void channelDown(){
        --channel;
    }
}
public class TvTest {
    public static void main(String[] args) {
        Tv t;
        t = new Tv();

        t.channel=7;
        t.channelUp();
        t.channelUp();
        t.channelDown();

        System.out.println("현재 채널 t.channel = " + t.channel);
    }
}
