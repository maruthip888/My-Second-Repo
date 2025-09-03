package firstproject;

public class Array2 {
	public static void main(String[] args) {
		int a[][]= {{100,200,3000,4000,5000,6000},{100,200,3000,4000,5000,6000}};
		 System.out.println("Matrix Representation:");
		for(int i=0;i<a.length;i++)
		{
			for(int j=0; j<a[i].length;j++) {
				System.out.printf(a[i][j]+"\t");
			}
			System.out.println();
		}
	}
}

