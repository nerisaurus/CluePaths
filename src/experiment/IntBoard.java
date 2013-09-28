package experiment;

import java.util.LinkedList;
import java.util.Set;

public class IntBoard {
	private int verticalSize;
	private int horizontalSize;

	public IntBoard(int verticalSize, int horizontalSize) {
		super();
		this.verticalSize = verticalSize;
		this.horizontalSize = horizontalSize;
		// TODO Auto-generated constructor stub
	}
	
	public void calcAdjacencies(){
		
	}
	
	public void startTargetz(int x, int y, int steps){
		
	}
	
	public int calcIndex(int x, int y) {
		return (verticalSize*y + x); //TODO complete later
	}
	
	public Set<Integer> getTargetz(){
		
		return null;
		//TODO
	}
	
	public LinkedList<Integer> getAdjList(int index) {//use calcIndex to get the index
		
		return null;
		//TODO
	}

}
