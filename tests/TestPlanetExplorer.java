import static org.junit.Assert.*;

import org.junit.Test;

public class TestPlanetExplorer {

	@Test
	public void test_startingPosition_00() {
		PlanetExplorer test = new PlanetExplorer(100, 100, null);
		String start = test.executeCommand(null);
		assertEquals("(0,0,N)", start);
	}
	
	@Test
	public void test_command_foward() {
		PlanetExplorer test = new PlanetExplorer(100, 100, null);
		String start = test.executeCommand("f");
		assertEquals("(0,1,N)", start);
	}
}
