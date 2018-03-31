import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import junit.framework.Assert;

class RemotecontrolTest {
	
	Remotecontrol rc = new Remotecontrol();

	@Test
	void switchon() {
		rc.pressPower();
		assertTrue(rc.myAC.power == true);
	}
	
	@Test
	void switchoff() {
		//printf("Implemented");
	}
	
	
}

