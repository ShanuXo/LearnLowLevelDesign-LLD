package FlyWeightDesignPattern;

public class Roboticdog implements IRobot{
    private String type;
    private Sprites body;// small 2d bitmap (graphic element)

    Roboticdog(String type, Sprites body)
    {
        this.type = type;
        this.body = body;
    }

    //Getters
    public String getType() {
        return type;
    }
    public Sprites getBody() {
        return body;
    }

    @Override
    public void display(int x,int y)
    {
        System.out.println("Robotic Dog Sprites object");
        System.out.println("X and Y coordinate to render the image");
    }
}
