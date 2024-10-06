package Class_5;

public class ArrayMultiDimension {

	public static void main(String[] args) {

		// Multi dimentional Array
		int [][] m = {{1,2,3,0}, {4,5,6,0}, {7,8,9,0}, {2,4,8,0}};
		
		for (int i=0; i<m.length; i++) {
			for(int j=0; j<m.length; j++) {
				System.out.print(m[i][j]+"   ");
			}
			System.out.println();
		}
	}
}
