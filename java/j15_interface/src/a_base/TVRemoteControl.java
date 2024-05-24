package a_base;

// interface의 기능을 *구현*할 때는 implements[임플리먼츠] 인터페이스명 를 사용한다.
public class TVRemoteControl implements RemoteControl{

	int volume = 1;
	
	@Override
	public void turnOn() {
		System.out.println("TV를 켭니다.");
	}

	@Override
	public void turnOff() {
		System.out.println("TV를 끕니다.");
	}

	@Override
	public void setValue(int value) {
		if(value <= MAX_VALUE && value >= MIN_VALUE) {
			this.volume = value;
			System.out.println(volume+"으로 음량을 설정합니다.");
		}else{
			System.out.println("변경할 수 없습니다.");
		}// end if 
		
	}//end setValue method
	
}// end TVRemoteControl class
