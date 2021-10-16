package Java_Pra;

public class test3 {
    public static void main(String[] args) {

        String str = "가나다라  ";

        boolean result = str.matches ("[0-9|a-z|A-Z|ㄱ-ㅎ|ㅏ-ㅣ|가-힝]*");
        System.out.println(result);

    }
}