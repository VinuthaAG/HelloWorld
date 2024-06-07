package project;
// To find third Smallest element in an Array
public class TofindSmallest {
	public static void main(String[] args) {
		int []a= {1,2,3,4,5,6,7,8,9};
		int n=3;
		for(int i=0;i<a.length;i++) {
			int count=0;
			for(int j=0;j<a.length;j++) {
				if(a[j]<a[i]) {
					count++;
				}
			}if(count==n-1) {
				System.out.println(a[i]);
			}
		}
	}

}
