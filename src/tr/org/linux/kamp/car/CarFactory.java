package tr.org.linux.kamp.car;

public class CarFactory {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car car = new Car();
		Car car1 = new Car();
		Car car2 = new Car(1,150,"BMW");
		
		car1.setBrand("Opel");
		car1.changeGear(2);
		car1.speedUp(200);
		
		System.out.println(car1.getBrand()  + car1.getGear() +  car1.getSpeed());
		
		
		System.out.println(car2.getBrand() + car2.getGear() +  car2.getSpeed());
		
		car2.changeGear(14);
		
		System.out.println(car2.getBrand() + car2.getGear() +  car2.getSpeed());
		
	}
	

}
