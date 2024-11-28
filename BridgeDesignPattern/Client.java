package BridgeDesignPattern;

public class Client {
    public static void main(String[] args)
    {
        Fish life=new Fish(new WaterBreed());
        life.breatheProcess();
    }
}
