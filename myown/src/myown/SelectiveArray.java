package myown;

public class SelectiveArray {

	public static void main(String[] args) {
		int tmp=0;
		int i=0;
		int j=0;
		int[] arr = new int[] {4,8,2,7,6};
		
		
		
		for( i=0; i< arr.length; i++) {
			for( j=i+1; j< arr.length ; j++) {
				if(arr[i] > arr[j]) {  //8 2
					
					tmp = arr[i];  // tmp <-8
					arr[i] = arr[j]; //j <=1
					arr[j] =tmp;  //i <=5
				
				} //���⿡ ������ ���� �̹� ���ù迭�� ��������? 2 4 6 7 8
			}
		}
		
		for(i=0 ; i < arr.length ; i++) {
			System.out.print(arr[i] + " ");
	
		}

		
		
		
	}
	

}
