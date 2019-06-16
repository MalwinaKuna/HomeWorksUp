package pl.codeme.HomeWorksUp.arraysExpanding;



public class Main {
	
	public static void main(String[] args) {
		
		Arrays array= new Arrays(5); //tyle elementów
		
		array.printTab();
		array.add(875);
		array.add(666);
		array.add(000);
		array.add(999);
		array.add(777);
		array.printTab();
		int valueInIdx=array.get(0);
		System.out.println(valueInIdx);

		
		
		
		
		
	}

}
