import static org.junit.Assert.*;

import org.junit.Test;

public class TestPlanetExplorer {

	@Test
	public void test_startingPosition_00() {
		PlanetExplorer test = new PlanetExplorer(100, 100, null);
		String start = test.executeCommand("");
		assertEquals("(0,0,N)", start);
	}
	
	@Test
	public void test_command_foward() {
		PlanetExplorer test = new PlanetExplorer(100, 100, null);
		String start = test.executeCommand("f");
		assertEquals("(0,1,N)", start);
	}
	@Test
	public void test_command_back() {
		PlanetExplorer test = new PlanetExplorer(100, 100, null);
		String start = test.executeCommand("b");
		assertEquals("(0,-1,N)", start);
	}
	@Test
	public void test_command_left() {
		PlanetExplorer test = new PlanetExplorer(100, 100, null);
		String start = test.executeCommand("l");
		assertEquals("(0,0,W)", start);
	}
	@Test
	public void test_command_right() {
		PlanetExplorer test = new PlanetExplorer(100, 100, null);
		String start = test.executeCommand("r");
		assertEquals("(0,0,E)", start);
	}
	@Test
	public void test_command_string() {
		PlanetExplorer test = new PlanetExplorer(100, 100, null);
		String start = test.executeCommand("ffrff");
		assertEquals("(2,2,E)", start);
	}
	@Test
	public void test_command_hitting_border() {
		PlanetExplorer test = new PlanetExplorer(10, 10, null);
		String start = test.executeCommand("fffffrfffffffffff");
		assertEquals("(10,5,E)", start);
	}
	
	
}
