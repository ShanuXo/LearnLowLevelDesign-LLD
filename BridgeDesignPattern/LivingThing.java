package BridgeDesignPattern;

abstract public class LivingThing {
    BreatheImplementor breatheImplementor;

    public LivingThing(BreatheImplementor breatheImplementor)
    {
        this.breatheImplementor = breatheImplementor;
    }
    abstract public void breatheProcess();
}
