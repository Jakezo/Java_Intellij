package java_standard;
class Tv{
    String color;
    boolean power;
    int channel;

    void power() {power = !power;}
    void channelUp() { ++channel;}
    void channelDown() { -- channel;}
}


public class Ex6_7 {
    public static void main(String[] args) {
        Tv[] tvArr = new Tv[3];

        for(int i=0; i<tvArr.length; i++){
            tvArr[i] = new Tv();
            tvArr[i].channel = i + 10;
            System.out.printf("tvArr[%d].channel=%d%n",i,tvArr[i].channel);
        }

    }
}
