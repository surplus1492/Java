package test01;

import java.util.Iterator;

public class test01_09 {
	public static void main(String[] args) {
		int count=0;
		
		for (int i = 1; i <= 9; i++) {
			if (i<=5) 
				count++;
			else 
				count--;
			
			for (int j = 1; j <= 5-count; j++) 
				System.out.print(" ");
			for (int j = 1; j <= 2*count-1; j++) 
				System.out.print("*");
			System.out.println();
		}
	}
}
