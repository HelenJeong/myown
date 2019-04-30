package myown;

import java.util.Scanner;

public class exan_array {

	public static void main(String[] args) {
	
		int[] arr = new int[5];
		arr[0] =100;
		arr[1] =100;
		arr[2] =100;
		arr[3] =100;
		arr[4] =100;
		System.out.println("arr[0]:"+arr[0]);
		System.out.println("arr[1]:"+arr[1]);
		System.out.println("arr[2]:"+arr[2]);
		System.out.println("arr[3]:"+arr[3]);
		System.out.println("arr[4]:"+arr[4]);
		
		System.out.println("======================================");
		int[] arr1 = new int[5];
		for(int i=0; i<arr1.length ; i++) {
			arr[i] = 100 *(i+1);
			System.out.println("arr["+ i + "] " + arr1[i]);
		}
		System.out.println("======================================");
		int[] arr3= new int[] {10,20,30};
		for(int i=0; i<arr3.length ;i++) {
			System.out.println("arr[" + i +" ] " + arr3[i]);
		}
		
		Scanner input = new Scanner(System.in);
		String name[] = new String[3];
		


		for(int i=0; i<name.length;i++) {
			System.out.println(i+1+"번째 값:" + name[i]);
		}
		
		for(int i=0; i<name.length; i++) {
			System.out.println(i+1+"번째 이름입력:::");
			name[i] = input.next();
		}
		
		for(int i=0; i<name.length;i++) {
			System.out.println(i+1+"번째 값:" + name[i]);
		}
	}

}
