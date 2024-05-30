package generic01_type;

public class BoxExample {

	public static void main(String[] args) {

		Apple apple = new Apple();
		AppleBox appleBox = new AppleBox();
		appleBox.setApple(apple);
		Apple result = appleBox.getApple();
		
		Watermelon watermelon = new Watermelon();
		WatermelonBox watermelonBox = new WatermelonBox();
		watermelonBox.setWatermelon(watermelon);
		Watermelon watermelon2 = watermelonBox.getWatermelon();
		
		Box orangeBox = new Box();
		Orange orange = new Orange();
		orangeBox.setFruit(orange);
	    
		Box appleObjBox = new Box();
		appleObjBox.setFruit(apple);
		appleObjBox.setFruit(watermelon);
		Object obj = appleObjBox.getFruit();
		if(obj instanceof Apple) {
			// 뭘 꺼내와야할지 모르니까 강제타입변환을 해줘야한다.
			Apple appleObj = (Apple)appleObjBox.getFruit();
			System.out.println("사과입니다.");
		}
		
		// ShowBox<Generic Type>
		ShowBox<Apple> showBox = new ShowBox<Apple>();
		showBox.setFruit(apple);
		Apple app = showBox.getFruit();
		
		ShowBox<Orange> orangeShowBox = new ShowBox<Orange>();
		orangeShowBox.setFruit(orange);
		Orange org = orangeShowBox.getFruit();
		
		
		
		
	}// end main method

}// end BoxExample class
