package Java_Pra;

import java.util.StringTokenizer;

public class Pra_StringTokenizer {
    public static void main(String[] args) {
        String source = "Hi I'm Jake Jo!!";

        StringTokenizer tokenizer1 = new StringTokenizer(source);
        while (tokenizer1.hasMoreTokens()){
            System.out.println("tok1 token>>> " + tokenizer1.nextToken());
        }

        StringTokenizer tokenizer2 = new StringTokenizer(source, " ");
        while (tokenizer2.hasMoreTokens()){
            System.out.println("tok2 token >>> " + tokenizer2.nextToken());
        }

        StringTokenizer tokenizer3 = new StringTokenizer(source," ",true);
        while (tokenizer3.hasMoreTokens()){
            System.out.println("tok3 token>>>>>" + tokenizer3.nextToken());
        }



    }
}
