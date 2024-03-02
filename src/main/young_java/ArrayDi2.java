package young_java;

public class ArrayDi2 {

    public static void main(String[] args) {
        int[][] arr = {
                {1, 2, 3},
                {4, 5, 8}
        };

        for (int[] into : arr) {
            for (int anInt : into) {
                System.out.print(anInt + " ");
            }
            System.out.println();
        }
    }
}
