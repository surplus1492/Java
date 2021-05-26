package test02;

public class test02_01 {
	public static void main(String[] args) {
		char str[]= {'I',' ','L','O','V','E',' ','Y','O','U'};
		Integer row,col;
		
		for (row=1;row <10;row++){
			for (col=0;col<=row;col++)
				System.out.print(str[col]);
			System.out.println();
		}
	}
}
