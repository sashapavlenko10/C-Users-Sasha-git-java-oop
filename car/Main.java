package car;

public class Main {
	 public static void main(String[] args) {
	   
	        Car car = new Car("car", 100, 10);
	   
	        car.turnOn();
	            
	        car.turnOff();
	            
	        System.out.println(car.getName() + ": " + car.getMileage()+"   "+ car.getPetrol());
	        
	    }
	}
