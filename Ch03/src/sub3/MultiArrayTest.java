package sub3;

/*
 *2021/05/18
 *김영현
 *다배열 실습 
 */

public class MultiArrayTest {
	public static void main(String[] args) {
		//1차
		int[] scores= {80,60,78,62,92};
		int sum=0;
		
		for (int score:scores)
			sum+=score;
		System.out.println("총합은 : "+sum);
		//2차
		int[][] arr2d= {{1, 2, 3, 4},
						{5, 6, 7, 8},
						{9,10,11,12}};
		
		for (int i=0;i<3;i++)
			for(int j=0;j<4;j++)
				System.out.printf("배열 arr2d[%d][%d] : %d \n",i,j,arr2d[i][j]);
		//3차
		int[][][] arr3d= {{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}},
						  {{10,11,12},{13,14,15},{16,17,18}},
						  {{19,20,21},{22,23,24},{25,26,27}}};
		
		System.out.println(arr3d[0][1][1]);
		System.out.println(arr3d[1][1][0]);
		System.out.println(arr3d[2][0][2]);
		
	}
}
