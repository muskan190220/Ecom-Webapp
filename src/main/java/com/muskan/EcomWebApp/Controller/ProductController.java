package com.muskan.EcomWebApp.Controller;

import org.springframework.web.bind.annotation.RestController;

import com.muskan.EcomWebApp.Model.Product;
import com.muskan.EcomWebApp.Service.ProductService;

import java.util.*;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;




@RestController
public class ProductController {

    @Autowired
    ProductService service;

    
    @GetMapping("/")
    public String greet()
    {
        return "This is my e-commerce web application";
    }


    @GetMapping("/about")
    public String about()
    {
        return "This is About us Page";
    }

    //Getting all products
    @GetMapping("/products")
    public List<Product> getproducts()
    {
        return service.getProducts();     
    }

    //Getting Product by Id
    @GetMapping("/products/{prodId}")
    public Product getProductbyId(@PathVariable int prodId)
    {
        return service.getProductbyId(prodId);
    }

    //Adding Product to list of products
    @PostMapping("/products")
    public void addProduct(@RequestBody Product prod)
    {
        //System.out.println(prod);
        service.addProduct(prod);
    }

    @PutMapping("/products")
    public void UpdateProduct(@RequestBody Product prod)
    {
        service.UpdateProduct(prod);
    }

    @DeleteMapping("/products/{prodId}")
    public void DeleteProduct(@PathVariable int prodId)
    {
        service.DeleteProduct(prodId);
    }
}
