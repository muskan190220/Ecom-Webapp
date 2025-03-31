package com.muskan.EcomWebApp.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.muskan.EcomWebApp.Model.Product;
import com.muskan.EcomWebApp.Repository.ProductRepository;

@Service
public class ProductService {

    @Autowired
    ProductRepository repo;

    //List of products
    //public List<Product> products = new ArrayList<Product>(Arrays.asList(
            //new Product(1, "Laptop", 50000),
            //new Product(2, "Mobile", 20000),
            //new Product(3, "Tablet", 10000)
    //));

    //Getting all products
    public List<Product> getProducts()
    {
        return repo.findAll();
    }

    //Getting Product by Id
    public Product getProductbyId(int prodId)
    {
        return repo.findById(prodId).orElse(new Product(prodId, null, prodId));
    }

    //Adding Product to list of products
    public void addProduct(Product prod)
    {
        repo.save(prod);
    }

    public void UpdateProduct(Product prod)
    {
        repo.save(prod);
    } 

    public void DeleteProduct(int prodId)
    {
        repo.deleteById(prodId);
    }


}
