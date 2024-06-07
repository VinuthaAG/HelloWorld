package project;

public class BubbleSort {
	public static void main(String[] args) {
		int a[]= { 10,2,3,4,5,1,9,5};
		int n=a.length;
		for(int i=0 ;i<=a.length-1;i++) {
			System.out.println(a[i]);
		}
		for(int i=0; i<a.length-1; i++) {
			for(int j=0 ; j<n-1-i; j++) {
				if(a[j]>a[j+1]) {
					int temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
		}for(int i=0 ;i<=a.length-1;i++) {
			System.out.println(a[i]);
		}
		
	}

}
