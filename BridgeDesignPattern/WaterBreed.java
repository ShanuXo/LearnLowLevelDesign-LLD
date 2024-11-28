package BridgeDesignPattern;

public class WaterBreed implements BreatheImplementor {
    @Override
    public void breathe()
    {
        System.out.println("Breathe through Gills");
        System.out.println("Inhale oxygen from Water");
        System.out.println("Exhale carbon Dioxide");
    }  
}
