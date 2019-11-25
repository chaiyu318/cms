package com.briup.cms.dao;

import com.briup.cms.bean.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public class ICustomerDao extends JpaRepository<Customer,Integer> {

}
