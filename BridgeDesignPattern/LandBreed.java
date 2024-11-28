package BridgeDesignPattern;

public class LandBreed implements BreatheImplementor {
    @Override
    public void breathe()
    {
        System.out.println("Breathe through Nose");
        System.out.println("Inhale oxygen from Air");
        System.out.println("Exhale carbon Dioxide");
    }    
}
