package myown;

import java.util.Scanner;


public	class Absolute{
		public int absoluteCheck(int n1) {
			//1 <0 false
			//-3 <0 true
			if(n1 < 0) return n1*-1; 
			else return n1;
		}
		public void outPut(int n1,int re) {
			System.out.println(n1+"�� ���� ���� : "+re+" �Դϴ�.");
		}
	



	public static void main(String [] args){
		Scanner input = new Scanner(System.in);
		Absolute absolute = new Absolute();
		int num1;
		System.out.print("�� �Է� : ");
		num1 = input.nextInt();
		int result = absolute.absoluteCheck(num1);
		absolute.outPut(num1,result);
	}

	}




