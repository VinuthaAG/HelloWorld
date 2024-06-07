package project;
// to check whether number is spy Number or not
public class SpyNumber {
	public static void main(String[] args) {
		int num=6;
		int sum=0;
		int product=1;
		int dig=0;
		while(num>0) {
			dig=num%10;
			sum=sum+dig;
			product=product*dig;
			num=num/10;
		}if(sum==product) {
			System.out.println("spy Number");
		}else {
			System.out.println("not a spy Number");
		}
	}
	

}
