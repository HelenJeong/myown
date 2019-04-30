package myown;

public class Quiz_5Multi5Array {

	public static void main(String[] args) {
		
		int arr[][] = new int[5][5];
		int cnt=1;
		for(int i=0; i<arr.length;i++) {
			for(int j=0; j<arr[i].length;j++) {
				arr[i][j]=cnt++;
			}
		}
		System.out.println("저장 값 출력");
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length ; j++) {
				System.out.print(arr[i][j]+"\t");
			}
			System.out.println();
		}
	}

}
