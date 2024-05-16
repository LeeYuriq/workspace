package a6_field_method;

import a5_field_method.A;

public class C {

		A a = new A();
		
		public C() {
			a.field1 = 1000;		//public
			// a.field2 = 100;		//default : 다른 패키지, 호출X
			// a.field3 = 10;		//private : 다른 클래스, 호출X
			
			a.publicMethod();
			//a.defaultMethod();
			// a.privateMethod();
			
		}
		
}
