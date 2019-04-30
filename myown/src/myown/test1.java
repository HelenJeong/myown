package myown;

public class test1 {

	public boolean sleepIn(boolean weekday, boolean vacation) {
		if (!weekday || vacation) {
		return true;
		} else {
		return false;
		}
		}
	
	
	public static void main(String[] args) {
		
		test1 ts = new test1();
		boolean weekday = true,vacation = true;
		ts.sleepIn(weekday, vacation);
		System.out.println(ts.sleepIn(weekday, vacation));

	}

}
