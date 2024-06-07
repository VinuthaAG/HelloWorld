package project;
// To check Number is Strong Number or not
public class StrongNumber {
	public static void main(String[] args) {
		int num=145;
		int num1=num;
		int sum=0;
		int dig=0;
		while(num>0) {
			dig=num%10;
			int fact=1;
			for(int i=1;i<=dig;i++) {
				fact=fact*i;
				
			}sum=sum+fact;
			num=num/10;
		}if(sum==num1) {
			System.out.println("Strong Number");
		}else {
			System.out.println("not a Strong Number");
		}
	}

}
