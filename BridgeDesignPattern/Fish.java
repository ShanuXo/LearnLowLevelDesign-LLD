package BridgeDesignPattern;

public class Fish extends LivingThing{
    BreatheImplementor implementor;
    public Fish(BreatheImplementor implementor)
    {
        super(implementor);
    }
    
    @Override
    public void breatheProcess() {
        implementor.breathe();
    }
}
