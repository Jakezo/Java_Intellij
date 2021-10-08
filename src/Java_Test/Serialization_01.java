package Java_Test;

import java.io.ByteArrayOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Base64;

class Member implements Serializable {
    private String name;
    private String email;
    private int age;

    public Member(String name, String email, int age) {
        this.name = name;
        this.email = email;
        this.age = age;
    }

    @Override
    public String toString() {
        return String.format("Member{name='%s', email='%s', age='%s'}", name, email, age);
    }

}

public class Serialization_01 {
    public static void main(String[] args) {
        String byteString = serialize();
        System.out.println(byteString);
    }

    private static String serialize() {
        Member member = new Member("goodDabang", "wsh0821@station3.co.kr", 27);
        byte[] serializedMember;
        String serializedMemberStr = "";
        try (ByteArrayOutputStream baos = new ByteArrayOutputStream()) {
            try (ObjectOutputStream oos = new ObjectOutputStream(baos)) {
                oos.writeObject(member);
                serializedMember = baos.toByteArray();
                serializedMemberStr = Base64.getEncoder().encodeToString(serializedMember);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return serializedMemberStr;

    }
}
