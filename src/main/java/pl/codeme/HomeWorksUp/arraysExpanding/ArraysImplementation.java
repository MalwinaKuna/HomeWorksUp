package pl.codeme.HomeWorksUp.arraysExpanding;

public class ArraysImplementation {

	public static void main(String[] args) {

		int value = 10;
		OOPArray table = new OOPArray();
		System.out.print("[ ");
		for (int i = 0; i < table.add(value).length; i++) {
			System.out.print((table.add(value)[i] = i + 1) + " ");
		}
		System.out.print("]");
		System.out.println();
		int valueInidx = table.getIdx(0);
		System.out.println("Wartosc pod wybranym indeksem wynosi: " + valueInidx);
	}
}
