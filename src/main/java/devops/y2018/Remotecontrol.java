package devops.y2018;


public class Remotecontrol {

	AC myAC = new AC();

	public void pressPower() {
		myAC.power = !myAC.power;
	}

}
