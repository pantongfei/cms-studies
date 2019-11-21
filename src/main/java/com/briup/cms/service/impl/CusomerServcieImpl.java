package com.briup.cms.service.impl;

import com.briup.cms.bean.Customer;
import com.briup.cms.dao.ICustomer;
import com.briup.cms.service.ICustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CusomerServcieImpl implements ICustomerService {
    @Autowired
   private ICustomer iCustomer;

    @Override
    public Customer findByName(String name) {
        Customer customer = iCustomer.findByName(name);
        return customer;
    }
}
