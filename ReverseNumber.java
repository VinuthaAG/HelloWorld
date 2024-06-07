package project;
// To reverse a Number
public class ReverseNumber {
	public static void main(String[] args) {
		int num=132;
		int rev=0;
		while(num>0) {
			int dig=num%10;
			rev=rev*10+dig;
			num=num/10;
		}System.out.println(rev);
	}

}
