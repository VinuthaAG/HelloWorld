package project;
// To find second large Element in an Array
public class SecondlargeElemnt {
	public static void main(String[] args) {
		int []a= {1,2,3,4,5,6};
		int large=a[0];
		int small=0;
		for(int i=0;i<=a.length-1;i++) {
			if(a[i]>large) {
				small=large;
				large=a[i];
			}else if(a[i]>small && a[i]< large) {
				small=a[i];
			}
		}System.out.println(small);
		
	}

}
