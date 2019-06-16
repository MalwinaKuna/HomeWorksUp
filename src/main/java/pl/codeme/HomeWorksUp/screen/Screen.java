package pl.codeme.HomeWorksUp.screen;

public class Screen {
	int height;
	int widht;
	char chr; 
	int drawHeight;
	int drawWidth;
 
	public Screen(int height, int width, char chr, int drawHeight, int drawWidth) {
		
		char[][]screen=initialize(height, width);
		draw(screen,chr,drawHeight,drawWidth);
		print(screen); 
 
	}
	
	public static char[][] initialize(int height, int width){
		char[][]scr=new char[height][width];
		
		for(int y= 0; y<height;y++) {
			for(int x=0; x<width; x++) {
				scr[y][x]='.';
			}   
		} 
		return scr; 
	}
	
	public static void print(char[][]scr) {
		for(int y=0; y<scr.length;y++) {
			for(int x=0; x< scr[y].length;x++) {
				System.out.print(scr[y][x]);
			}
		System.out.println();} 
		
	}
	public static void draw(char[][]scr,char chr,int height, int width) {
		scr[height][width]=chr;
	}

}
