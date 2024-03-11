// Test cases for CharGrid -- a few basic tests are provided.

import org.junit.Test;
import static junit.framework.TestCase.assertEquals;

public class CharGridTest {
	@Test
	public void testCharArea1() {
		char[][] grid = new char[][] {
				{'a', 'y', ' '},
				{'x', 'a', 'z'},
			};

		CharGrid cg = new CharGrid(grid);
				
		assertEquals(4, cg.charArea('a'));
		assertEquals(1, cg.charArea('z'));
	}
	
	@Test
	public void testCharArea2() {
		char[][] grid = new char[][] {
				{'c', 'a', ' '},
				{'b', ' ', 'b'},
				{' ', ' ', 'a'}
			};
		
		CharGrid cg = new CharGrid(grid);
		
		assertEquals(6, cg.charArea('a'));
		assertEquals(3, cg.charArea('b'));
		assertEquals(1, cg.charArea('c'));
	}
	@Test
	public void testCharArea3() {
		char[][] grid = new char[][] {
				{' ', 'a', ' '},
				{'$', ' ', '$'},
				{' ', ' ', 'a'}
		};

		CharGrid cg = new CharGrid(grid);

		assertEquals(9, cg.charArea(' '));
		assertEquals(0, cg.charArea('l'));
		assertEquals(3, cg.charArea('$'));
	}
	
	@Test
	public void testcountPlus1(){
		char[][] grid = new char[][] {
				{' ', ' ', 'p',' ',' ',' ',' ',' ',' ',},
				{' ', ' ', 'p',' ',' ',' ',' ','x',' ',},
				{'p', 'p', 'p','p','p',' ','x','x','x',},
				{' ', ' ', 'p',' ',' ','y',' ','x',' ',},
				{' ', ' ', 'p',' ','y','y','y',' ',' ',},
				{'z', 'z', 'z','z','z','y','z','z','z',},
				{' ', ' ', 'x','x',' ','y',' ',' ',' ',},
		};
		CharGrid cg = new CharGrid(grid);
		assertEquals(2, cg.countPlus());
	}
	@Test
	public void testcountPlus2(){
		char[][] grid = new char[][] {
				{' ', ' ', 'p',' ',' ','a',' ',' ',' ',},
				{' ', ' ', 'p',' ','a','a','a','x',' ',},
				{'p', 'p', 'p','p','p','a','x','x','x',},
				{' ', ' ', 'p',' ',' ','y',' ','x',' ',},
				{' ', 'z', 'p',' ','y','y','y',' ',' ',},
				{'z', 'z', 'z',' ','z','y','z','z','z',},
				{' ', 'z', 'x','x',' ',' ',' ',' ',' ',},
		};
		CharGrid cg = new CharGrid(grid);
		assertEquals(5, cg.countPlus());
	}
	@Test
	public void testcountPlus3(){
		char[][] grid = new char[][] {
				{' ', 'p', 'p',' ',' ','a',' ',' ',' ',},
				{'p', 'p', 'p',' ','a',' ','a','x',' ',},
				{'p', 'p', 'p','p','p','a','x','x','x',},
				{' ', ' ', 'p',' ',' ','y',' ','x',' ',},
				{' ', 'z', 'p',' ','y','y','y',' ',' ',},
				{'z', 'z', 'z',' ','z','y','z','z','z',},
				{' ', 'z', 'x','x',' ','y',' ',' ',' ',},
		};
		CharGrid cg = new CharGrid(grid);
		assertEquals(4, cg.countPlus());
	}
	
}
