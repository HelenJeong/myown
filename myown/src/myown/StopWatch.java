package myown;

public class StopWatch {

	private long startTime;
	private long endTime;
	
	public void setStartTime(long startTime) {
	  this.startTime = startTime;	
	}
	
	public void setEndTime(long endTime) {
		  this.endTime = startTime;	
		}
	
	public long elapsedNanoTime() {	
		if(endTime < startTime) {
			System.out.println("���۽ð��� �� Ů�ϴ�.");
			return 0 ;
		}
		return endTime - startTime;
	}
	
	public long  elapsedMileTime() {
		long result = endTime - startTime;
		return result / 1000;
	}

	public long  elapsedSecondTime() {
		long result = endTime - startTime;
		return result * 60;
	}
	
	
	
	
	
	
	
}
