package com.doherty.productmicroservice.controllers;

import com.doherty.productmicroservice.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class ProductController {

    @Autowired
    ProductService productService;

    @RequestMapping(value = "/product/{id}/name", method = RequestMethod.GET)
    public String getName(@PathVariable Long id) {
        return productService.getName(id);
    }

    @RequestMapping(value = "/product/{id}/price", method = RequestMethod.GET)
    public Double getPrice(@PathVariable Long id) {
        return productService.getPrice(id);
    }

}
