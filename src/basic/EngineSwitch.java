package basic;

import encapsulation.IPower;

public class EngineSwitch{
	public void Start(IPower Transportation) {
		Transportation.TrunOn();
	}

	public void Stop(IPower Transportation) {
		Transportation.TrunOff();
	}
}