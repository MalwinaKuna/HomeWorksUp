package pl.codeme.HomeWorksUp;

public class Prostokaty {
	public static void main(String[] args) {

		String star = "*";
		
		System.out.println();
		System.out.println();
		// ----------------------------------------------------------------->
		// prostok�t

		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 20; j++) { 
				if (j > 1) {
					System.out.print(star);
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
 
		System.out.println();
		System.out.println();

		// ----------------------------------------------------------------->
		// prostok�t pusty
		// gora
		for (int i = 0; i < 20; i++) {
			if (i >= 1) {
				System.out.print(star); 
			} else { 
				System.out.print(" ");
			}
		}
		System.out.println();

		// boki
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 20; j++) {
				if (j == 1 || j == 19) { 
					System.out.print(star);
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}

		// dol
		for (int i = 0; i < 20; i++) {
			if (i >= 1) {
				System.out.print(star);
			} else {
				System.out.print(" ");
			}
		}}

}
