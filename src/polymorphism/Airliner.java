package polymorphism;

import encapsulation.IPower;
import inheritance.Airplane;

public class Airliner extends Airplane implements IPower {
	private String FlightNumber;
	private Integer Headcount;
	private String AirLine;

	public Airliner(String flightNumber, Integer headcount, String airLine) {
		FlightNumber = flightNumber;
		Headcount = headcount;
		AirLine = airLine;
	}

	public void GetAirline() {
		System.out.println(AirLine);
	}

	public void GetFlightNumber() {
		System.out.println(FlightNumber);
	}

	public void GetHeadCount() {
		System.out.println(Headcount);
	}

	@Override
	public void TrunOn() {
		System.out.println(FlightNumber + " 엔진 작동합니다." );
	}

	@Override
	public void TrunOff() {
		System.out.println(FlightNumber + " 엔진 정지합니다." );
	}
}
