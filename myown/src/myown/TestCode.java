package myown;

public class TestCode {

	public static void main(String[] args) {
		
		StopWatch time = new StopWatch();
		
		time.setStartTime(System.nanoTime());
		for(int i=0; i<90000;i++) {
			
		}
		time.setEndTime(System.nanoTime());
		System.out.println("mile Ÿ�� ���"+ time.elapsedMileTime());
		
		time.setStartTime(System.nanoTime());
		for(int i=0; i<90000;i++) {
			
		}
		time.setEndTime(System.nanoTime());
		System.out.println("nano Ÿ�� ���"+ time.elapsedNanoTime());
		
		
	}

}
