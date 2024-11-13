public class Main {
    public static void main(String[] args)
    {
        Product item1=new Item1("MOBILE",10000,ProductType.ELECTRONIC_ITEMS);
        Product item2=new Item2("SOFA",20000,ProductType.FURNITURE);


        ShoppingCart cart=new ShoppingCart();
        cart.addToCart(item1);
        cart.addToCart(item2);


        System.out.println("Hurray ! Total Price after Discount " + cart.getTotalPrice());
    }
}