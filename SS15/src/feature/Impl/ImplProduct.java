package feature.Impl;

import entity.Product;
import feature.IGeneric.IProduct;

import java.util.ArrayList;
import java.util.List;

public class ImplProduct implements IProduct {
    public static List<Product> productList = new ArrayList<>();
    @Override
    public void addOrUpdate(Product product) {

    }

    @Override
    public void delete(String id) {

    }

    @Override
    public void findById(String id) {

    }
}
