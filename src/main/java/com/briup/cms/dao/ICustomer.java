package com.briup.cms.dao;

import com.briup.cms.bean.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ICustomer extends JpaRepository <Customer,Integer>{
     public Customer findByName(String name);
}
