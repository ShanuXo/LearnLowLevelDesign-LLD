package BridgeDesignPattern;

public class Bird extends LivingThing{
    BreatheImplementor implementor;
    public Bird(BreatheImplementor implementor)
    {
        super(implementor);
    }

    @Override
    public void breatheProcess() {
        implementor.breathe();
    }
}
