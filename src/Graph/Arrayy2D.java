package Graph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Arrayy2D {
	int a[][];
	
	Arrayy2D(int rows, int cols){
		a=new int[rows][cols];	
	}
	public void insert(int rows,int column) throws Exception {
//		Scanner sc=new Scanner(System.in);
//		System.out.println("enter the numbers of rows:-");
//		
//		for (int i=0;i<rows;i++) {
//			for(int j=0;j<column;j++) {
//		a[i][j] =sc.nextInt();	
//			}
//			System.out.println();
//		}
		InputStreamReader is= new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(is);
		System.out.println("enter the numbers of rows:-");
		
		for (int i=0;i<rows;i++) {
			for(int j=0;j<column;j++) {
		a[i][j] =Integer.parseInt(br.readLine());
			}
			System.out.println();
		}
//		a[0][0]=1;
//		a[0][1]=2;
//		
//		a[1][0]=4;
//		a[1][1]=5;

		display();
		
	}

	public void display() {
		for(int i=0;i<a.length;i++) { // rows length
			for(int j=0;j<a[0].length;j++) {//a[0] column ko length
				System.out.print(a[i][j] +" ");
			}
			System.out.println("");
		}
	}
	
	public static void main(String [] args) throws Exception {
		Arrayy2D aa= new Arrayy2D(3,2);
		aa.insert(3,2);
//		aa.display();
		
		
	}
}