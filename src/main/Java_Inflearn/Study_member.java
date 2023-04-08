package Java_Inflearn;
 
class C {
    int v = 10;
 
    void m() {
        int v = 22;
        System.out.println(this.v);
    }
}
public class Study_member {

    public static void main(String[] args) {
        C c1 = new C();
        c1.m();

    }
    
}
