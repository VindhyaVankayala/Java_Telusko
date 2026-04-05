package main;

public class Array4 {
	
	public static void main(String[] args) {
		
		//Jagged array / Irregular array
		
		int[][][] arr = {{{1,2,3},{4,5,6}}};
		
		for(int[][] i :arr)
		{
			for(int[] j : i)
			{
				for(int k : j)
				{
					System.out.print(k + " ");
				}
				
				System.out.println();
			}
		}
		
		
	}

}
