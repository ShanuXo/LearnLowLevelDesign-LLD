public class PercentageDecorator extends CouponsDecorator{
    Product product;
    int discountPercentage;

    PercentageDecorator(Product product,int discountPercentage)
    {
        this.product=product;
        this.discountPercentage=discountPercentage;
    } 
    
    @Override
    public double getPrice()
    {
        double price=product.getPrice();
        return price - (price * discountPercentage)/100;
    }
}
