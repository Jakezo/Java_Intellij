package Java_Pra;

public class TTEST {
	public static void main(String[] args) {
		int[] s =   {5,3,3,2,55,11};
		int min = 9999;
		int ss = 0;
		for(int i =0; i <s.length; i++){
			int a = s[i];
			if(min > a){
				min = a;
				ss = a;
				System.out.println(min);
			}
		}
		System.out.println("last"+ ss);
	}
}
