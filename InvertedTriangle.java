package project.PatternsProgramaJava;

public class InvertedTriangle {
	
	public static void main(String[] args) {
		int row=5;
		int i=0;
		while(i<row) {
			int j=5;
			while(j>i) {
				System.out.print(" *");
				j--;
			}System.out.println();
			i++;
		}
	}

}
