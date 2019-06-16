package pl.codeme.HomeWorksUp.interfacesExercises;


import java.util.ArrayList;


public class AppendableImplementWithList implements Appendable {

	public Appendable append(Object item) {
		ArrayList<String>items=new ArrayList<String>(); 	
		return this;
	}

	public Appendable append(Object item, int index) {
		ArrayList<String>items=new ArrayList<String>();
		items.add(index,(String)item);
		return this;
	}

}
