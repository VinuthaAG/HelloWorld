package project;
//To find Words are anagran or not
import java.util.Arrays;

public class AnagronNumber {
  public static void main(String[] args) {
	String s1="silent";
	String s2= "listen";
	char []ch1=s1.toLowerCase().toCharArray();
	char []ch2=s2.toLowerCase().toCharArray();
	
	
	Arrays.sort(ch1);
	Arrays.sort(ch2);
	boolean res=Arrays.equals( ch1 , ch2);
	if(res==true) {
		System.out.println("It is a Anagran");
	}else {
		System.out.println("not a anagran");
	}
	
	

	}
}
