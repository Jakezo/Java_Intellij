package JavaStudy;

public class java_test1 {

    public static void main(String[] args) {

        String ww = "123,33";

    String vv=    ww.replaceAll(System.getProperty("line.separator"),"").replace(",","");

        System.out.println(vv);
    }
}
