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
	private int height;
	private int boardSize;

	public IntBoard(int height, int width) {
		this.boardSize = height * width; //a rectangular board
		adjacencyMatrix = new HashMap<Integer, LinkedList<Integer>>(boardSize);
		visited = new boolean [boardSize];
		this.width = width;
		this.height = height;
		calcAdjacencies();
	}
	
	//no need to call other than in the constructor.
	private void calcAdjacencies(){
		for(int i=0; i<boardSize; i++){
			LinkedList<Integer> list = new LinkedList<Integer>();
			
			//top row
			if(i<width){
				list.add(i+1);
				list.add(i+width);
				list.add(i-1);
			}
			//left column
			else if(i % height == 0){
				list.add(i+1);
				list.add(i+width);
				list.add(i-width);
			}
			//right column
			else if((i+1) % height ==0) {
				list.add(i+1);
				list.add(i+width);
				list.add(i-width);
			}
			//bottom row
			else if(i > (boardSize-width)){
				list.add(i+1);
				list.add(i-width);
				list.add(i-1);
			}
			//middle
			else {
				list.add(i+1);
				list.add(i+width);
				list.add(i-1);
				list.add(i-width);
			}
			adjacencyMatrix.put(i, list);
		}
		
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
