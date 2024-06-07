package project;
// to check element in array is present or not
public class ToFindElement {
	public static void main(String[] args) {
		int []a= {20,30,40,50,60};
		int ele=25;
		boolean flag=false;
		for(int i=0;i<=a.length-1;i++) {
			if(a[i]==ele) {
				System.out.println("element found");
				flag=true;
			}
		}if(flag==false) {
			System.out.println(" element does not exit");
		}
	}

}
