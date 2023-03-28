package pOne;

import java.util.Scanner;

public class HeapDS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Heap obj = new Heap();
		
		int n=2;
		while(n==2) {
		System.out.println("===============================");
		System.out.println("Heap Data Structure ");
		System.out.println("1. Insert");
		System.out.println("2. Display");
		System.out.println("3.Delete Minimum");
		System.out.println("4.Extract Minimum");
		System.out.println("5. Exit");
		
		System.out.println("Enter your choice :");
		Scanner scan = new Scanner(System.in);
		int choice = scan.nextInt();
		
		switch(choice) {
		case 1:
			System.out.println("Enter the Value ");
			int value = scan.nextInt();
			obj.Insert(value);
			break;
		case 2:
			obj.Display();
			break;
		case 3:
			obj.DeleteMin();
			break;
		case 4:
			obj.ExtractMin();
			break;
		case 5:
			System.out.println("========END=========");
			n=3;
			break;
		default:
			System.out.println("Enter The right choice");
			break;
		}
			
		}

	}

	private static void exit(int i) {
		// TODO Auto-generated method stub
		
	}

}
