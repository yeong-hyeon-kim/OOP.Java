package abstraction;

import encapsulation.IPower;

public class AirplaneFactory {
	private IPower iPower;

	public AirplaneFactory(IPower iPower) {
		this.iPower = iPower;
	}
}
