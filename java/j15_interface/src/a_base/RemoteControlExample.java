package a_base;

/**
 * interface test class
 * 
 */
public class RemoteControlExample {

	public static void main(String[] args) {
		int maxValue = RemoteControl.MAX_VALUE;
		System.out.println(maxValue);
		
		// 인터페이스의 모든 field는 public static final
		int minValue = RemoteControl.MIN_VALUE;
		System.out.println(minValue);
		//상수로 등록되어있으니까, 임의로 수정할 수 없다.
		//RemoteControl.MIN_VALUE = 1;
		
		// RemoteControl는 인터페이스라서(실체화된 기능이없다.) 객체를 생성할 수 없다.
		//변수를 통해 해당 기능을 사용할 수 있다.
		RemoteControl tvRemote;  // = new RemoteControl();
		tvRemote = new TVRemoteControl();
		tvRemote.turnOn();
		tvRemote.setValue(11);
		tvRemote.turnOff();
		
		RemoteControl radioRemote = new RadioRemoteControl();
		radioRemote.turnOn();
		radioRemote.setValue(99);
		radioRemote.turnOff();
		
		//스마트 TV
		RemoteControl smartTV = new SmartTVRemoteControl();
		smartTV.turnOn();
		smartTV.setValue(15);
		
		//타입을 Searchable로 변경한다.
		Searchable searchTV = (Searchable)smartTV;
		searchTV.search("자바");
		
		// 변수에 저장된 객체가 해당 타입으로 변경가능한 객체인지 인스턴스 확인 
		// 객체 타입 비교 연산 instanceof 
		
		// java 17 이전버전 까지
		/*
		if(searchTV instanceof SmartTVRemoteControl) {
			SmartTVRemoteControl stc = (SmartTVRemoteControl)searchTV;
		 */
		
		// java 17 이후
		// 해당되는 타입으로 변경가능할 때 그 타입을 가진 변수를 만들 수 있다.
		if(searchTV instanceof SmartTVRemoteControl stc) {
			//해당되는 타입으로 객체를 만들 수 있다고 true를 반환할 때
			stc.search("자바!");
			stc.setChannel(1000);
			stc.turnOff();

		}//end if

		
	}
	
}
