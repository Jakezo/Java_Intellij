package Java_Pra;

public class EnumTest {
    // 기존에 상수를 정의하는 방법
    public static final String MALE = "MALE";
    public static final String FEMALE = "FEMALE";

    public static void main(String[] args) {
        String gender1;
        gender1 = EnumTest.MALE;
        gender1 = EnumTest.FEMALE;
        // MALE, FEMALE이 아닌 상수 값이 할당 될 때 //컴파일시 에러가 나지 않음. -> 문제점 발생.
        gender1 ="boy";

        Gender gender2;
        gender2 = Gender.MALE;
        gender2 = Gender.FEMALE;
        // 컴파일 시 의도하지 않는 상수 값을 체크할 수 있음.
        // Enum으로 정의한 상수값만 할당 받을 수 있음.
       // gender2 = "boy"; 에러난다
    }

}

// enum class를 이용해 Gender라는 새로운 상수들의 타입을 정의한다.
enum Gender {
    MALE,
    FEMALE;
}
