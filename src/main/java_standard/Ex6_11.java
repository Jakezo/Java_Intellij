package java_standard;


class Data_1{
    int value;
}

class Data_2 {
     int x;

    Data_2(int data){
        this.x = data;
        System.out.println(data);
    }
}

public class Ex6_11 {

    public static void main(String[] args) {
        Data_1 da = new Data_1();
        Data_2 d2 = new Data_2(3);

    }
}
