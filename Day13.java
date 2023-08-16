
public class Day13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[][] marks3 = new int[3][4];

		marks3[0][0] = 1;
		marks3[0][1] = 2;
		marks3[0][2] = 3;
		marks3[0][3] = 4;

		marks3[1][0] = 11;
		marks3[1][1] = 22;
		marks3[1][2] = 33;
		marks3[1][3] = 44;

		marks3[2][0] = 555;
		marks3[2][1] = 666;
		marks3[2][2] = 777;
		marks3[2][3] = 888;

		System.out.println(marks3[1][2]);

		
		
		for (int i = 0; i < marks3.length; i++) {
			// System.out.println(i);}
			int[] arr = marks3[i]; // {1,2,3,4}, //{11,22,33,44} , {555,666,777,888}
			for (int j = 0; j < arr.length; j++) {
				System.out.println(arr[j]);
			}

		}

		// program 2

		int[][] numbers2 = {

				{ 11, 22, 33 },
				{ 44, 55, 66 }, 
				{ 77, 88, 99 } 
			};

		for (int i = 0; i < numbers2.length; i++) {
			int[] arr = numbers2[i];
			for (int j = 0; j < arr.length; j++) {
				System.out.println(arr[j]);
			}
		}

		// while loop
		// program 3

		int r1 = 0;

		while (r1 < numbers2.length) {
			int arr[] = numbers2[r1];
			int c1 = 0;
			while (c1 < arr.length) {
				System.out.println(arr[c1]);
				c1 = c1 + 1;
			}
			r1++;
		}

	
		// program 4
		
		for(int [] row:numbers2) {
			for(int col : row) {
				System.out.println(col);
		
		
		
		
		
		
		
		
		
		
		
			}
		
			}	

	}

}
