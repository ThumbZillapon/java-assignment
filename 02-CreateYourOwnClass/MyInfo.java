class Car {
    private String brand;
    private int speed;
    
    public void setBrand(String newBrand) {
        this.brand = newBrand;
    }
    
    public void setSpeed(int newSpeed) {
        this.speed = newSpeed;
    }
    
    public String getBrand() {
        return this.brand;
    }
    
    public int getSpeed() {
        return this.speed;
    }
    
    public void displayInfo() {
        System.out.println("Car brand: " + brand + ", Speed: " + speed + " km/h");
    }
}

public class MyInfo {
    public static void main(String[] args) {
        Car myCar = new Car();
        myCar.setBrand("Toyota");
        myCar.setSpeed(120);
        myCar.displayInfo();
    }
}
