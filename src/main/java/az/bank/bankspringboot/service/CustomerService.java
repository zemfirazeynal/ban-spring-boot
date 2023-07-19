package az.bank.bankspringboot.service;

import az.bank.bankspringboot.model.MyCustomer;

import java.util.Set;

public interface CustomerService {

   MyCustomer create(MyCustomer customer);

   Set <MyCustomer> customers ();

   void delete(Long id);

   MyCustomer update(Long id,MyCustomer customer);

    
}
