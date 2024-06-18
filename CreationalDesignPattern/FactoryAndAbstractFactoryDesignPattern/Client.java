package CreationalDesignPattern.FactoryAndAbstractFactoryDesignPattern;

public class Client {
    public static void main(String[] args) {
        {
            ShapeFactory shapeFactory = new ShapeFactory();
            Shape shape=shapeFactory.getShape("CIRCLE");
            shape.draw();
        }
    }
}
