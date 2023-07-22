package java_standard.collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class MapDemo  {
    public static void main(String[] args) {
        Map<String, Object> mapTest = new HashMap<>();

        mapTest.put("a",1);
        mapTest.put("ss",'c');

        char mm = (char)mapTest.get("ss");

        System.out.println("mm = " + mm);

    }
}
