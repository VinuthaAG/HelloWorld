package project;

public class ReverseSentence {
	public static void main(String[] args) {
		String s= " Today is a Sunny day";
		String w[]=s.split(" ");
		String result=" ";
		for(int i=w.length-1; i > 0; i--) {
			if(i==0) {
			result=result + w[i];
			
		}else {
			result=result+w[i]+ " ";
		}
		
	}

		System.out.println(result);
	}}


