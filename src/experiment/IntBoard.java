package experiment;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Map;
import java.util.Set;

public class IntBoard {
	private Map<Integer, LinkedList<Integer>> adjacencyMatrix;
	private boolean visited[];
	private int width;
	private Set<Integer> currentTargetz;

	public IntBoard(int height, int width) {
		int boardSize = height * width; //a rectangular board
		adjacencyMatrix = new HashMap<Integer, LinkedList<Integer>>(boardSize);
		visited = new boolean [boardSize];
		this.width = width;
	}
	
	public void calcAdjacencies(){
		
	}
	
	public void startTargetz(int x, int y, int steps){
		currentTargetz = new HashSet<Integer>(); //a blank sheet
		Arrays.fill(visited,false); //to ensure no issues
		int start = calcIndex(x,y);
		visited[start] = true;
		calcTargetz(start, steps);
	}
	
	private void calcTargetz(int index, int steps) {
		LinkedList<Integer> adjacent_squares = getAdjList(index);
		for(int adjacent : adjacent_squares){
			visited[adjacent] = true;
			if(steps == 1) {
				currentTargetz.add(adjacent);
			} else {
				calcTargetz(adjacent, steps - 1);
			}
		}
		visited[index] = false;
	}
	
	public int calcIndex(int x, int y) {
		return (width*y + x);
	}
	
	public Set<Integer> getTargetz(){
		
		return currentTargetz;
	}
	
	public LinkedList<Integer> getAdjList(int index) {//use calcIndex to get the index
		LinkedList<Integer> adjacent_squares = new LinkedList<Integer>();
		
		for(int square : adjacencyMatrix.get(index)){
			if(!visited[square]) {
				adjacent_squares.add(square);
			}
		}
		return adjacent_squares;
	}

}
