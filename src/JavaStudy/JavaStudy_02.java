package JavaStudy;

public class JavaStudy_02 {
    public static void main(String[] args) {

        int[] score = {22, 33,14 ,55,11,23};

        int max = score[0];
        int min = score[0];

        for(int i=1; i< score.length; i++){
            if(score[i] > max){
                max = score[i];
            }else if(score[i] < min){
                min = score[i];
            }
        }
        System.out.println("최대값:" +  max);
        System.out.println("최소값:" + min);
    }
}
