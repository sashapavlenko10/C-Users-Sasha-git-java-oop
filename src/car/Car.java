package car;
public class Car {
    private String name;
    private Engine engine;  
    private double gaslTank=10;
    
    public Car(String name) {
        this.name = name;
        engine = new Engine(0, gaslTank);
    }
    
    public Car(String name, double mileage, double gaslTank) {
        this.name = name;
        engine = new Engine (mileage, gaslTank);
    }
    
    public String getName() {
        return name;
    }
    
    public double getMileage() {
        return engine.getMileage();
    }
    
    public double getPetrol() {
        return engine.getPetrol();
    }
    
     
    public void turnOn() {
        engine.turnOn();
    }
    
   
    public void turnOff() {
    	engine.turnOff();
    }
    
    
    public void start(int speed, double hours) {
        if (engine.isStarted()) { 
        	engine.addMileage(hours * speed);
        	engine.petrCalc(engine.getPetrol()*100 / (hours * speed ), gaslTank);
        }
    }
        

}