package erik.study.bigTry.algorithm;

/**
 * 
 * this class show the 
 * 
 * @author erik
 *
 */

public class UnionFind {
	private int[] id;
	public UnionFind(int n) {
		id = new int[n];
		for(int i=0;i<id.length;i++){
			id[i] = i;
		}
	}
	
	public boolean isConnected(int p, int q){
		if(id[p] == id[q]){
			return true;
		}else{
			return false;
		}		
	}
	
	public void union(int p, int q){
		//value of p,q may be change in the process
		int pid = id[p];
		int qid = id[q];
		for(int i=0;i<id.length;i++){
			if(id[i] == pid){
				id[i] = qid;
			}
		}
	}
	
	public void display(){
		System.out.print("id array: ");
		for(int i=0;i<id.length;i++){
			System.out.print(id[i]+" ");
		}
		System.out.println("");
	}
}
