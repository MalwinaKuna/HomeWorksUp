package pl.codeme.HomeWorksUp.arraysExpanding;

public class Arrays {
	
	private int[] array;
	
	public Arrays(int n) {
		this.array = new int[n]; 
	}
	
	int idx=0; 

	public void extendArr() {
		int[]tmp=new int[array.length+3];
		
		for(int i =0; i < array.length;i++) {
			tmp[i]=array[i];
		}
		array=tmp;
	}
	
	public void add(int value) {
		array[idx]=value;
		idx++;
		if(idx>=array.length) {
			extendArr();
		}
	}
	
	
	public void get(int idx) {
		System.out.println(array[idx]);
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