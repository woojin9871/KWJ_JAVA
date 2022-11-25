package Day06.Ex03_Car;

public class CarEx {
	public static void main(String[] args) {
		// 객체생성
		Car car = new Car();
		car.model = "제네시스";
		//car.speed = 100;
		// private 변수라서, speed에만 접근 가능
		car.setSpeed(100);
		
		System.out.println("model : " + car.getMadel());
		System.out.println("speed : " + car.getSpeed());
	
	}
}
