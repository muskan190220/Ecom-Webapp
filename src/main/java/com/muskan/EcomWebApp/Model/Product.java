package com.muskan.EcomWebApp.Model;


import org.springframework.stereotype.Component;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;


@Component
@Entity
public class Product {

    @Id
    private int prodId;
    private String prodName;
    private int price;

    //Constructors and getter and setter methods for initializing and accessing the variables
    public Product()
    {

    }
    
    public Product(int prodId, String prodName, int price)
    {
        this.prodId = prodId;
        this.prodName = prodName;
        this.price = price;
    }

        public int getprodId()
        {
            return prodId;
        }
        public void setprodId(int prodId)
        {
            this.prodId = prodId;
        }
        public String getprodName()
        {
            return prodName;
        }
        public void setprodName(String prodName)
        {
            this.prodName = prodName;
        }
        public int getprice()
        {
            return price;
        }
        public void setprice(int price)
        {
            this.price = price;
        }

        //toString method for printing the object on terminal
        /*@Override
        public String toString()
        {
            return "Product [prodId=" + prodId + ", prodName=" + prodName + ", price=" + price + "]";
        }*/

}
