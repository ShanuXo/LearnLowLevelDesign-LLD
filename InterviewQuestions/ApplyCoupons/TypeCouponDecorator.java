import java.util.*;

public class TypeCouponDecorator extends CouponsDecorator {

    Product product;
    int discountPercentage;

    ProductType type;

    static List<ProductType> eligibleProductTypes=new ArrayList<>();

    static {
        eligibleProductTypes.add(ProductType.ELECTRONIC_ITEMS);
        eligibleProductTypes.add(ProductType.FURNITURE);
    }
    
    TypeCouponDecorator(Product product,int percentage,ProductType type)
    {
        this.product=product;
        discountPercentage=percentage;
        this.type=type;
    }

    @Override
    public double getPrice()
    {
        double price=product.getPrice();

        if(eligibleProductTypes.contains(type))
        {
            return price - (price*discountPercentage)/100;
        }
        return price;
    }
    
}
