package myown;

import java.util.Scanner;

public class Quiz_sum {

	public int square(int a, int b) {
		int sum=1;
		for(int i=1; i<=b;i++) {
			sum*=b;
		}
		return sum;
	}
	public int inputNo() {
		Scanner input = new Scanner(System.in);
		int su1=0, su2=0;
		System.out.println("Input two no");
		su1 = input.nextInt(); 
		su2 = input.nextInt();
		int result = square(su1,su2); //2�� �Է¹��� ���� square�޼���� ���� ����� �ȴ��� �ٽ� ���ƿ� result�� ������ �ȴ�.
		return result;
	}
	public void display() {	
		int su = inputNo(); 
		int result_print = inputNo();
		System.out.println(result_print);
		
	}
}