package c5_compare;

public class Person implements Comparable<Person>{

	private	String name;
	private	int age;
	
	// 전체 필드값을 매개변수로 전달받는 생성자
	// toString() 추가
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}


	@Override
	public int compareTo(Person o) {
		// 양수 음수 0 
		// 양수 : or 0 이동 x
		// 음수 : 두 자리 변경
		//		    새로추가되는것 - 기존에 있던것 
		int result = this.age - o.age;
		System.out.println(this.age + " - " +o.age+ " = " + result);
		return result;
	}
		
	
	
}
