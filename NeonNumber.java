package project;
// To check Neon Number or Not
public class NeonNumber {
	public static void main(String[] args) {
		int num=9;
		int dig=0;
		int sum=0;
		int sq=num*num;
		while(sq>0) {
			dig=sq%10;
			sum=sum+dig;
			sq=sq/10;
		}if(sum==num) {
			System.out.println("Neon Number");
		}else {
			System.out.println("not a Neon Number");
		}
	}

}
