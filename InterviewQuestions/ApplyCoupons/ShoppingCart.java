import java.util.*;

public class ShoppingCart {
    List<Product> productList;

    public ShoppingCart() {
        productList = new ArrayList<>();
    }

    public void addToCart(Product product)
    {
        Product productWithDiscount=new TypeCouponDecorator(new PercentageDecorator(product,10), 3, product.getType());
        productList.add(productWithDiscount);
    }

    public int getTotalPrice()
    {
        int totalPrice=0;
        for(Product product:productList)
        {
            totalPrice+=product.getPrice();
        }
        return totalPrice;
    }

}
