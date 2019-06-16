package pl.codeme.HomeWorksUp;

public class ChristmassTree {

	public static void main(String[] args) {
		String star = "*";
		String blank = " ";
		for (int i = 0; i <= 8; i++) {
			for (int j = 0; j <= 30; j++) {
				if (j <= 10 + i && j >= 10 - i) {
					System.out.print(star);
				} else {
					System.out.print(blank);
				}
			}
			System.out.println();
		}

		// ---------------------------->
		for (int i = 5; i <= 10; i++) {
			for (int j = 0; j <= 30; j++) {
				if (j <= 10 + i && j >= 10 - i) {
					System.out.print(star);
				} else {
					System.out.print(blank);
				}
			}
			System.out.println();
		}

		// -------------------------------->

		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 30; j++) {
				if (j > 7 && j < 13) {
					System.out.print(star);
				} else {
					System.out.print(blank);
				}
			}
			System.out.println();
		}

		// ------------------------------------------------------------------------------------->
		// ------------------------------------------------------------------------------------->
		System.out.println();
		for (int i = 0; i <= 8; i++) {
			for (int j = 0; j <= 30; j++) {
				if (j <= 10 + i && j >= 10 - i) {
					if(j>10 -i && j<10+i) {System.out.print("I");}else {
					System.out.print(star);}
				} else {
					System.out.print(blank);
				}
			}
			System.out.println();
		}

//---------------------------->
		for (int i = 5; i <= 10; i++) {
			for (int j = 0; j <= 30; j++) {
				if (j <= 10 + i && j >= 10 - i) {
					if(j>10-i && j <10+i) {System.out.print("I");}else {
					System.out.print(star);}
				} else {
					System.out.print(blank);
				}
			}
			System.out.println();
		}
		
		//podtsawa
		
		for(int i=0;i <21; i++) {
			System.out.print(star);
		}
		System.out.println();

//-------------------------------->

		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 30; j++) {
				if (j > 7 && j < 13) {
					System.out.print(star);
				} else {
					System.out.print(blank);
				}
			}
			System.out.println();
		}

	}
}
