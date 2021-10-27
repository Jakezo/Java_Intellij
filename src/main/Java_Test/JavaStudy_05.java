package Java_Test;

public class JavaStudy_05 {
    public static void main(String[] args) {

        int arr[] = new int[5];

        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]=(int)(Math.random() *5));
        }
        System.out.println();
        for(int i=0; i<arr.length-1; i++){
            boolean ch = false;
            for(int j=0; j< arr.length-1-i; j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    ch =true;
                }
            }
            if(!ch) break;

            for(int k=0; k<arr.length; k++){
                System.out.print(arr[k]);
            }
            System.out.println();
        }
    }
}
