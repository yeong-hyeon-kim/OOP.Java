package basic;

import inheritance.Airplane;
import polymorphism.Airliner;

public class Program {
	public static void main(String[] args) {
		Airplane Airplanes = new Airplane();
		Airplanes.Move();
		Airplanes.Load();

		Airliner A380 = new Airliner("KE 11", 400 , "대한항공");
		A380.GetFlightNumber();
		A380.GetHeadCount();
		A380.GetAirline();

		EngineSwitch Switch = new EngineSwitch();
		Switch.Start(A380);
		Switch.Stop(A380);
	}
}