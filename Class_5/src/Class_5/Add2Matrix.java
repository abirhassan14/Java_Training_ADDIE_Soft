package Class_5;

public class Add2Matrix {

	public static void main(String[] args) {
		// Add 2 matrix using multi dimentional array
		
		int [][] m = {
				{25,58,36},
				{23,42,47},
				{25,45,25}
		};
		
		int [][] n = {
				{5,8,9},
				{1,2,4},
				{7,12,3}
		};
		
		int [][] result = new int [3][3];
		
		for(int i=0; i<m.length; i++) {
			for(int j=0; j<m[i].length; j++) {
				result [i][j] = m[i][j]-n[i][j]; 
				System.out.print(result[i][j] +"  ");
			}
			System.out.println();
		}	
	}
}
