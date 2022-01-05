package java_standard;

class Data1{

}
class Data2 {
    int value;

    Data2(int x){
        value = x;
    }
}

public class ConstructorTest { //기본생성자가 컴파일러에 의해서 추가되는 경우는 클래스에 정의된 생성자가 하나도 없을 때 뿐이다
    public static void main(String[] args) {

        Data1 data1 = new Data1();
        Data2 data2 = new Data2(2);

    }
}
