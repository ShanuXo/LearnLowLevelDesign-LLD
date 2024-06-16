package StructuralDesignPattern.FacadeDesignPattern.System;
import StructuralDesignPattern.FacadeDesignPattern.Products.Product;

public class ProductDAO {
    public Product getProduct(int productID)
    {
        return new Product();
    }
}
