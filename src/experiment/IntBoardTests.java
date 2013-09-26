package experiment;

import static org.junit.Assert.*;

import java.util.LinkedList;

import junit.framework.Assert;

import org.junit.Before;
import org.junit.Test;

public class IntBoardTests {
	private IntBoard board;
	
	@Before
	public void setupBoard(){
		//TODO
		board = new IntBoard();
	}

	@Test
	public void test_calcIndex() {
		Assert.assertEquals(0, board.calcIndex(0,0));
		Assert.assertEquals(1, board.calcIndex(1,0));
		Assert.assertEquals(9, board.calcIndex(1,2));
		Assert.assertEquals(15, board.calcIndex(3,3));
	}	
	
	//Adjacency List Tests
	@Test
	public void test_Adjacencies_top_left(){
		LinkedList testList = board.getAdjList(0);
		Assert.assertTrue(testList.contains(4));
		Assert.assertTrue(testList.contains(1));
		Assert.assertEquals(2, testList.size());
	}
	
	@Test
	public void test_Adjacencies_bottom_right(){
		fail("Not yet implemented");
	}
	
	@Test
	public void test_Adjacencies_right_edge(){
		fail("Not yet implemented");
	}
	
	@Test
	public void test_Adjacencies_left_edge(){
		fail("Not yet implemented");
	}
	
	@Test
	public void test_Adjacencies_middle1(){
		fail("Not yet implemented");
	}
	
	@Test
	public void test_Adjacencies_middle2(){
		fail("Not yet implemented");
	}
	
	// Targetz Testz
	@Test
	public void test_Targetz_0_1(){ // Targetz_x_y means testing startTargetz(x.x, x.y, y);
		fail("Not yet implemented");
	}
	
	@Test
	public void test_Targetz_9_5(){ // Targetz_x_y means testing startTargetz(x.x, x.y, y);
		fail("Not yet implemented");
	}
	
	@Test
	public void test_Targetz_15_2(){ // Targetz_x_y means testing startTargetz(x.x, x.y, y);
		fail("Not yet implemented");
	}
	
	@Test
	public void test_Targetz_11_2(){ // Targetz_x_y means testing startTargetz(x.x, x.y, y);
		fail("Not yet implemented");
	}
	
	@Test
	public void test_Targetz_10_1(){ // Targetz_x_y means testing startTargetz(x.x, x.y, y);
		fail("Not yet implemented");
	}
	
	@Test
	public void test_Targetz_13_3(){ // Targetz_x_y means testing startTargetz(x.x, x.y, y);
		fail("Not yet implemented");
	}

}
