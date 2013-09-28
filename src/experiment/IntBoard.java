package experiment;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Set;

public class IntBoard {
	private Map<Integer, LinkedList<Integer>> adjacencyMatrix;
	private boolean visited[];
	private int width;

	public IntBoard(int height, int width) {
		int boardSize = height * width; //a rectangular board
		adjacencyMatrix = new HashMap<Integer, LinkedList<Integer>>(boardSize);
		visited = new boolean [boardSize];
		this.width = width;
	}
	
	public void calcAdjacencies(){
		
	}
	
	public void startTargetz(int x, int y, int steps){
		
	}
	
	public int calcIndex(int x, int y) {
		return (width*y + x); //TODO complete later
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
