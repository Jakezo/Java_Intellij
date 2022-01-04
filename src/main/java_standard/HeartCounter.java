package java_standard;

public class HeartCounter {
     static int count;
    // static 변수로 실행했을 때와 일반 변수로 실행했을 때의 차이점

    //int count;
    // static int count; // static 을 붙이면 좋아요 갯수가 달라짐




            public HeartCounter(){
        this.count ++;
                System.out.println("좋아요 갯수 : " +this.count);

            }

    public static int getCount(){
        return count;
    };

    public static void main(String[] args) {
        HeartCounter hc1 = new HeartCounter();
        HeartCounter hc2 = new HeartCounter();

        System.out.println("총 count " + HeartCounter.getCount());
    }
}
