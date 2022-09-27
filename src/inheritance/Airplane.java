package inheritance;

import abstraction.Transportation;

public class Airplane extends Transportation{

	@Override
	public void Load() {
		System.out.println("비행기에 짐을 올립니다.");
	}

	@Override
	public void Move() {
		System.out.println("하늘에서 움직입니다.");
	}
}
