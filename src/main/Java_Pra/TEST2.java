package Java_Pra;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TEST2 {
    public static String StringReplace(String str){
        String match = "[^\uAC00-\uD7A3xfe0-9a-zA-Z\\s]";
        str =str.replaceAll(match, "");
        return str;
    }

    public static void main(String[] args) {
        String ads = "12@@ !! 3@@";

        String ss = StringReplace(ads);
        String match = "[^\uAC00-\uD7A30-9a-zA-Z]";
        System.out.println(ss);
        String testWord = "abcABC ";
        Matcher matchTest;
        matchTest = Pattern.compile(match).matcher(testWord);
        System.out.println("특수문자 포함: "+ matchTest.find());

    }
}
