package pl.codeme.HomeWorksUp;

public class Tablice {
	public static void main(String[] args) {
		int[] tab = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		int[] tabx = { 1, 2, 3, 4, };
		subTab(tab, 3, 2);
		printMergedTab(merge(tab, tabx));
		printRevertedTab(revert(tab));
		int sum=sum(tabx);
		printSum(sum(tab)); 
		 
		
		int[][]multiTab={{1,2,3},{4,5,6},{7,8,9}};
		for(int i =0; i< multiTab.length;i++) {
			for(int j =0; j< multiTab[i].length;j++) {
				System.out.print(" " + multiTab[i][j]+" ");
			}
		System.out.println();}
		
		System.out.println();
		
	rotate(multiTab);
	printTabDouble(rotate(multiTab)); 
	
		 
		
		
		 
	
 
	}

	public static int[] subTab(int[] src, int startIndex, int amount) {
		System.out.print("src=[");
		for (int i = startIndex; i <= startIndex + amount - 1; i++) {
			if (i < startIndex + amount - 1) {
				System.out.print(src[i] + ",");
			} else {
				System.out.print(src[i]);
			}
		}
		System.out.println("]");

		return src;
	}

	public static int[] merge(int[] tab1, int[] tab2) {
 
		int[] tab3 = new int[tab1.length+tab2.length];
		int n = 0;
		for (int i = 0; i < tab1.length; i++) { 		
				tab3[n]= tab1[i];
				n++;				
			} 
		for(int i =0; i<tab2.length;i++) {
			tab3[n] = tab2[i];
			n++;			
		} 
			 		
		return tab3; 
	}  
	
	public static void printMergedTab(int[]tab) {
		System.out.print("Zsumowana tablica= [ ");
		for(int i=0; i< tab.length;i++) {
			System.out.print(tab[i]+" ");}
		System.out.print("]");
		System.out.println();
	}
	

	
	public static int[] revert (int[]tab) {
		int n=0;
		int[]revertedTab= new int[tab.length];
		for(int i=tab.length-1;i>-1;i--) { 
			revertedTab[n]=tab[i]; 
			n++;
		}
		return revertedTab;
	}
	public static void printRevertedTab(int[]tab) {
		System.out.print("odwr�cona tablica= [ ");
		for(int i=0; i< tab.length;i++) {
			System.out.print(tab[i]+" ");}
		System.out.print("]");
		System.out.println();
	}
	
	public static int sum(int[]tab) {
		int sum=0;
		for(int i =0 ; i<tab.length; i++) {
			sum+=tab[i]; 
		} 

		return sum;
	}
	
	public static void printSum(int sum) {
		System.out.println("Suma liczb w tablicy wyniesie "+sum);
	}
	
	
	public static int[][]rotate(int[][]tab){
		int rotate[][]=new int[tab.length][tab.length];
		
		for(int x=0; x<tab.length;x++) {
			int i=tab.length-1;
			for(int y = 0; y<tab[x].length;y++) {
				rotate[y][x]=tab[x][i];	 
				i--;
			}
		}
		return rotate;
	}
	public static void printTabDouble(int tab[][]) {
		for(int i=0; i<tab.length;i++) {
			for(int j=0; j<tab[i].length;j++) {
			System.out.print(" "+tab[i][j]+" ");
		}
			System.out.println();
	}
	}
}
