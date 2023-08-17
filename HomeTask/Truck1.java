package HomeTask;

public class Truck1 extends Car implements SkillsСar, LightControl{

    public Truck1(String manufacter, String model, Color color, TypeCar bodyType, TypeFuel fuel,
            Transmission transmission, float engineCapacity, int quantityWheels) throws Exception {

        super(manufacter, model, color, bodyType, fuel, transmission, engineCapacity, quantityWheels);
        
    }

    @Override
    public void skill() {
        System.out.println("Skills:");
        System.out.println("Чистим улицу");
    }

    @Override
    public boolean ForLights() {
        return LightControl.super.ForLights();
    }
    
}




