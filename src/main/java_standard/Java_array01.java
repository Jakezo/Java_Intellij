package java_standard;

public class Java_array01 {

    public static void main(String[] args) {

        int[] score = new int[5];

        score[0] = 100;

        int[] score2 = {100, 33, 11, 22, 33};

        int[] score3 = new int[]{100, 90, 30, 33};

        System.out.println(score3.length);

        int[][] scores = {
                {100,22,33},
                {1,2,3},
                {33,44,11}
        };

        int length = scores.length;
        System.out.println(length);

        for(int i=0; i< scores.length; i++){
            System.out.println();
            for(int j=0; j<scores[i].length; j++){
                System.out.print(scores[i][j]+" ");
            }
        }

        int[] number = {1,2,3,4,5};
        int [] newNumber = new int[10];

        int[] arr1 ={0,1,2,3,4};
        int[] arr2 ={'A','B','C','D','E'};

        System.arraycopy(arr1,0,arr2,0,3);
        for(int s:arr2) {
            System.out.print(s);
        }
    }
}
