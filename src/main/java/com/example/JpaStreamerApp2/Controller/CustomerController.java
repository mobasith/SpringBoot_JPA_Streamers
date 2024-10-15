package com.example.JpaStreamerApp2.Controller;


import com.example.JpaStreamerApp2.Service.CustomerService;
import com.example.JpaStreamerApp2.model.Customer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/v1")
public class CustomerController {
    @Autowired
    private CustomerService service;


    @PostMapping("/save")
    public List<Customer> saveCustomer(@RequestBody List<Customer> customer){
        return service.saveCustomer(customer);
    }

    @GetMapping("/groupByCity")
    public Map<String, List<Customer>> groupbyCustomerByCity(){
        return service.groupbyCustomerByCity();
    }

    @GetMapping("/groupByProduct")
    public Map<String, List<Customer>> groupbyCustomerByProduct(){
        return service.groupbyCustomerByProduct();
    }

    @GetMapping("/findall")
    public List<Customer> groupbyCustomerProduct(){
        return service.getAll();
    }


    @GetMapping("/ProductSales/{prod}")
    public Map<String, Long> countProductSales(@PathVariable("prod") String prod) {
        return service.countProductBySales(prod);
    }

    @GetMapping("/countByGender")
    public Map<String, Long> countCustomerByGender() {
        return service.countCustomerByGender();
    }
}