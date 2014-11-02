package erik.study.bigTry;

public class Utility {
	
	public static void debuglog(String log) {
		System.out.print("erik ");
		System.out.println(log);
	}
	
	public static long getRunningTime(TimeCheckable timeChecker){
		long startTime = System.currentTimeMillis();
		timeChecker.codeExe();
		long endTime = System.currentTimeMillis();
		return (endTime - startTime);
	}
	
	public interface TimeCheckable{
		public abstract void codeExe();
	}

	public static int[] createTestData(int testN, int operationN) {
		int[] testData = new int[operationN*2];
		//need more development
		
		return testData;
	}

}
