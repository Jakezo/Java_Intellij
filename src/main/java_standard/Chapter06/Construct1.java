package java_standard.Chapter06;




public class Construct1 {
    public static void main(String[] args) {
        Person2 pr = new Person2(12, "jake");
        System.out.println(pr.personInfo());

        System.out.println("whatif? "+pr.Person22(123));
        System.out.println("whatif? "+pr.Person22("아웅"));


    }
}

class Person2 {
    int age;
    String name;

    public Person2(int age, String name){
        this.age = age;
        this.name=name;
    }

    public int Person22(int age){
        this.age = age;

        return age;
    }

    public String Person22(String gg){
        name = gg;

        String ff = name+"ff라";

        return ff;
    }

    public  String personInfo(){
        return "이름>>"+name+"  나이>>"+age;
    }
}
