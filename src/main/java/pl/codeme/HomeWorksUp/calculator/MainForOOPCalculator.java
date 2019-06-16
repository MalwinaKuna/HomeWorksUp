package pl.codeme.HomeWorksUp.calculator;


import java.util.Scanner;



public class MainForOOPCalculator {
	 public static void main( String[] args ){
	    	
	    	OOPCalculator calculator= new OOPCalculator();
	    	while (true) {
				System.out.println("Wprowadz liczbe");
				try {
					Scanner scanner = new Scanner(System.in);
					String inputtedScanner = scanner.nextLine();

					String splittedScanner[] = inputtedScanner.split(" ");
					

					double a = Double.parseDouble(splittedScanner[0]);
					double b = Double.parseDouble(splittedScanner[2]);
					char operation= splittedScanner[1].charAt(0);

				

					switch (operation) {
					case '+':
						System.out.println("Suma wynosi: " + String.format("%.2f", calculator.sum(a, b)));
						break;
					case '-':
						System.out.println("Różnica wynosi:" + String.format("%.2f", calculator.substract(a, b)));
						break;
					case '*':
						System.out.println("Iloczyn wynosi: " + String.format("%.2f", calculator.multiply(a, b)));
						break;
					case '/':
					case ':':
						System.out.println("Iloraz wynosi: " + String.format("%.4f", calculator.divide(a, b)));
						break;
					default:
						System.out.println("Źle wprowadzone dane");
					}

				} catch (Exception e) {
					System.out.println("Błędnie podane dane.");
					System.out.println(e.getMessage()); 
				} 
				System.out.println("Czy chcesz zakończyć działanie programu? t/n");

				Scanner exit = new Scanner(System.in);
				String exitNow = exit.nextLine();

				if (exitNow.equals("t")) {

					break;
				} else if (exitNow.equals("n")) {

					continue;
				} else {
					System.out.println("Błędne dane, aplikacja została domyślnie wstrzymana");
					break;
				}

			}
		}


}
