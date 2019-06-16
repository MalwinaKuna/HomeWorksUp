package pl.codeme.HomeWorksUp;

public class Silnia {

	public static void main(String[] args) {
		int number=5;
		int silnia=1;
		for(int i=1;i<=5;i++) {
			silnia*=i;
		}
		System.out.println("Silnia z " + number+" wynosi "+ silnia);
			 
		
		silnia(5);
	}
	 
	//lub poprzez wywołanie metody
	 
	public static void silnia(int number) {
		int silnia=1;
		for(int i=1;i<=number;i++) {
			silnia*=i;
		}
		System.out.println("Silnia z " + number+" wynosi "+ silnia);
		
	}

}
