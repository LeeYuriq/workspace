package a_base;

//interface는 , 를 기준으로 여러 인터페이스 구현이 가능 == 다중 구현 가능 (implements를 여러개 할 수 있다.)
public class SmartTVRemoteControl implements RemoteControl, Searchable {

	int volume = 1;
	int channel = 10;
	
	// Searchable
	@Override
	public void search(String word) {
		System.out.println(word+" 로 검색합니다.");
	}

	//RemoteControl
	@Override
	public void turnOn() {
		System.out.println("스마트 TV를 켭니다.");
	}

	@Override
	public void turnOff() {
		System.out.println("스마트 TV를 끕니다.");
	}

	@Override
	public void setValue(int value) {
		this.volume = value;
		System.out.println("스마트 TV의 볼륨을 조절합니다 - "+volume);
	}
	
	public void setChannel(int channel) {
		if(channel < Searchable.MIN_VALUE) {
			this.channel = Searchable.MAX_VALUE;
		}else if(channel > Searchable.MAX_VALUE){
			this.channel = Searchable.MIN_VALUE;
		}else{
			this.channel = channel;
		}// end if
	}// end setChannel method : SmartTV만의 메소드 
	
	
	
}//end SmartTVRemoteControl class
