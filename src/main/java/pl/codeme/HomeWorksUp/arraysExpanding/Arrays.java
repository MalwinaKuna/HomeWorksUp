package pl.codeme.HomeWorksUp.arraysExpanding;

public class Arrays {
	
	private int[] array;
	int n;
	public Arrays(int n) {
		this.n=n;
		this.array = new int[n]; 
		 
	}
	
	int idx=0; 

	public int[] extendArr() { 
		int[]tmp=new int[array.length+(n-array.length)];
		
		for(int i =0; i < array.length;i++) {
			tmp[i]=array[i];
		} 
		array=tmp;
		return array;
	}
	
	public int[] add(int value) {
		array[idx]=value;
		idx++;
		if(idx>=array.length) { 
			extendArr();
		}
		
		return array;
	}
	
	
	public int get(int idx) {
		//System.out.println(array[idx]);
		return array[idx];
	}
	
	public void printTab() {
		System.out.print("[ ");
		
		for(int i =0; i<array.length;i++) {
			System.out.print(array[i]+" ");
		}
		System.out.println("]");
		System.out.println();
	}
}