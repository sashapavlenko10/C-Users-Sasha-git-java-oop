package car;

public class Engine {
    private double mileage;
    private boolean started;
    private double enginecapacity=10;
    
    public Engine (double mileage, double enginecapacity) {
        this.mileage = mileage;
        this.enginecapacity = enginecapacity;
    }
    
    public double getMileage() {
        return mileage;
    }
    
    public double getPetrol() {
        return enginecapacity;
    }
    
    public void addMileage(double mileage) {
        if (started)
            this.mileage += mileage;
    }
    
    public void petrCalc(double enginecapacity, double petrol) {
        if (started)
            this.enginecapacity -= petrol;
    }
    
    public boolean isStarted() {
        return started;
    }
    
    public void turnOn() {
        started = true;
    }
    
    public void turnOff() {
        started = false;
    }
}

