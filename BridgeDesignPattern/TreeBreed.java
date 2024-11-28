package BridgeDesignPattern;

public class TreeBreed implements BreatheImplementor{
    @Override
    public void breathe()
    {
        System.out.println("Breathe through Leaves");
        System.out.println("Inhale Carbon Dioxide");
        System.out.println("Exhale Oxygen");
    }  
}
