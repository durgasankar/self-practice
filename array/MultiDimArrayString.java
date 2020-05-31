package array;

public class MultiDimArrayString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("single dimnsional array");
		
		int[] number = {1,3,5,7,9};
		System.out.println(number[2]);//o/p=5
		System.out.println();
		
		System.out.println("multi deimensional array");
		int[][] grid = {
				{00 , 01 , 02 , 03},
				{10 , 11 , 12},
				{20 , 21 , 22 , 23 , 24}
						};
		System.out.println("reference of the grid array is : "+grid);
		System.out.println("printing the refence of 11 : "+grid[1][1]);
		System.out.println();
		for(int row= 0 ; row<grid.length;row++)
		{
			for(int col=0;col<grid[row].length;col++)
			{
				System.out.print(grid[row][col]+"\t");
			}
			System.out.println();
		}
		System.out.println("string multi dimensional array");
		System.out.println();
		
		String[][] words = new String[2][3];
		words[1][2] = "Hi r20jc134 ";// string multi dimensional array created  stored at default location
		System.out.println(words[1][2]);
	
		}
		
		

	}


