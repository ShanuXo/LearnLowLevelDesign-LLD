package BridgeDesignPattern;

public class Dog extends LivingThing {
    BreatheImplementor implementor;
    public Dog(BreatheImplementor implementor)
    {
        super(implementor);
    }
    @Override
    public void breatheProcess()
    {
        implementor.breathe();
    }
}
