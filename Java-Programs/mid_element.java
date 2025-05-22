//Get size of array,elements and find the middle element

import java.util.Scanner;

class Demo{
	public static void main(String[]args){
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter The lenght of the Array :");
		int arraylen = scan.nextInt();
		System.out.print("Enter The Elements :");
		int[] array = new int[arraylen];
		int mid = arraylen/2;

		for(int i=0;i<arraylen;i++){
			array[i] = scan.nextInt();
		}
		System.out.println("The Middle Element is :"+array[mid]);
		scan.close();
	}
}