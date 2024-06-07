package project;

public class LowerCase {
	public static void main(String[] args) {
		String s="VinuthA";
		int count=0;
		for(int i=0; i<s.length();i++) {
			if(s.charAt(i)>=97 && s.charAt(i)<=122){
				count++;
				
			}
		}System.out.println(count);
		

}}
