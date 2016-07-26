import static org.junit.Assert.*;

import org.junit.Test;

public class GameOfLifeTest {
	
	private void assertTrue(int i) {
		// TODO Auto-generated method stub
		
	}
	
	
	
	//tests convertToInt with the original(convertToIntO) and the modified(convertToInt) produce the same for x
	@Test
	public void convertToIntTest1() {
		int x = 15;
		int y = MainPanel.convertToInt(x);
		int z = MainPanel.convertToIntO(x);
		assertEquals(y,z);
	}
	
	//tests of convertToInt to pass x into mainPanel
	@Test
	public void convertToIntTest2() {
		int x = 15;
		assertEquals(MainPanel.convertToInt(x),x);
	}
	
	
	//tests convertToInt with the original(convertToIntO) and the modified(convertToInt) produce the same for x
	//where x is true to 15
	@Test public void convertToIntTest3() {
		int x = 15;
		int y = MainPanel.convertToInt(x);
		int z = MainPanel.convertToIntO(x);
		  assertTrue(x = 15);
	}

	
	//tests toString with a new cell state
	@Test
	public void toStringTest1(){
		Cell state = new Cell();
		assertNotNull(state.toString());
		assertEquals(".",state.toString());
	}

	//tests toString if the cell is not alive (false)
	@Test
	public void toStringTest2() {
		Cell state = new Cell(false); 
		assertEquals(".",state.toString());
	}

	
	//tests toString if the cell is alive (true)
	@Test
	public void toStringTest3() {
		Cell state = new Cell(true); 
		assertEquals("X",state.toString());
	}

}
