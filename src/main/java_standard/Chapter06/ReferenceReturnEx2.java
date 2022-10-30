package java_standard.Chapter06;

class Datadd{int x;}

public class ReferenceReturnEx2 {
    public static void main(String[] args) {
        Datadd d = new Datadd();
        d.x=10;

        Datadd d2 = copy(d);

        System.out.println("d.x = " + d.x);
        System.out.println("d2.x =" + d2.x);
    }

    static Datadd copy(Datadd d){
        Datadd tmp = new Datadd();
        tmp.x = d.x;

        return tmp;
    }
}
