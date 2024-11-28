package BridgeDesignPattern;

public class AirBreed implements BreatheImplementor{
    @Override
    public void breathe()
    {
        System.out.println("Breathe through Narse");
        System.out.println("Inhale oxygen from Air");
        System.out.println("Exhale carbon Dioxide");
    }  
}
