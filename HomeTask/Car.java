package HomeTask;

public abstract class Car {

    private String manufacter;
    private String model;
    private Color color;
    private TypeCar bodyType;
    private TypeFuel fuel;
    private Transmission transmission;
    private float engineCapacity;
    private int quantityWheels;

    public Car (String manufacter, String model, Color color, TypeCar bodyType, 
    TypeFuel fuel, Transmission transmission, float engineCapacity, int quantityWheels) throws Exception{
        this.manufacter = manufacter;
        this.model = model;
        this.color = color;
        this.bodyType =bodyType;
        this.fuel = fuel;
        this.transmission = transmission;
        this.engineCapacity = engineCapacity;

        if (quantityWheels > 2){
        this.quantityWheels = quantityWheels;
        } else throw new Exception("Это не велосипед и не моноколесо!");
    }
    
    public void movement(){
    }
    public void service(){
    }
    public void gearShifting(){
    }
    
    public boolean turnWiper(){
        return true;
    }

    public String getManufacter() {
        return manufacter;
    }

    public void setManufacter(String manufacter) {
        this.manufacter = manufacter;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public TypeCar getBodyType() {
        return bodyType;
    }

    public void setBodyType(TypeCar bodyType) {
        this.bodyType = bodyType;
    }

    public TypeFuel getFuel() {
        return fuel;
    }

    public void setFuel(TypeFuel fuel) {
        this.fuel = fuel;
    }

    public Transmission getTransmission() {
        return transmission;
    }

    public void setTransmission(Transmission transmission) {
        this.transmission = transmission;
    }

    public float getEngineCapacity() {
        return engineCapacity;
    }

    public void setEngineCapacity(float engineCapacity) {
        this.engineCapacity = engineCapacity;
    }

    public int getQuantityWheels() {
        return quantityWheels;
    }

    public void setQuantityWheels(int quantityWheels) {
        this.quantityWheels = quantityWheels;
    }    
    
}
