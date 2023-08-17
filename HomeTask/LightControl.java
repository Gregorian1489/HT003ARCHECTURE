package HomeTask;

public interface LightControl {
    
    public default boolean turnLights(){
        return true;
    }
    public default boolean ForLights(){
        return true;
    }
}
