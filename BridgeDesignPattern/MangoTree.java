package BridgeDesignPattern;

public class MangoTree extends LivingThing{
    BreatheImplementor implementor;
    public MangoTree(BreatheImplementor implementor)
    {
        super(implementor);
    }

    @Override
    public void breatheProcess() {
        implementor.breathe();
    }
}
