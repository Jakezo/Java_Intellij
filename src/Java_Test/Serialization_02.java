package Java_Test;

import java.io.ByteArrayInputStream;
import java.io.ObjectInputStream;
import java.util.Base64;

public class Serialization_02 {
    public static void main(String[] args) {
        String serializedMemberStr = "rO0ABXNyABBKYXZhX1Rlc3QuTWVtYmVyAAAAAAAAAAECAARJAA9hZGRpdGlvbmFsRmllbGRJAANhZ2VMAAVlbWFpbHQAEkxqYXZhL2xhbmcvU3RyaW5nO0wABG5hbWVxAH4AAXhwAAAAAAAAAGN0AA5sYWlkYmFjay5jby5rcnQABmpha2V6bw==";// 이전에 얻은 serializedMemberStr
        byte[] serializedMember = Base64.getDecoder().decode(serializedMemberStr);
        deserialize(serializedMember);
    }
    private static void deserialize(byte[] serializedMember) {
        try (ByteArrayInputStream bais = new ByteArrayInputStream(serializedMember)) {
            try (ObjectInputStream ois = new ObjectInputStream(bais)) {
                Object o = ois.readObject();
                Member o1 = (Member) o;
                System.out.println(o1);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
