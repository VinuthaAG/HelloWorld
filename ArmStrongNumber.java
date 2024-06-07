package project;
// To Check whether number is ArmStrong Number or Not
public class ArmStrongNumber {
	public static void main(String[] args) {
	int num=153;
	int num1=num;
	int num2=num;
	int count=0;
	int sum=0;
	while(num>0) {
		count++;
		num=num/10;
	}while(num1>0) {
		int dig=num1%10;
		int fact=1;
		for(int i=1;i<=count;i++) {
			fact=fact*dig;
		}sum=sum+fact;
		num1=num1/10;
	}if(sum==num2) {
		System.out.println("ArmStrong Number");
	}else {
		System.out.println("not a ArmStrong Number");
	}
	
	}

}
