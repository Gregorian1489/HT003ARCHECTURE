package HomeTask;

import java.util.ArrayList;
import java.util.List;

import javax.sound.midi.Track;

public class Main {

    public static void main(String[] args) throws Exception {

        Truck1 Kamaz = new Truck1("KAZ", "Last", Color.White, TypeCar.Truck, TypeFuel.Gasoline, Transmission.MT, (float) 8.00, 8);

        System.out.printf(Kamaz.getManufacter() + " " + Kamaz.getModel() + " " + Kamaz.getColor()+ " " + Kamaz.getBodyType()+ " " + Kamaz.getFuel());
        System.out.println();
        Kamaz.skill();
        System.out.println("Противотуманки: " + Kamaz.ForLights());
        
    }
    
}
