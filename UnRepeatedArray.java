package project;
// To find a UnRepeated Element in an Array
public class UnRepeatedArray {
	public static void main(String[] args) {
		int []a= {10,10,20,20,30,30,40};
		boolean []b=new boolean[a.length];
		for(int i=0;i<a.length;i++) {
			if(b[i]==false) {
				int count=0;
				for(int j=i+1;j<a.length;j++) {
					if(a[i]==a[j]) {
						count++;
						b[j]=true;
						
					}
				}if(count==0) {
					System.out.println(a[i]);
				}
			}
		}
				
	}

}


