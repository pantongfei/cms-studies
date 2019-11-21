package com.briup.cms.web.controller;

import com.briup.cms.bean.Customer;
import com.briup.cms.dao.ICustomer;
import com.briup.cms.service.ICustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomerController {
    @Autowired
    //ICustomerService customerService;
    private  ICustomer customer;

    //@GetMapping("/showById/{id}")
    @GetMapping("/showByName/{name}")
    public String CustomerByName(String name){
        System.out.println("Customer,,asdasdasdas,");
        //Customer byName = customerService.findByName(name);
        Customer byName = customer.findByName(name);
        System.out.println(byName+"Customer,,,");
        return  "Customer";
    }
    @GetMapping("/saveCustomer")
    public String SaveCustomer(){
        Customer customer1=new Customer("z",123);
        customer.save(customer1);
        return  "SaveCustmer";
    }

}
