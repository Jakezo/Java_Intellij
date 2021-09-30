package JavaStudy;

import java.util.Arrays;

public class java_test1 {

    public static void main(String[] args) {

        int arr[] = {4,23,33,15,17,19};
        int mm[] ;
        mm = arr;

        Arrays.sort(arr);

        for (int i : arr) {
            System.out.print("["+i+"]");
        }
        System.out.println();
        for (int z : mm) {
            System.out.print("["+z+"]");
        }
    }

}