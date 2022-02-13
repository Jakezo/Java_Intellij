package java_standard;

class Car {
    String color;
    String gearType;
    int door;

    Car() {} // 생성자

    Car(String color, String gearType, int door){ // 생성자
        this.color = color;
        this.gearType=gearType;
        this.door = door;
    }

    Car(String color){
      //  door = 5;
        this(color,"aut22os",4);
    }
}

public class CarTest {
    public static void main(String[] args) {
        Car c1 = new Car();
        c1.color = "white";
        c1.gearType = "autoCar";
        c1.door = 4;

        Car c2 = new Car("black","d",5);
        Car c3 = new Car("blue");

        System.out.println(c1.color+c1.gearType+c1.door);
        System.out.println(c2.color+c2.gearType+c2.door);
        System.out.println(c3.color+c3.gearType+c3.door);
    }
}
