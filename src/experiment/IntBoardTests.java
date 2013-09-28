package experiment;

import static org.junit.Assert.*;

import java.util.LinkedList;
import java.util.Set;

import junit.framework.Assert;

import org.junit.Before;
import org.junit.Test;

public class IntBoardTests {
	private IntBoard board;
	
	@Before
	public void setupBoard(){
		board = new IntBoard(4,4);
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
		LinkedList testList = board.getAdjList(15);
		Assert.assertTrue(testList.contains(14));
		Assert.assertTrue(testList.contains(11));
		Assert.assertEquals(2, testList.size());
	}
	
	@Test
	public void test_Adjacencies_right_edge(){
		LinkedList testList = board.getAdjList(7);
		Assert.assertTrue(testList.contains(3));
		Assert.assertTrue(testList.contains(6));
		Assert.assertTrue(testList.contains(11));
		Assert.assertEquals(3, testList.size());
	}
	
	@Test
	public void test_Adjacencies_left_edge(){
		LinkedList testList = board.getAdjList(8);
		Assert.assertTrue(testList.contains(4));
		Assert.assertTrue(testList.contains(9));
		Assert.assertTrue(testList.contains(12));
		Assert.assertEquals(3, testList.size());
	}
	
	@Test
	public void test_Adjacencies_middle1(){
		LinkedList testList = board.getAdjList(9);
		Assert.assertTrue(testList.contains(5));
		Assert.assertTrue(testList.contains(8));
		Assert.assertTrue(testList.contains(10));
		Assert.assertTrue(testList.contains(13));
		Assert.assertEquals(4, testList.size());
	}
	
	@Test
	public void test_Adjacencies_middle2(){
		LinkedList testList = board.getAdjList(5);
		Assert.assertTrue(testList.contains(1));
		Assert.assertTrue(testList.contains(4));
		Assert.assertTrue(testList.contains(6));
		Assert.assertTrue(testList.contains(9));
		Assert.assertEquals(4, testList.size());
	}
	
	// Targetz Testz
	@Test
	public void test_Targetz_0_1(){ // Targetz_x_y means testing startTargetz(x.x, x.y, y);
		board.startTargetz(0, 0, 1);
		Set targets= board.getTargetz();	
		Assert.assertTrue(targets.contains(1));
		Assert.assertTrue(targets.contains(4));
		Assert.assertEquals(2, targets.size());
	}
	
	@Test
	public void test_Targetz_9_5(){ // Targetz_x_y means testing startTargetz(x.x, x.y, y);
		board.startTargetz(1, 2, 5);
		Set targets= board.getTargetz();
		Assert.assertTrue(targets.contains(0));
		Assert.assertTrue(targets.contains(2));
		Assert.assertTrue(targets.contains(5));
		Assert.assertTrue(targets.contains(7));
		Assert.assertTrue(targets.contains(8));
		Assert.assertTrue(targets.contains(10));
		Assert.assertTrue(targets.contains(13));
		Assert.assertTrue(targets.contains(15));
		Assert.assertEquals(8, targets.size());
	}
	
	@Test
	public void test_Targetz_15_2(){ // Targetz_x_y means testing startTargetz(x.x, x.y, y);
		board.startTargetz(3, 3, 2);
		Set targets= board.getTargetz();	
		Assert.assertTrue(targets.contains(7));
		Assert.assertTrue(targets.contains(10));
		Assert.assertTrue(targets.contains(13));
		Assert.assertEquals(3, targets.size());
	}
	
	@Test
	public void test_Targetz_11_2(){ // Targetz_x_y means testing startTargetz(x.x, x.y, y);
		board.startTargetz(3, 2, 2);
		Set targets= board.getTargetz();
		Assert.assertTrue(targets.contains(3));
		Assert.assertTrue(targets.contains(6));
		Assert.assertTrue(targets.contains(9));
		Assert.assertTrue(targets.contains(14));
		Assert.assertEquals(4, targets.size());
	}
	
	@Test
	public void test_Targetz_10_1(){ // Targetz_x_y means testing startTargetz(x.x, x.y, y);
		board.startTargetz(2, 2, 1);
		Set targets= board.getTargetz();	
		Assert.assertTrue(targets.contains(6));
		Assert.assertTrue(targets.contains(9));
		Assert.assertTrue(targets.contains(11));
		Assert.assertTrue(targets.contains(14));
		Assert.assertEquals(4, targets.size());
	}
	
	@Test
	public void test_Targetz_13_3(){ // Targetz_x_y means testing startTargetz(x.x, x.y, y);
		board.startTargetz(1, 3, 3);
		Set targets= board.getTargetz();
		Assert.assertTrue(targets.contains(1));
		Assert.assertTrue(targets.contains(4));
		Assert.assertTrue(targets.contains(6));
		Assert.assertTrue(targets.contains(9));
		Assert.assertTrue(targets.contains(11));
		Assert.assertTrue(targets.contains(12));
		Assert.assertTrue(targets.contains(14));
		Assert.assertEquals(7, targets.size());
	}

}
