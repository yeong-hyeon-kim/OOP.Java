package encapsulation;

public interface IPower {
	// 인터페이스를 상속받는 클래스는 무조건 인터페이스 메서드를 실행할 수 있습니다.
	// 반드시 구현하도록 강제합니다.
	public void TrunOn();
	public void TrunOff();
}
