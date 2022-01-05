package java_standard;

class Car2{
    String color;
    String gearType;
    int door;

    Car2(){
        this("white","auto",4);
    }
    Car2(Car2 c){// 인스턴스 복사를 위한 생성자.
        color = c.color;
        gearType = c.gearType;
        door = c.door;
    }
    Car2(String color,String gearType,int door){
        this.color = color;
        this.gearType=gearType;
        this.door=door;
    }
}

public class CarTest3 {

}
