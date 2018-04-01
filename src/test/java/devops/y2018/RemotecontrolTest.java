package devops.y2018;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class RemotecontrolTest {
	
	Remotecontrol rc = new Remotecontrol();

	@Test
	public void switchon() {
		rc.pressPower();
		assertTrue(rc.myAC.power == true);
	}
	
	@Test
	public void switchoff() {
		System.out.println("Implemented");
	}
	
	
}

