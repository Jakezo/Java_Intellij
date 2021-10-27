package Java_Test;

import java.io.ByteArrayOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Base64;

class Member implements Serializable {
    private static final long serialVersionUID = 1L;  // 이것이 id로 식별자 역할을 한다.
    private String name;
    private String email;
    private int age;
    private int additionalField;
    private int additionalField2;

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
        Member member = new Member("jakezo", "laidback.co.kr", 99);
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
