package project.PatternsProgramaJava;

public class fullpyramid {
	public static void main(String[] args) {
		int n=3;
		for (int row = 0; row < n; row++) {
           for (int spa= 0; spa < n-row ; spa++) {
        	   System.out.print(" ");
           }for(int star=0 ; star < ( 2 * row +1 ); star++) {
        	   System.out.print("*");
        	   
           }System.out.println();
		}
		for (int row = n; row >=0; row--) {
	           for (int spa= 0; spa < n-row ; spa++) {
	        	   System.out.print(" ");
	           }for(int star=0 ; star < ( 2 * row +1 ); star++) {
	        	   System.out.print("*");
	        	   
	           }System.out.println();
			}
		
		}
		
	}


