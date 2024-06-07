package project;
//To find largest Element in an Array
public class LargestElement {
	public static void main(String[] args) {
		int []a= {1,2,3,4,5,6,7,8,9,10};
		int large=a[0];
		for(int i=0;i<=a.length-1;i++) {
			if(a[i]>large) {
				large=a[i];
			}
		}System.out.println(large);
	}

}
