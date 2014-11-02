package erik.study.bigTry.lecture;

import erik.study.bigTry.Utility;
import erik.study.bigTry.Utility.TimeCheckable;
import erik.study.bigTry.algorithm.UnionFind;

/**
 * 
 * this class test different union find algorithms  
 * 
 * @author erik
 *
 */

public class Lecture2 extends BaseLecture implements TimeCheckable{
	private UnionFind uf = null;
	private static final int testN = 10;
	private static final int operationN = testN*testN/3;
	private static final int[] testData = {4,3,3,8,6,5,9,4,2,1,8,9,5,0,7,2,6,1,1,0,6,7};
//	private static final int[] testData = Utility.createTestData(testN, operationN);
	
	public void algorithmRun() {
		uf = new UnionFind(testN);
		Utility.debuglog("execute time: "+ Utility.getRunningTime(this));
		
	}

	public void codeExe() {
		for(int i=0,j=i+1;i<testData.length; i+=2,j+=2){
			int p = testData[i];
			int q = testData[j];
			if(!uf.isConnected(p, q)){
				uf.union(p, q);
				Utility.debuglog(p+"-"+q);
				uf.display();
			}
		}
		
	}
}
