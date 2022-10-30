package java_standard.Chapter06;


class CardDo {
    String kind;
    int number;
    static int width = 100;
    static int height = 250;
}

public class CardTest {
    public static void main(String[] args) {
        System.out.println("CardDo.width = " + CardDo.width);
        System.out.println("CardDo.heigh = " + CardDo.height);

        CardDo c1 = new CardDo();
        c1.kind = "Heart";
        c1.number = 7;

        CardDo c2 = new CardDo();
        c2.kind = "Spade";
        c2.number = 4;

        System.out.println("c1은 " + c1.kind + ", " + c1.number
                + "이며, 크기는 (" + c1.width + ", " + c1.height + ")" );
        System.out.println("c2은 " + c2.kind + ", " + c2.number
                + "이며, 크기는 (" + c2.width + ", " + c2.height + ")" );

        System.out.println("c1의 width와 height를 각각 50, 80으로 변경합니다.");
        c1.width = 50;
        c1.height = 80;

        System.out.println("c1은 " + c1.kind + ", " + c1.number
                + "이며, 크기는 (" + c1.width + ", " + c1.height + ")" );
        System.out.println("c2은 " + c2.kind + ", " + c2.number
                + "이며, 크기는 (" + c2.width + ", " + c2.height + ")" );

    }
}
